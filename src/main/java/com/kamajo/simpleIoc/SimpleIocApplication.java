package com.kamajo.simpleIoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleIocApplication.class, args);
        System.out.println("HelloWorld, from spring boot");

    }

}
