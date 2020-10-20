package com.fjbernalc.gestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fjbernalc.gestion.converter.Convertidor;
import com.fjbernalc.gestion.entity.Administrativo;
import com.fjbernalc.gestion.model.MAdministrativo;
import com.fjbernalc.gestion.repository.AdministrativoRepo;

@Service("administrativo_servicio")
public class AdministrativoService {
	
	@Autowired
	@Qualifier("administrativo_repositorio")
	private AdministrativoRepo repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear(Administrativo administrativo) {
		
		try {
			repositorio.save(administrativo);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	protected void mapAdministrativo(Administrativo from, Administrativo to) {
		
		to.setApellido(from.getApellido());
		to.setEdad(from.getEdad());
		to.setEmail(from.getEmail());
		to.setNombre(from.getNombre());
		to.setTelefono(from.getTelefono());
		
	}
	
	public boolean actualizar(int id, Administrativo administrativo) {
		
		try {
			
			Administrativo administrativo1 = repositorio.findById(id);
			mapAdministrativo(administrativo, administrativo1);
			repositorio.save(administrativo1);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public boolean borrar(int id) {
		
		try {
			
			Administrativo administrativo = repositorio.findById(id);
			repositorio.delete(administrativo);
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public List<MAdministrativo> obtener(){
		return convertidor.convertirListaAdminstrativos((List<Administrativo>) repositorio.findAll());
	}
	
	public MAdministrativo obtenerPorId(int id){
		return new MAdministrativo(repositorio.findById(id));
	}
	
	public MAdministrativo obtenerPorNombreApellido(String nombre, String apellido){
		return new MAdministrativo(repositorio.findByNombreAndApellido(nombre, apellido));
	}

}
