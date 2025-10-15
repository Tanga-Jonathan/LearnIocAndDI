package com.kamajo.simpleIoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleIocApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SimpleIocApplication.class, args);
        //System.out.println("HelloWorld, from spring boot");

//        Alien alien = new Alien();
//        alien.code();

      ApplicationContext context =  SpringApplication.run(SimpleIocApplication.class, args);
        Alien alien = context.getBean(Alien.class);
        alien.code();

    }

}
