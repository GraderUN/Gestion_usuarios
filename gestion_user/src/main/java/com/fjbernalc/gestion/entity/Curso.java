package com.fjbernalc.gestion.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue
	@Id
	@Column(name="id_curso")
	private int id;
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy="cursos")
	private Set<Profesor> profesores = new HashSet<Profesor>();
	@OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "curso")
	private List<Estudiante> estudiantes;

	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public Curso(int id, Set<Profesor> profesores, List<Estudiante> estudiantes) {
		
		this.id = id;
		this.profesores = profesores;
		this.estudiantes = estudiantes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(Set<Profesor> profesores) {
		this.profesores = profesores;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estudiantes == null) ? 0 : estudiantes.hashCode());
		result = prime * result + id;
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
		Curso other = (Curso) obj;
		if (estudiantes == null) {
			if (other.estudiantes != null)
				return false;
		} else if (!estudiantes.equals(other.estudiantes))
			return false;
		if (id != other.id)
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
		return "Curso [id=" + id + ", profesores=" + profesores + ", estudiantes=" + estudiantes + "]";
	}
	
}
