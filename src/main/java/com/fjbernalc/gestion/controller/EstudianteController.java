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
	
	@PostMapping("/estudiante/{id}")
	public boolean actualizarEstudiante(@PathVariable int id, @RequestBody Estudiante estudiante) {
		return service.actualizar(id, estudiante);
	}
	
	@DeleteMapping("/estudiante/{id}")
	public boolean borrarEstudiante(@PathVariable int id) {
		return service.borrar(id);
	}
	
	@GetMapping("/estudiantes")
	public List<MEstudiante> obtenerEstudiantes(){
		return service.obtener();
	}

	@GetMapping("/estudiante/{id}")
	public MEstudiante obtenerEstudiante(@PathVariable int id){
		return service.obtenerPorId(id);
	}
	
	@GetMapping("/estudianteN")
	public MEstudiante obtenerEstudianteN(@RequestBody Estudiante estudiante){
		return service.obtenerPorNombreApellido(estudiante.getNombre(), estudiante.getApellido());
	}

}
