package com.marketram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ScalpingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScalpingApplication.class, args);
	}
}
