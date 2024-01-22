package com.example.appConexion.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "medico")
@ToString
@EqualsAndHashCode
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "pk")
    private Long pk;


    @Getter @Setter @Column(name = "nombre")
    private String nombres;

    @Getter @Setter @Column(name = "ap_paterno")
    private String ap_paterno;

    @Getter @Setter @Column(name = "ap_materno")
    private String ap_materno;

    @Getter @Setter @Column(name = "esp")
    private String esp;


    public Medico(){

    }
    public Medico( String nombres, String ap_paterno, String ap_materno, String esp) {
        this.nombres = nombres;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.esp = esp;
    }

    @Override
    public String toString() {
        return "" + nombres +" " + ap_paterno + " " + ap_materno + "-" + esp + "";

    }
}
