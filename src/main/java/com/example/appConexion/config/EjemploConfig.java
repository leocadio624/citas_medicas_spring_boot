package com.example.appConexion.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Getter;

@Configuration
@PropertySource("classpath:tutorial.properties")
@Getter
public class EjemploConfig {
    @Value("${demo.valor}")
    private String valor;

}
