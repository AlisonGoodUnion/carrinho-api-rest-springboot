package com.example.carrinho.carrinhoapi.config;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {
    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
}
