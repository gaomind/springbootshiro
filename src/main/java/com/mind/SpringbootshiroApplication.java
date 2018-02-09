package com.mind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.mind.dao")
@SpringBootApplication
public class SpringbootshiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootshiroApplication.class, args);
	}



}
