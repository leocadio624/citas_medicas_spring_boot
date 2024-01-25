package com.example.appConexion.controller;


import com.example.appConexion.models.Cita;
import com.example.appConexion.models.Consultorio;
import com.example.appConexion.models.Medico;

import com.example.appConexion.models.Paciente;
import com.example.appConexion.service.CitaService;
import com.example.appConexion.service.ConsultorioService;
import com.example.appConexion.service.MedicoService;
import com.example.appConexion.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/cita")
@CrossOrigin(origins="http://127.0.0.1:3456")
public class CitaController {

    @Autowired
    private CitaService servicio_cita;

    @Autowired
    private ConsultorioService servicio_consultorio;

    @Autowired
    private MedicoService servicio_medico;



    @GetMapping("/test")
    public ResponseEntity<String> test (){


        /* 
        Consultorio consultorio = servicio_consultorio.getConsultorio(1L);
        Consultorio consultorio2 = servicio_consultorio.getConsultorio(2L);
        Consultorio consultorio3 = servicio_consultorio.getConsultorio(3L);
        Medico medico = servicio_medico.getMedico(1L);

        //Cita(Date fecha_creacion, Date fecha_consulta, String nombre_paciente, Consultorio consultorio, Medico medico) {
        //Insertamos 3 citas de prueba
        Cita cita = new Cita(new Date(), new Date(), "Maria Morlan", 1, consultorio, medico);
        Cita cita2 = new Cita(new Date(), new Date(), "Diana Benitez",1, consultorio2, medico);
        Cita cita3 = new Cita(new Date(), new Date(), "Juan Vazquez", 1,consultorio3, medico);



        servicio_cita.InsertUpdCita(cita);
        servicio_cita.InsertUpdCita(cita2);
        servicio_cita.InsertUpdCita(cita3);
        */
        System.out.println("frfr");



        System.out.println("endpoint cita");




        //Medico new_medico = new Medico("000001", "medico1", "B", "L", "Medico general");

        //System.out.println(servicio_medico.InsertUpdMedico(new_medico));

        return new ResponseEntity<>("cita endpoint", HttpStatus.OK);


    }

    @GetMapping("/all")
    public ResponseEntity<List<Cita>> findAll(){

        return new ResponseEntity<>(servicio_cita.findAll(), HttpStatus.OK);


    }

    /*
    * */
    @GetMapping("/nueva")
    public String CC_Citas(Model modelo){


        List<Consultorio> consultorios = servicio_consultorio.findAll();
        List<Medico> medicos = servicio_medico.findAll();

        modelo.addAttribute("consultorios", consultorios);
        modelo.addAttribute("medicos", medicos);


        return "index.html";


    }

    @GetMapping("/tb_citas")
    public String tablaConexiones(Model modelo){

        List<Cita> citas = servicio_cita.findAll();
        modelo.addAttribute("citas", citas);


        /* 
        for (Cita cita : citas){
            System.out.println(cita);
        }
        */




        return "tb_citas.html";


    }


    @PostMapping("/save")
    public ResponseEntity<Cita> save (@RequestParam Long medico, @RequestParam Long consultorio, @RequestParam Date fecha, @RequestParam String paciente){

        /* 
        System.out.println(medico);
        System.out.println(consultorio);
        System.out.println(fecha);
        System.out.println(paciente);
        */

        Consultorio con_obj = servicio_consultorio.getConsultorio(consultorio);
        Medico med_obj = servicio_medico.getMedico(medico);

    
        Cita cita = new Cita(new Date(), fecha, paciente, 1, con_obj, med_obj);

        Cita new_cita = servicio_cita.InsertUpdCita(cita);
        

        
        

        /*
        System.out.println(param.getMedico());
        System.out.println(param.getFecha());
        */


        return new ResponseEntity<>(new_cita, HttpStatus.CREATED);


    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        servicio_cita.deleteCita(id);
        

        return new ResponseEntity("Cita eliminada!", HttpStatus.OK);

    }




}
