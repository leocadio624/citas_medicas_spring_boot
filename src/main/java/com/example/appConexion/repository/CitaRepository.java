package com.example.appConexion.repository;

import com.example.appConexion.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long>{


    //@Query("SELECT U FROM Cita U WHERE U.fecha_creacion = :start_date AND :end_date AND U.fk_icm = :fk")
    @Query("SELECT U FROM Cita U WHERE U.fecha_consulta = :arg_fecha_consulta")
    public List<Cita> findByArguments(@Param("arg_fecha_consulta") Date arg_fecha_consulta);



}


