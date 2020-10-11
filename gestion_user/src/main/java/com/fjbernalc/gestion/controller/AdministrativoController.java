package com.fjbernalc.gestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping("/administrativo")
	public boolean actualizarAdministrativo(@RequestBody Administrativo administrativo) {
		return service.actualizar(administrativo);
	}
	
	@DeleteMapping("/administrativo")
	public boolean borrarAdministrativo(@RequestBody Administrativo administrativo) {
		return service.borrar(administrativo.getId());
	}
	
	@GetMapping("/administrativos")
	public List<MAdministrativo> obtenerAdministrativos(){
		return service.obtener();
	}
	
	@GetMapping("/administrativo")
	public MAdministrativo obtenerAdministrativo(@RequestBody Administrativo administrativo){
		return service.obtenerPorId(administrativo.getId());
	}
	
	@GetMapping("/administrativoN")
	public MAdministrativo obtenerAdministrativoN(@RequestBody Administrativo administrativo){
		return service.obtenerPorNombreApellido(administrativo.getNombre(), administrativo.getApellido());
	}

}
