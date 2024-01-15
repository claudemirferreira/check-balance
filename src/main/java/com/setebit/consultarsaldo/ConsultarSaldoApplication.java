package com.setebit.consultarsaldo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.setebit.consultarsaldo")
public class ConsultarSaldoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultarSaldoApplication.class, args);
	}

}
