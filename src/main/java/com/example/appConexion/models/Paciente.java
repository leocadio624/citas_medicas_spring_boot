package com.example.appConexion.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "paciente")
@ToString @EqualsAndHashCode
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "pk")
    private Long pk;

    @Getter @Setter @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    @Getter @Setter @Column(name = "nombres")
    private String nombres;

    @Getter @Setter @Column(name = "ap_paterno")
    private String ap_paterno;

    @Getter @Setter @Column(name = "ap_materno")
    private String ap_materno;

    @Getter @Setter @Column(name = "sexo")
    private String sexo;

    public Paciente() {

    }

    public Paciente(Date fecha_creacion, String nombres, String ap_paterno, String ap_materno, String sexo) {
        this.fecha_creacion = fecha_creacion;
        this.nombres = nombres;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.sexo = sexo;
    }
}

