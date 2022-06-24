package com.formacionspring.apirest.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name= "productos")
public class Producto implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable= false)
	private String nombre;
	
	@Column(nullable= false)
	private int codigo_producto;
	
	@Column(nullable= false)
	private String tipo;
	
	@Column(nullable= false)
	private String precio;
	
	@Column(nullable= false)
	private Date fecha_registro;
	
	@Column(nullable= false)
	private int cantidad;
	
	
	private String imagen;
	
	

	public long getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public String getPrecio() {
		return precio;
	}



	public Date getFecha_registro() {
		return fecha_registro;
	}



	public int getCantidad() {
		return cantidad;
	}



	public String getImagen() {
		return imagen;
	}



	public void setId(long id) {
		this.id = id;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}



	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public void setImagen(String imagen) {
		this.imagen = imagen;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
