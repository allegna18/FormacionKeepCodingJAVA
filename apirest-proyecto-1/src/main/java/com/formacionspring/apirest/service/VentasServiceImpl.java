package com.formacionspring.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.formacionspring.apirest.entity.Ventas;
import com.formacionspring.apirest.repository.VentasDao;

public class VentasServiceImpl implements VentasService{

	@Autowired
	private VentasDao ventasDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ventas> mostrarTodos() {
		
		return (List<Ventas>) ventasDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Ventas mostrarPorId(Long id) {
		
		return ventasDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Ventas guardar(Ventas ventas) {
		
		return ventasDao.save(ventas);
	}

	@Override
	@Transactional
	public void borrar(Long id) {
		
		ventasDao.deleteById(id);
		
		
	}

}
