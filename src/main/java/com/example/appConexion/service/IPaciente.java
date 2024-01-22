package com.example.appConexion.service;
import com.example.appConexion.models.Paciente;
import java.util.List;
public interface IPaciente {

    public abstract Paciente InsertUpdEditorial(Paciente e);
    public abstract Paciente getEditorial(Long id);
    public abstract List<Paciente> findAll();
    public abstract void deleteEditorial(Long id);


}
