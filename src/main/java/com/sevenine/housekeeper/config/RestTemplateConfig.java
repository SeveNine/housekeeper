package com.sevenine.housekeeper.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate配置
 * created by xu-jp on 2020/6/30
 **/
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory) {
        RestTemplate restTemplate = new RestTemplate(factory);
//        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.ISO_8859_1));
        return restTemplate;
    }

    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        // 传递数据的超时时间
        factory.setReadTimeout(9000);
        // 建立连接的超时时间
        factory.setConnectTimeout(9000);
        return factory;
    }

}

