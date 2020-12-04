package com.fjbernalc.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fjbernalc.gestion.converter.Convertidor;
import com.fjbernalc.gestion.entity.Estudiante;
import com.fjbernalc.gestion.model.MEstudiante;
import com.fjbernalc.gestion.repository.EstudianteRepo;

@Service("estudiante_servicio")
public class EstudianteService {
	
	@Autowired
	@Qualifier("estudiante_repositorio")
	private EstudianteRepo repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear(Estudiante estudiante) {
		
		try {
			
			repositorio.save(estudiante);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	protected void mapEstudiante(Estudiante from, Estudiante to) {
		
		to.setApellido(from.getApellido());
		to.setNombre(from.getNombre());
		to.setEdad(from.getEdad());
		to.setSexo(from.getSexo());
		to.setNombreTutor(from.getNombreTutor());
		to.setApellidoTutor(from.getApellidoTutor());
		to.setTelefonoTutor(from.getTelefonoTutor());
		to.setEmailTutor(from.getEmailTutor());
		
	}
	
	public boolean actualizar(int id, Estudiante estudiante) {
		
		try {
			
			Estudiante estudiante1 = repositorio.findById(id);
			mapEstudiante(estudiante, estudiante1);
			repositorio.save(estudiante1);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public boolean borrar(int id) {
		
		try {
			
			Estudiante estudiante = repositorio.findById(id);
			repositorio.delete(estudiante);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public List<MEstudiante> obtener(){
		return convertidor.convertirListaEstudiantes((List<Estudiante>) repositorio.findAll());
	}
	
	public MEstudiante obtenerPorId(int id){
		return new MEstudiante(repositorio.findById(id));
	}
	
	public MEstudiante obtenerPorNombreApellido(String nombre, String apellido){
		return new MEstudiante(repositorio.findByNombreAndApellido(nombre, apellido));
	}

}
