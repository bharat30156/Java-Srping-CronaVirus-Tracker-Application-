package com.Bharat.CronaVirusTrackerApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronvaVirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronvaVirusTrackerApplication.class, args);
	}

}
