package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.ArtisteRepository;
import com.example.demo.repository.FilmRepository;

@SpringBootApplication
public class Tp5Application implements CommandLineRunner {

	@Autowired
	ArtisteRepository artisteRepository;
	
	@Autowired
	FilmRepository filmRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
