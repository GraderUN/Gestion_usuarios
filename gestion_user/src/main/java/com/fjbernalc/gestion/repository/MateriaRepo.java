package com.fjbernalc.gestion.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fjbernalc.gestion.entity.Materia;

@Repository("materia_repositorio")
public interface MateriaRepo extends CrudRepository<Materia, Serializable>{
	
	public abstract Materia findByNombre(String nombre);
	
	public abstract Materia findById(int id);	
	
	public abstract Materia findByIdAndNombre(int id, String nombre);

}
