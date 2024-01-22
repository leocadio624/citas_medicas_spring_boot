package com.example.appConexion;


import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springframework.beans.factory.annotation.Autowired;

import com.example.appConexion.models.Paciente;

import com.example.appConexion.config.EjemploConfig;


@SpringBootApplication
public class AppConexionApplication {







	public static void main(String[] args) {

		SpringApplication.run(AppConexionApplication.class, args);



	}
	/*
	@Bean
	CommandLineRunner commandLineRunner(
			EditorialRepository editorialRepository
	){
		return args -> {
			//System.out.println("Mariana Angel");
			System.out.println( editorialRepository.findAll() );

		};
	}
	*/


}
