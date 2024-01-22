package com.example.appConexion.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "consultorio")
@ToString
@EqualsAndHashCode
public class Consultorio {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "pk")
    private Long pk;

    @Getter
    @Setter
    @Column(name = "numero")
    private Integer numero;
    @Getter @Setter @Column(name = "piso")
    private Integer piso;

    public Consultorio(){

    }

    public Consultorio(Integer numero, Integer piso) {
        this.numero = numero;
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "" + numero + " - "+ piso +"";
    }
}
