package com.fjbernalc.gestion.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fjbernalc.gestion.entity.Administrativo;
import com.fjbernalc.gestion.entity.Curso;
import com.fjbernalc.gestion.entity.Estudiante;
import com.fjbernalc.gestion.entity.Materia;
import com.fjbernalc.gestion.entity.Profesor;
import com.fjbernalc.gestion.model.MAdministrativo;
import com.fjbernalc.gestion.model.MCurso;
import com.fjbernalc.gestion.model.MEstudiante;
import com.fjbernalc.gestion.model.MMateria;
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
	
	public List<MCurso> convertirListaCursos(List<Curso> cursos){
		
		List<MCurso> mcursos = new ArrayList<>();
		for(Curso curso : cursos) {
			
			mcursos.add(new MCurso(curso));
			
		}
		
		return mcursos; 
		
	}
	
	public List<MProfesor> convertirListaProfesores(List<Profesor> profesores){
		
		List<MProfesor> mprofesores = new ArrayList<>();
		for(Profesor profesor : profesores) {
			
			mprofesores.add(new MProfesor(profesor));
			
		}
		
		return mprofesores; 
		
	}
	
	public List<MMateria> convertirListaMaterias(List<Materia> materias){
		
		List<MMateria> mmaterias = new ArrayList<>();
		for(Materia materia : materias) {
			
			mmaterias.add(new MMateria(materia));
			
		}
		
		return mmaterias; 
		
	}
	
	public List<MAdministrativo> convertirListaAdminstrativos(List<Administrativo> administrativos){
		
		List<MAdministrativo> madministrativos = new ArrayList<>();
		for(Administrativo administrativo : administrativos) {
			
			madministrativos.add(new MAdministrativo(administrativo));
			
		}
		
		return madministrativos; 
		
	}

}
