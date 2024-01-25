package com.example.appConexion.service;

import com.example.appConexion.models.Cita;
import com.example.appConexion.models.Paciente;
import com.example.appConexion.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository cita_rep;

    public List<Cita> findAll(){
        return cita_rep.findAll();
    }
    public Cita InsertUpdCita(Cita cita){
        return cita_rep.save(cita);
    }

    public void deleteCita(Long id){
        cita_rep.deleteById(id);
    }
    
}
