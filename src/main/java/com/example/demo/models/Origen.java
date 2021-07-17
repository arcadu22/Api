package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Origen")
public class Origen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

    	// atributos
	private Long idOrigen;

    @Column(length = 50, nullable = false)
	private String aeropuerto;

	@Column(length = 50, nullable = false)
	private String ciudad;

	@Column(length = 40, nullable = false)
	private String pais;

     //Constructor
    public Origen() {
    }

    //Get Y Set
    public Long getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Long idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    

    


}
