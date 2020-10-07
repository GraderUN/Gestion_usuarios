package com.fjbernalc.gestion.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fjbernalc.gestion.entity.Curso;

@Repository("curso_repositorio")
public interface CursoRepo extends CrudRepository<Curso, Serializable>{
	
	public abstract Curso findById(int id);

}
