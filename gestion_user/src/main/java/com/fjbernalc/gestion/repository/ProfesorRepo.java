package com.fjbernalc.gestion.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fjbernalc.gestion.entity.Profesor;

@Repository("profesor_repositorio")
public interface ProfesorRepo extends CrudRepository<Profesor, Serializable>{
	
	public abstract Profesor findByNombre(String nombre);
	
	public abstract Profesor findById(int id);	
	
	public abstract Profesor findByIdAndNombre(int id, String nombre);

}
