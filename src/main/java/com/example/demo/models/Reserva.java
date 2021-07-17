
package com.example.demo.models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Reserva")
public class Reserva {
	// creacion de la tabla reserva
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)

	// atributos
	private Long idReserva;
	@Column(nullable = false)
	private Date fechaReserva;
	@Column(nullable = false)
	private boolean idaVuelta;

	// constructor de la clase
	public Reserva() {

	}

	// metodos Get y Set
	public Long getIdReserva() {
		return this.idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}

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

	// llave foranea
	// BIdireccionamiento
	@ManyToOne
	@JoinColumn(name = "clientefk")
	Cliente cliente; // variable de la clase cliente que es una FK

	// cuntructor de la clase reserva, resive un objeto cleente para lograr el
	// bidireccionamineto
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