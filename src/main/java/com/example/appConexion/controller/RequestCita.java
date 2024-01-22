package com.example.appConexion.controller;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

public class RequestCita {

    @Getter @Setter
    private Long medico;

    @Getter @Setter
    private Long consultorio;

    @Getter @Setter
    private Date fecha;

    @Getter @Setter
    private String paciente;




}
