package com.zomeli.quarkus.kafka.streams.topology;

import com.google.gson.Gson;
import com.zomeli.quarkus.kafka.streams.cofig.ConfigSource;
import com.zomeli.quarkus.kafka.streams.model.NotifyTransactionEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.Arrays;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.jboss.logmanager.Logger;

@ApplicationScoped
public class MonitorPreventionTopology {
  private static final Logger log = Logger.getLogger(String.valueOf(MonitorPreventionTopology.class));

  @Inject
  ConfigSource configSource;

  public Topology splitMessage(){
//    Pattern pattern = Pattern.compile("\\W+", Pattern.UNICODE_CHARACTER_CLASS);
    StreamsBuilder builder = new StreamsBuilder();

    KStream<String, String> source = builder.stream(
            configSource.getInTopic(), Consumed.with(Serdes.String(), Serdes.String()))
            .peek((k,v) -> log.info("Message input: " + v));

    source.flatMapValues(value -> Arrays.asList(value.split("\\W+")))
            .peek((k,v) -> log.info("Message Split output:" + v))
            .to(configSource.getOutTopic());

    return builder.build();
  }


  public Topology filterAndUpperCase(){

    StreamsBuilder builder = new StreamsBuilder();

    KStream<String, String> kStream = builder.stream(
            configSource.getInTopic(), Consumed.with(Serdes.String(), Serdes.String()))
        .peek((k,v) -> log.info("Message input: " + v));


    kStream.filter((key, value) -> value.startsWith("Message_"))
        .mapValues((k, v) -> v.toUpperCase())
        .peek((k, v) -> System.out.println("Key: " + k + " Value: " + v))
        .to(configSource.getOutTopic(), Produced.with(Serdes.String(), Serdes.String()));

    return builder.build();
  }

  public Topology topology(){

    final StreamsBuilder builder = new StreamsBuilder();
//    NotifyTransactionEntity notifyEntity = new Gson().fromJson(sqsQueue, NotifyTransactionEntity.class);

    Serde<String> stringSerde = Serdes.String();
    KStream<String, String> stream = builder
        .stream(configSource.getInTopic(), Consumed.with(stringSerde, stringSerde))
        .peek((k,v) -> log.info("Notify Transaction: " + v));
    stream
        .mapValues(value -> new Gson().fromJson(String.valueOf(value), NotifyTransactionEntity.class))
        .mapValues(value -> value.getAdditionalData().getBusinessEvent().toString())
        .to(configSource.getOutTopic(), Produced.with(stringSerde, stringSerde));

    return builder.build();
  }

}
