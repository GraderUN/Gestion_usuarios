package com.fjbernalc.gestion.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fjbernalc.gestion.entity.Curso;
import com.fjbernalc.gestion.model.MCurso;
import com.fjbernalc.gestion.service.CursoService;

@RestController
@RequestMapping("/v1")
public class CursoController {
	
	@Autowired
	@Qualifier("curso_servicio")
	CursoService service;
	
	@PutMapping("/curso")
	public boolean agregarCurso(@RequestBody @Valid Curso curso) {
		return service.crear(curso);
	}
	
	@DeleteMapping("/curso/{id}")
	public boolean borrarCurso(@PathVariable("id") int id) {
		return service.borrar(id);
	}
	
	@GetMapping("/cursos")
	public List<MCurso> obtenerCursos(){
		return service.obtener();
	}

}
