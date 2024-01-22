package com.example.appConexion.controller;

import com.example.appConexion.models.Medico;
import com.example.appConexion.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;



@Controller
@RequestMapping("/medico")
public class MedicoController {


    @Autowired
    private MedicoService servicio_medico;
    @GetMapping("/test")
    public ResponseEntity<String> test (){


        Medico new_medico = new Medico("Daniel", "Lopez", "Lopez", "Medico general");
        Medico new_medico2 = new Medico("Esteban", "Beltran", "Beltran", "Cirujano");
        Medico new_medico3 = new Medico( "Sara", "Diaz", "Diaz", "Neurologo");

        servicio_medico.InsertUpdMedico(new_medico);
        servicio_medico.InsertUpdMedico(new_medico2);
        servicio_medico.InsertUpdMedico(new_medico3);



        return new ResponseEntity<>("endpoint", HttpStatus.OK);




    }

}
