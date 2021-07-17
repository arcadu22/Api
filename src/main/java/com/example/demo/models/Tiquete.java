package com.example.demo.models;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Tiquete")
public class Tiquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    //atributos
    private Long idTiquete;

    @Column(length = 40, nullable = false)
    private String clase;

    @Column(length = 25, nullable = false)
    private String asiento;
    
    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private Time hora;

    @Column(nullable = false)
    private Date fecha;

    //contructor
    public Tiquete() {
    }

    /*

    //llave foranea
    //bidireccionamiento
    @ManyToOne
    @JoinColumn(name = "clientefk" )
    Cliente cliente; //variable de la clase cliente que es una FK

    //constructor de la clase tiquete, resive un objeto cliente
    //Bidireccionamiento

    public Tiquete(Cliente cliente){
        this.cliente = cliente;

    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    */
}
