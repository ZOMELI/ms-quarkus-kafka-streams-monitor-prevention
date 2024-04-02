package com.zomeli.quarkus.kafka.streams;

import com.zomeli.quarkus.kafka.streams.cofig.ConfigSource;
import com.zomeli.quarkus.kafka.streams.topology.MonitorPreventionTopology;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.jboss.logmanager.Logger;

@QuarkusMain
public class MonitorStreamsApplication implements QuarkusApplication {

  @Inject
  ConfigSource configSource;

  @Inject
  MonitorPreventionTopology monitorPreventionTopology;

  @Override
  public int run(String... args) throws Exception {

    Properties props = new Properties();
    props.put(StreamsConfig.APPLICATION_ID_CONFIG, configSource.getAppID());
    props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, configSource.getBootstrapServer());

    final StreamsBuilder builder = new StreamsBuilder();

//    monitorTransferTopology.splitMessage(builder);
//    monitorTransferTopology.filterAndUpperCase(builder);

    monitorPreventionTopology.topology(builder);


    final Topology topology = builder.build();
    final KafkaStreams streams = new KafkaStreams(topology, props);
    final CountDownLatch latch = new CountDownLatch(1);

    Runtime.getRuntime().addShutdownHook(new Thread("streams-shutdown-hook") {
      @Override
      public void run() {
        streams.close();
        latch.countDown();
      }
    });

    try {
      streams.start();
      latch.await();

    } catch (Throwable e) {
      return 1;
    }

    return 0;
  }

}