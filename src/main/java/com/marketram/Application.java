package com.marketram;

import com.marketram.config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan
//@EnableJpaRepositories(basePackages = {"com.marketram.repositories"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(
				SpringApplication.run(new Class<?>[]
						{Application.class, JpaConfig.class}, args));
	}
}
