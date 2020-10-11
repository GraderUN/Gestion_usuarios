package com.fjbernalc.gestion.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fjbernalc.gestion.entity.Estudiante;

@Repository("estudiante_repositorio")
public interface EstudianteRepo extends CrudRepository<Estudiante, Serializable>{
	
	public abstract Estudiante findByNombre(String nombre);
	
	public abstract Estudiante findById(int id);	
	
	public abstract Estudiante findByNombreAndApellido(String nombre, String apellido);

}
