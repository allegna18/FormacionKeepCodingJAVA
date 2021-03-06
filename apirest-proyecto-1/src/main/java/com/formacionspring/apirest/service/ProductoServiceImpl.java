package com.formacionspring.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionspring.apirest.entity.Producto;
import com.formacionspring.apirest.repository.ProductoDao;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> mostrarTodos() {

        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto mostrarporId(long id) {
                return productoDao.findById(id).orElse(null);
    }


    @Override
    @Transactional(readOnly = true)
    public Producto guardar(Producto producto) {
            return productoDao.save(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public void borrar(long id) {
    productoDao.deleteById(id);

    }




}