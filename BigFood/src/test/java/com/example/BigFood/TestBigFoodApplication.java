package com.example.BigFood;

import org.springframework.boot.SpringApplication;

public class TestBigFoodApplication {

	public static void main(String[] args) {
		SpringApplication.from(BigFoodApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
