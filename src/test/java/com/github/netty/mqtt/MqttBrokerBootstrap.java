package com.github.netty.mqtt;

import com.github.netty.springboot.EnableNettyEmbedded;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

@EnableNettyEmbedded
@SpringBootApplication
public class MqttBrokerBootstrap {
    private static final URL CONFIG_URL = MqttBrokerBootstrap.class.getResource(
            "/mqtt/application.yaml");

    public static void main(String[] args) {
        System.getProperties().put("spring.config.location",CONFIG_URL);
        SpringApplication.run(MqttBrokerBootstrap.class,args);
    }

}
