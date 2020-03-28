package org.sid.seviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SeviceConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeviceConfigApplication.class, args);
	}

}
