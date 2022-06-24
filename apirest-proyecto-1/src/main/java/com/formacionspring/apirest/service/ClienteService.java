package com.formacionspring.apirest.service;

import java.util.List;

import com.formacionspring.apirest.entity.Cliente;


public  interface ClienteService {

        public List<Cliente> mostrarTodos();

        public Cliente mostrarPorId(long id);

        public Cliente guardar(Cliente cliente);

        public void borrar(long id);



    }
