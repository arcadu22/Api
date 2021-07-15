package com.example.demo.models;



import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name = "Cliente")
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long idUsuario;

	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Cliente (){

	}

	


    @Column(length = 50, nullable = false)
    private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


    @Column(length = 50, nullable = false)
    private String apellido;

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

    
    @Column(length = 11, nullable = false)
    private int edad;

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


    @Column(length = 20, nullable = false)
    private String documento;

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

   
    @Column(length = 40,nullable = false)
    private String email;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

   
    @Column(length = 40, nullable = false)
    private String telefono;

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//Bidireccionamiento
	public Cliente (Long idUsuario){
		this.idUsuario = idUsuario;

	}


	//llave
	@OneToMany(mappedBy = "cliente")
	private Set<Reserva> reservaList;
    
}
