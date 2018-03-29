package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}
	
	public static class GreetingTask implements CommandLineRunner{

		@Override
		public void run(String... args) throws Exception {
			System.out.println("Message: " + "Hello!");
		}
		
	}
}
