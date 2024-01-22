package com.example.appConexion.controller;


import com.example.appConexion.models.Consultorio;
import com.example.appConexion.models.Medico;
import com.example.appConexion.service.ConsultorioService;
import com.example.appConexion.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consultorio")
public class ConsultorioController {


    @Autowired
    private ConsultorioService servicio_con;
    @GetMapping("/test")
    public ResponseEntity<String> test (){


        //Creacion de 3 consultorios
        Consultorio c1  = new Consultorio(444, 1);
        Consultorio c2  = new Consultorio(555, 1);
        Consultorio c3  = new Consultorio(666, 1);

        servicio_con.InsertUpdCon(c1);
        servicio_con.InsertUpdCon(c2);
        servicio_con.InsertUpdCon(c3);

        //Medico new_medico = new Medico("000001", "medico1", "B", "L", "Medico general");

        //System.out.println(servicio_medico.InsertUpdMedico(new_medico));
        //System.out.println("test");

        return new ResponseEntity<>("endpoint consultorio", HttpStatus.OK);




    }
}
