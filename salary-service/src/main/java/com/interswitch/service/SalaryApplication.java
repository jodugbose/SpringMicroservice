package com.interswitch.service;

import com.interswitch.service.model.Salary;
import com.interswitch.service.repository.SalaryRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info =
	@Info(title = "Department API", version = "1.0", description = "Documentation Salary API v1.0")
)
public class SalaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalaryApplication.class, args);
	}
	
	@Bean
	SalaryRepository repository() {
		SalaryRepository repository = new SalaryRepository();
		repository.add(new Salary( 1L,45000.00,"23/10/2011"));
		repository.add(new Salary( 2L,56000.00,"19/10/2017"));
		return repository;
	}
	
}
