package com.fjbernalc.gestion.model;

import java.util.List;
import java.util.Set;

import com.fjbernalc.gestion.entity.Curso;
import com.fjbernalc.gestion.entity.Estudiante;
import com.fjbernalc.gestion.entity.Profesor;

public class MCurso {
	
	private int id;
	private Set<Profesor> profesores;
	private List<Estudiante> estudiantes;
	
	public MCurso() {
		// TODO Auto-generated constructor stub
	}

	public MCurso(Curso curso) {
		
		this.id = curso.getId();
		this.profesores = curso.getProfesores();
		this.estudiantes = curso.getEstudiantes();
	}

	public MCurso(int id, Set<Profesor> profesores, List<Estudiante> estudiantes) {
		
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
		MCurso other = (MCurso) obj;
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
		return "MCurso [id=" + id + ", profesores=" + profesores + ", estudiantes=" + estudiantes + "]";
	}

}
