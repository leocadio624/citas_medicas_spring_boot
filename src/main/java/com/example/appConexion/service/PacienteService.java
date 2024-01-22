package com.example.appConexion.service;


import com.example.appConexion.models.Paciente;
import com.example.appConexion.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService{

    //Inyeccion de dependencias
    @Autowired
    private PacienteRepository paciente_rep;

    public List<Paciente> findAll(){
        return paciente_rep.findAll();
    }

    public Paciente InsertUpdPaciente(Paciente paciente){

        return paciente_rep.save(paciente);
    }

    public Paciente getPaciente(Long id){
        return paciente_rep.findById(id).get();
    }

    public void delete(Long id){

        paciente_rep.deleteById(id);

        //Paciente  = getEditorial(id);
        /*
        Editorial editorial = getEditorial(id);
        editorial.setEstado(false);
        userRepository.save(editorial);
        userRepository.deleteById(id);
        */
    }



}
