package com.qzx.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.beans.Transient;

@SpringBootApplication
@MapperScan(basePackages = "com.qzx.springboot.mapper")
@EnableTransactionManagement
public class Springboot007TransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot007TransactionApplication.class, args);
	}

}
