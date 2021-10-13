package com.qzx.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qzx.springboot.mapper")
public class Springboot013LogbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot013LogbackApplication.class, args);
	}

}
