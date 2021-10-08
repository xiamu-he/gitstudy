package com.qzx.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qzx.springboot.mapper")
public class Springboot006Mybatis2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot006Mybatis2Application.class, args);
	}

}
