
package com.example.demo.models;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Reserva")
public class Reserva {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idReserva;

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
	@Column(length = 11, nullable = false)
	private int usuarioid;

	public int getUsuarioid() {
		return this.usuarioid;
	}

	public void setUsuarioid(int usuarioid) {
		this.usuarioid = usuarioid;
	}

}