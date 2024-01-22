package com.example.appConexion.controller;

import com.example.appConexion.models.Paciente;
import com.example.appConexion.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/paciente")
public class PacienteController {


    @Autowired
    private PacienteService servicio_paciente;
    @GetMapping("/test")
    public ResponseEntity<String> test (){


        Paciente new_paciente = new Paciente(new Date(), "Lalo", "B", "L", "M");


        System.out.println(servicio_paciente.InsertUpdPaciente(new_paciente));

        return new ResponseEntity<>("endpoint", HttpStatus.OK);

        //return "endpoint";


    }
}
