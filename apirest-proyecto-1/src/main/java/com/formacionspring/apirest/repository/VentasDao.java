package com.formacionspring.apirest.repository;

import org.springframework.data.repository.CrudRepository;
import com.formacionspring.apirest.entity.Ventas;

public interface VentasDao extends CrudRepository <Ventas, Long> {

}
