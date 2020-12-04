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

import com.fjbernalc.gestion.entity.Profesor;
import com.fjbernalc.gestion.model.MProfesor;
import com.fjbernalc.gestion.service.ProfesorService;

@RestController
@RequestMapping("/v1")
public class ProfesorController {
	
	@Autowired
	@Qualifier("profesor_servicio")
	ProfesorService service;
	
	@PutMapping("/profesor")
	public boolean agregarProfesor(@RequestBody Profesor profesor) {
		return service.crear(profesor);
	}
	
	@PostMapping("/profesor/{id}")
	public boolean actualizarProfesor(@PathVariable int id, @RequestBody Profesor profesor) {
		return service.actualizar(id, profesor);
	}
	
	@DeleteMapping("/profesor/{id}")
	public boolean borrarProfesor(@PathVariable int id) {
		return service.borrar(id);
	}
	
	@GetMapping("/profesores")
	public List<MProfesor> obtenerProfesores(){
		return service.obtener();
	}

	@GetMapping("/profesor/{id}")
	public MProfesor obtenerProfesor(@PathVariable int id){
		return service.obtenerPorId(id);
	}
	
	@GetMapping("/profesorN")
	public MProfesor obtenerProfesorN(@RequestBody Profesor profesor){
		return service.obtenerPorNombreApellido(profesor.getNombre(), profesor.getApellido());
	}

}
