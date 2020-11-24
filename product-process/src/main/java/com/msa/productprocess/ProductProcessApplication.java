package com.msa.productprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductProcessApplication.class, args);
	}

}
