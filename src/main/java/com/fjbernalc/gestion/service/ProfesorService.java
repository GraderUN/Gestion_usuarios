package com.fjbernalc.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fjbernalc.gestion.converter.Convertidor;
import com.fjbernalc.gestion.entity.Profesor;
import com.fjbernalc.gestion.model.MProfesor;
import com.fjbernalc.gestion.repository.ProfesorRepo;

@Service("profesor_servicio")
public class ProfesorService {
	
	@Autowired
	@Qualifier("profesor_repositorio")
	private ProfesorRepo repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear(Profesor profesor) {
		
		try {
			
			repositorio.save(profesor);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	protected void mapProfesor(Profesor from, Profesor to) {
		
		to.setApellido(from.getApellido());;
		to.setEdad(from.getEdad());
		to.setEmail(from.getEmail());
		to.setNombre(from.getNombre());
		to.setTelefono(from.getTelefono());
		
	}
	
	public boolean actualizar(int id, Profesor profesor) {
		
		try {
			
			Profesor profesor1 = repositorio.findById(id);
			mapProfesor(profesor, profesor1);
			repositorio.save(profesor1);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public boolean borrar(int id) {
		
		try {
			
			Profesor profesor1 = repositorio.findById(id);
			repositorio.delete(profesor1);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public List<MProfesor> obtener(){
		return convertidor.convertirListaProfesores((List<Profesor>) repositorio.findAll());
	}
	
	public MProfesor obtenerPorId(int id){
		return new MProfesor(repositorio.findById(id));
	}
	
	public MProfesor obtenerPorNombreApellido(String nombre, String apellido){
		return new MProfesor(repositorio.findByNombreAndApellido(nombre, apellido));
	}

}
