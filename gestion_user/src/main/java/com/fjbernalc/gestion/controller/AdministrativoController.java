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

import com.fjbernalc.gestion.entity.Administrativo;
import com.fjbernalc.gestion.model.MAdministrativo;
import com.fjbernalc.gestion.service.AdministrativoService;

@RestController
@RequestMapping("/v1")
public class AdministrativoController {
	
	@Autowired
	@Qualifier("administrativo_servicio")
	AdministrativoService service;
	
	@PutMapping("/administrativo")
	public boolean agregarAdministrativo(@RequestBody Administrativo administrativo) {
		return service.crear(administrativo);
	}
	
	@PostMapping("/administrativo/{id}")
	public boolean actualizarAdministrativo(@PathVariable int id, @RequestBody Administrativo administrativo) {
		return service.actualizar(id, administrativo);
	}
	
	@DeleteMapping("/administrativo/{id}")
	public boolean borrarAdministrativo(@PathVariable int id) {
		return service.borrar(id);
	}
	
	@GetMapping("/administrativos")
	public List<MAdministrativo> obtenerAdministrativos(){
		return service.obtener();
	}
	
	@GetMapping("/administrativo/{id}")
	public MAdministrativo obtenerAdministrativo(@PathVariable int id){
		return service.obtenerPorId(id);
	}
	
	@GetMapping("/administrativoN")
	public MAdministrativo obtenerAdministrativoN(@RequestBody Administrativo administrativo){
		return service.obtenerPorNombreApellido(administrativo.getNombre(), administrativo.getApellido());
	}

}
