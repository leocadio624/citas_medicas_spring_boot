package com.example.appConexion.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "cita")
@ToString
@EqualsAndHashCode
public class Cita {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "pk")
    private Long pk;


    @Getter @Setter @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    @Getter @Setter @Column(name = "fecha_consulta")
    private Date fecha_consulta;


    @Getter @Setter @Column(name = "nombre_paciente")
    private String nombre_paciente;

    @Getter @Setter @Column(name = "estado")
    private Integer estado;



    @JsonProperty
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_consultorio")
    @Getter @Setter
    private Consultorio consultorio;



    @JsonProperty
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_medico")
    @Getter @Setter
    private Medico medico;

    public Cita(){

    }

    public Cita(Date fecha_creacion, Date fecha_consulta, String nombre_paciente, Integer estado, Consultorio consultorio, Medico medico) {
        this.fecha_creacion = fecha_creacion;
        this.fecha_consulta = fecha_consulta;
        this.estado = estado;
        this.nombre_paciente = nombre_paciente;
        this.consultorio = consultorio;
        this.medico = medico;

    }
/*
    public Cita(Paciente paciente) {
        this.paciente = paciente;
    }

     */
}
