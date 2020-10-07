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

import com.fjbernalc.gestion.entity.Materia;
import com.fjbernalc.gestion.model.MMateria;
import com.fjbernalc.gestion.service.MateriaService;

@RestController
@RequestMapping("/v1")
public class MateriaController {
	
	@Autowired
	@Qualifier("materia_servicio")
	MateriaService service;
	
	@PutMapping("/materia")
	public boolean agregarMateria(@RequestBody Materia materia) {
		return service.crear(materia);
	}
	
	@PostMapping("/materia")
	public boolean actualizarMateria(@RequestBody Materia materia) {
		return service.actualizar(materia);
	}
	
	@DeleteMapping("/materia/{id}/{nombre}")
	public boolean borrarMateria(@PathVariable("id") int id, @PathVariable("nombre") String nombre) {
		return service.borrar(id, nombre);
	}
	
	@GetMapping("/materias")
	public List<MMateria> obtenerMaterias(){
		return service.obtener();
	}

	@GetMapping("/materia/{id}/{nombre}")
	public MMateria obtenerMateria(@PathVariable("id") int id, @PathVariable("nombre") String nombre){
		return service.obtenerPorIdNombre(id, nombre);
	}

}
