package com.fjbernalc.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fjbernalc.gestion.converter.Convertidor;
import com.fjbernalc.gestion.entity.Materia;
import com.fjbernalc.gestion.model.MMateria;
import com.fjbernalc.gestion.repository.MateriaRepo;

@Service("materia_servicio")
public class MateriaService {
	
	@Autowired
	@Qualifier("materia_repositorio")
	private MateriaRepo repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear(Materia materia) {
		
		try {
			
			repositorio.save(materia);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	protected void mapMateria(Materia from, Materia to) {
		
		to.setNombre(from.getNombre());
		
	}
	
	public boolean actualizar(Materia materia) {
		
		try {
			
			Materia materia1 = repositorio.findById(materia.getId());
			mapMateria(materia, materia1);
			repositorio.save(materia1);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}	
	
	public boolean borrar(int id, String nombre) {
		
		try {
			
			Materia materia = repositorio.findByIdAndNombre(id, nombre);
			repositorio.delete(materia);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public List<MMateria> obtener(){
		return convertidor.convertirListaMaterias((List<Materia>) repositorio.findAll());
	}
	
	public MMateria obtenerPorIdNombre(int id, String nombre){
		return new MMateria(repositorio.findByIdAndNombre(id, nombre));
	}

}
