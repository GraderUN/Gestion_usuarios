package com.fjbernalc.gestion.model;

import java.util.Set;

import com.fjbernalc.gestion.entity.Curso;
import com.fjbernalc.gestion.entity.Materia;
import com.fjbernalc.gestion.entity.Profesor;

public class MProfesor {
	
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private long telefono;
	private String email;
	private Materia materia;
	private Set<Curso> cursos;
	
	public MProfesor() {
		// TODO Auto-generated constructor stub
	}
	
	public MProfesor(Profesor profesor) {
		
		this.id = profesor.getId();
		this.nombre = profesor.getNombre();
		this.apellido = profesor.getApellido();
		this.edad = profesor.getEdad();
		this.telefono = profesor.getTelefono();
		this.email = profesor.getEmail();
		this.cursos = profesor.getCursos();
		this.materia = profesor.getMateria();
		
	}

	public MProfesor(int id, String nombre, String apellido, int edad, long telefono, String email, Materia materia,
			Set<Curso> cursos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email = email;
		this.materia = materia;
		this.cursos = cursos;
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

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cursos == null) ? 0 : cursos.hashCode());
		result = prime * result + edad;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (int) (telefono ^ (telefono >>> 32));
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
		MProfesor other = (MProfesor) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		if (edad != other.edad)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono != other.telefono)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MProfesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", telefono=" + telefono + ", email=" + email + ", materia=" + materia + ", cursos=" + cursos + "]";
	}
	
}
