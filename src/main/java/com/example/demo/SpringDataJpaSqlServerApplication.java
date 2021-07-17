package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaSqlServerApplication {

	@PersistenceContext
	EntityManager enitityManager;
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringDataJpaSqlServerApplication.class, args);
		
	}
	
	
}
