package com.fjbernalc.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fjbernalc.gestion.converter.Convertidor;
import com.fjbernalc.gestion.entity.Curso;
import com.fjbernalc.gestion.model.MCurso;
import com.fjbernalc.gestion.repository.CursoRepo;

@Service("curso_servicio")
public class CursoService {
	
	@Autowired
	@Qualifier("curso_repositorio")
	private CursoRepo repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear(Curso curso) {
		
		try {
			
			repositorio.save(curso);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public boolean borrar(int id) {
		
		try {
			
			Curso curso = repositorio.findById(id);
			repositorio.delete(curso);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public List<MCurso> obtener(){
		return convertidor.convertirListaCursos((List<Curso>) repositorio.findAll());
	}
	
	public MCurso obtenerPorIdNombre(int id){
		return new MCurso(repositorio.findById(id));
	}

}
