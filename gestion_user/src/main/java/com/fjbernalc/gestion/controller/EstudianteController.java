package com.fjbernalc.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fjbernalc.gestion.entity.Estudiante;
import com.fjbernalc.gestion.model.MEstudiante;
import com.fjbernalc.gestion.service.EstudianteService;

@RestController
@RequestMapping("/v1")
public class EstudianteController {
	
	@Autowired
	@Qualifier("estudiante_servicio")
	EstudianteService service;
	
	@PutMapping("/estudiante")
	public boolean agregarEstudiante(@RequestBody Estudiante estudiante) {
		return service.crear(estudiante);
	}
	
	@PostMapping("/estudiante")
	public boolean actualizarEstudiante(@RequestBody Estudiante estudiante) {
		return service.actualizar(estudiante);
	}
	
	@DeleteMapping("/estudiante/{id}/{nombre}")
	public boolean borrarEstudiante(@PathVariable("id") int id, @PathVariable("nombre") String nombre) {
		return service.borrar(id, nombre);
	}
	
	@GetMapping("/estudiantes")
	public List<MEstudiante> obtenerEstudiantes(){
		return service.obtener();
	}

	@GetMapping("/estudiante/{id}/{nombre}")
	public MEstudiante obtenerEstudiante(@PathVariable("id") int id, @PathVariable("nombre") String nombre){
		return service.obtenerPorIdNombre(id, nombre);
	}

}
