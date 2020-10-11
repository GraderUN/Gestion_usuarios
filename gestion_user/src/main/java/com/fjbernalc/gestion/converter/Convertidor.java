package com.fjbernalc.gestion.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fjbernalc.gestion.entity.Administrativo;
import com.fjbernalc.gestion.entity.Estudiante;
import com.fjbernalc.gestion.entity.Profesor;
import com.fjbernalc.gestion.model.MAdministrativo;
import com.fjbernalc.gestion.model.MEstudiante;
import com.fjbernalc.gestion.model.MProfesor;

@Component("convertidor")
public class Convertidor {
	
	public List<MEstudiante> convertirListaEstudiantes(List<Estudiante> estudiantes){
		
		List<MEstudiante> mestudiantes = new ArrayList<>();
		for(Estudiante estudiante : estudiantes) {
			
			mestudiantes.add(new MEstudiante(estudiante));
			
		}
		
		return mestudiantes; 
		
	}
	
	public List<MProfesor> convertirListaProfesores(List<Profesor> profesores){
		
		List<MProfesor> mprofesores = new ArrayList<>();
		for(Profesor profesor : profesores) {
			
			mprofesores.add(new MProfesor(profesor));
			
		}
		
		return mprofesores; 
		
	}
	
	public List<MAdministrativo> convertirListaAdminstrativos(List<Administrativo> administrativos){
		
		List<MAdministrativo> madministrativos = new ArrayList<>();
		for(Administrativo administrativo : administrativos) {
			
			madministrativos.add(new MAdministrativo(administrativo));
			
		}
		
		return madministrativos; 
		
	}

}
