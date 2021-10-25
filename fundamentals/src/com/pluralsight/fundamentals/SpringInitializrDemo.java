package com.pluralsight.fundamentals;
//Created by using the start.spring.io website and populating the information for you in a zip

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // This annotation defines it as spring app and adds this class as a configuration
//@EnableAutoConfiguration tells SpringBoot to configure the beans
//@ComponentScan tells Spring Boot to scan current package and subpackages
public class SpringInitializrDemo {

	public static void main(String[] args) {
		SpringApplication.run(SpringInitializrDemo.class, args);
	}

}
