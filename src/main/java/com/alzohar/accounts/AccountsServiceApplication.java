package com.alzohar.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.alzohar.interceptor.repository.UserRepository;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"com.alzohar.interceptor", "com.alzohar.accounts"})
@EntityScan("com.alzohar.interceptor.model")
@EnableJpaRepositories(basePackages = "com.alzohar.interceptor.repository")
public class AccountsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsServiceApplication.class, args);
	}

}
