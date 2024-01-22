package com.example.appConexion.service;

import com.example.appConexion.models.Consultorio;
import com.example.appConexion.models.Paciente;
import com.example.appConexion.repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioService {

    @Autowired
    private ConsultorioRepository con_rep;
    public  Consultorio InsertUpdCon(Consultorio con){
        return con_rep.save(con);
    }

    public List<Consultorio> findAll(){
        return con_rep.findAll();
    }

    public Consultorio getConsultorio(Long id){
        return con_rep.findById(id).get();
    }
}
