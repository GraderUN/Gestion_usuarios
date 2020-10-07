package com.fjbernalc.gestion.controller;

import java.util.List;

import javax.validation.Valid;

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
	public boolean agregarProfesor(@RequestBody @Valid Profesor profesor) {
		return service.crear(profesor);
	}
	
	@PostMapping("/profesor")
	public boolean actualizarProfesor(@RequestBody @Valid Profesor profesor) {
		return service.actualizar(profesor);
	}
	
	@DeleteMapping("/profesor/{id}/{nombre}")
	public boolean borrarProfesor(@PathVariable("id") int id, @PathVariable("nombre") String nombre) {
		return service.borrar(id, nombre);
	}
	
	@GetMapping("/profesores")
	public List<MProfesor> obtenerProfesores(){
		return service.obtener();
	}

	@GetMapping("/profesor{id}/{nombre}")
	public MProfesor obtenerProfesor(@PathVariable("id") int id, @PathVariable("nombre") String nombre){
		return service.obtenerPorIdNombre(id, nombre);
	}

}
