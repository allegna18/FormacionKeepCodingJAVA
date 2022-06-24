package com.formacionspring.apirest.service;

import java.util.List;

import com.formacionspring.apirest.entity.Ventas;


public interface VentasService {
	
public List <Ventas> mostrarTodos();
	
	public Ventas mostrarPorId(Long id);
	
	public Ventas guardar(Ventas ventas); 
	
	public void borrar (Long id); 

}
