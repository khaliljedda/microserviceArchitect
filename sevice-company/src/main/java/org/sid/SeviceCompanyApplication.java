package org.sid;

import java.util.stream.Stream;

import org.sid.dao.CompanyRepository;
import org.sid.entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeviceCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeviceCompanyApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cn->{
				companyRepository.save(new Company(cn,100+Math.random()*900));
			});
			companyRepository.findAll().forEach(System.out::println);	};
	}

}
