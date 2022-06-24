package com.formacionspring.apirest.service;

import java.util.List;


import com.formacionspring.apirest.entity.Producto;

public interface ProductoService {



    public List<Producto>mostrarTodos();

    public Producto mostrarporId(long id);

    public Producto guardar(Producto producto);

    public void borrar(long id);


}
