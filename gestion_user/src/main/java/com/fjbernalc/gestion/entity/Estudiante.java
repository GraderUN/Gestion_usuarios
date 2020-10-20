package com.fjbernalc.gestion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue
	@Id
	@Column(name="id_estudiante")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(name="edad")
	private int edad;
	@Column(name="sexo")
	private String sexo;
	@Column(name="nombreTutor")
	private String nombreTutor;
	@Column(name="apellidoTutor")
	private String apellidoTutor;
	@Column(name="telefonoTutor")
	private long telefonoTutor;
	@Column(name="emailTutor")
	private String emailTutor;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(int id, String nombre, String apellido, int edad, String sexo, String nombreTutor,
			String apellidoTutor, long telefonoTutor, String emailTutor) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.nombreTutor = nombreTutor;
		this.apellidoTutor = apellidoTutor;
		this.telefonoTutor = telefonoTutor;
		this.emailTutor = emailTutor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombreTutor() {
		return nombreTutor;
	}

	public void setNombreTutor(String nombreTutor) {
		this.nombreTutor = nombreTutor;
	}

	public String getApellidoTutor() {
		return apellidoTutor;
	}

	public void setApellidoTutor(String apellidoTutor) {
		this.apellidoTutor = apellidoTutor;
	}

	public long getTelefonoTutor() {
		return telefonoTutor;
	}

	public void setTelefonoTutor(long telefonoTutor) {
		this.telefonoTutor = telefonoTutor;
	}

	public String getEmailTutor() {
		return emailTutor;
	}

	public void setEmailTutor(String emailTutor) {
		this.emailTutor = emailTutor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((apellidoTutor == null) ? 0 : apellidoTutor.hashCode());
		result = prime * result + edad;
		result = prime * result + ((emailTutor == null) ? 0 : emailTutor.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombreTutor == null) ? 0 : nombreTutor.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + (int) (telefonoTutor ^ (telefonoTutor >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (apellidoTutor == null) {
			if (other.apellidoTutor != null)
				return false;
		} else if (!apellidoTutor.equals(other.apellidoTutor))
			return false;
		if (edad != other.edad)
			return false;
		if (emailTutor == null) {
			if (other.emailTutor != null)
				return false;
		} else if (!emailTutor.equals(other.emailTutor))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombreTutor == null) {
			if (other.nombreTutor != null)
				return false;
		} else if (!nombreTutor.equals(other.nombreTutor))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (telefonoTutor != other.telefonoTutor)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo="
				+ sexo + ", nombreTutor=" + nombreTutor + ", apellidoTutor=" + apellidoTutor + ", telefonoTutor="
				+ telefonoTutor + ", emailTutor=" + emailTutor + "]";
	}

}
