package com.zomeli.quarkus.kafka.streams.cofig;

import io.quarkus.runtime.annotations.StaticInitSafe;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Getter
@ApplicationScoped
public class ConfigSource {

  @StaticInitSafe
  @ConfigProperty(name="app.application.id")
  public String appID;

  @StaticInitSafe
  @ConfigProperty(name="kafka.bootstrap.servers")
  public String bootstrapServer;

  @StaticInitSafe
  @ConfigProperty(name="kafka.topic.in.name")
  public String inTopic;

  @StaticInitSafe
  @ConfigProperty(name="kafka.topic.out.name")
  public String outTopic;

}
