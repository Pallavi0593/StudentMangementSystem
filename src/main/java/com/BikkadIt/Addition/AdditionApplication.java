package com.BikkadIt.Addition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdditionApplication.class, args);
		
		Addition add=new Addition();
		int c=add.sum(10, 20);
		System.out.println("Addition is:=" +c);
	}

}
