package com.example.appConexion.service;

import com.example.appConexion.models.Consultorio;
import com.example.appConexion.models.Medico;
import com.example.appConexion.models.Paciente;
import com.example.appConexion.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {


    @Autowired
    private MedicoRepository medico_rep;
    public Medico InsertUpdMedico(Medico medico){
        return medico_rep.save(medico);


    }

    public List<Medico> findAll(){
        return medico_rep.findAll();
    }
    public Medico getMedico(Long id){
        return medico_rep.findById(id).get();
    }
}
