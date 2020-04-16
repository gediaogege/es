package com.example.es.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

/**
 * @author qinmintao
 * @description:
 * @date 2020-04-14 11:16
 */
@Configuration
public class EsConfig {
    @Bean
    RestHighLevelClient client() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("192.168.3.195:9200").withSocketTimeout(50000)
                .build();
        return RestClients.create(clientConfiguration).rest();
    }

}
