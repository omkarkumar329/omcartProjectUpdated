package com.omcart.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan({"com.omcart.common"})

public class OmCartBackEndApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(OmCartBackEndApplication.class, args);

	}

}
