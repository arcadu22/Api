
package com.example.demo.models;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Reserva")
public class Reserva {
	//creacion de la tabla reserva
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idReserva;

	public Reserva(){
		
	}

	public Long getIdReserva() {
		return this.idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

	@Column(nullable = false)
	private Date fechaReserva;
	@Column(nullable = false)
	private boolean idaVuelta;

	public Date getFechaReserva() {
		return this.fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public boolean isIdaVuelta() {
		return this.idaVuelta;
	}

	public void setIdaVuelta(boolean idaVuelta) {
		this.idaVuelta = idaVuelta;
	}

   //llave foranea
   //BIdireccionamiento
   @ManyToOne
   @JoinColumn(name = "clientefk")
   	Cliente cliente;

	public Reserva(Cliente cliente) {
	this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	



}