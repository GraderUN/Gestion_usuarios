package com.fjbernalc.gestion.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="materia")
public class Materia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue
	@Id
	@Column(name="id_materia")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "materia")
	private List<Profesor> profesores;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(int id, String nombre, List<Profesor> profesores) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.profesores = profesores;
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

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((profesores == null) ? 0 : profesores.hashCode());
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
		Materia other = (Materia) obj;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (profesores == null) {
			if (other.profesores != null)
				return false;
		} else if (!profesores.equals(other.profesores))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", profesores=" + profesores + "]";
	}

}
