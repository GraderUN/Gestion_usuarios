package com.fjbernalc.gestion.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fjbernalc.gestion.entity.Administrativo;

@Repository("administrativo_repositorio")
public interface AdministrativoRepo extends CrudRepository<Administrativo, Serializable>{
	
	public abstract Administrativo findByNombre(String nombre);
	
	public abstract Administrativo findById(int id);	
	
	public abstract Administrativo findByIdAndNombre(int id, String nombre);

}
