package com.fjbernalc.gestion.model;

import java.util.List;

import com.fjbernalc.gestion.entity.Materia;
import com.fjbernalc.gestion.entity.Profesor;

public class MMateria {
	
	private int id;
	private String nombre;
	private List<Profesor> profesores;
	
	public MMateria() {
		// TODO Auto-generated constructor stub
	}

	public MMateria(Materia materia) {
		
		this.id = materia.getId();
		this.nombre = materia.getNombre();
		this.profesores = materia.getProfesores();
	}

	public MMateria(int id, String nombre, List<Profesor> profesores) {
		
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
		MMateria other = (MMateria) obj;
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
		return "MMateria [id=" + id + ", nombre=" + nombre + ", profesores=" + profesores + "]";
	}
	
}
