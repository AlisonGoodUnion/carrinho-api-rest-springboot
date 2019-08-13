package com.example.carrinho.carrinhoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CarrinhoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrinhoApiApplication.class, args);
	}
}
