package com.formacionspring.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionspring.apirest.entity.Cliente;
import com.formacionspring.apirest.entity.Proveedor;
import com.formacionspring.apirest.service.ClienteService;
import com.formacionspring.apirest.service.ProveedorService;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private ProveedorService ventas;
	
	@GetMapping({"/proyecto","/"})
	public List<Proveedor> index(){
		return ventas.mostrarTodos();
	}
		
	@GetMapping("/proyecto/{id}")
	public Proveedor show(@PathVariable long id) {
		return ventas.mostrarPorId(id);
	}
			
	@PostMapping("/proyecto")
	public Proveedor create(@RequestBody Proveedor proveedor) {
		return ventas.guardar(proveedor);
		}
		
	@PutMapping("/proyecto/{id}")
		public Proveedor update(@RequestBody Proveedor proveedor
				,@PathVariable Long id) {
			
			Proveedor proveedorUpdate = ventas.mostrarPorId(id);
			
			proveedorUpdate.setNombre(proveedor.getNombre());
			proveedorUpdate.setNif(proveedor.getNif());
			proveedorUpdate.setEmail(proveedor.getEmail());
			proveedorUpdate.setTelefono(proveedor.getTelefono());
			proveedorUpdate.setDireccion(proveedor.getDireccion());
			
			
			
			return ventas.guardar(proveedorUpdate);
				
		}
	/*@DeleteMapping("/proyecto/{id}")
	public void delete(@PathVariable Long id) {
		ventas.borrar(id);
	}*/
	@DeleteMapping("/proyecto/{id}")
	public Proveedor delete(@PathVariable Long id) {
		Proveedor proveedorBorrado = ventas.mostrarPorId(id);
		ventas.borrar(id);
		return proveedorBorrado;
	}
		
}
