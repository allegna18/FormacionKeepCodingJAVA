package com.formacionspring.apirest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "ventas")
public class Ventas implements Serializable{
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name = "id_producto")
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Producto id_producto;
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name = "id_cliente")
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Cliente id_cliente;
		@Column (nullable=false, unique=true)
		private double total; 
		@Column (nullable=false, unique=true)
		private Date fecha_venta;
		
		
		
		public Producto getId_producto() {
			return id_producto;
		}



		public void setId_producto(Producto id_producto) {
			this.id_producto = id_producto;
		}



		public Cliente getId_cliente() {
			return id_cliente;
		}



		public void setId_cliente(Cliente id_cliente) {
			this.id_cliente = id_cliente;
		}



		public long getId() {
			return id;
		}



		public void setId(long id) {
			this.id = id;
		}


		public double getTotal() {
			return total;
		}



		public void setTotal(double total) {
			this.total = total;
		}



		public Date getFecha_venta() {
			return fecha_venta;
		}



		public void setFecha_venta(Date fecha_venta) {
			this.fecha_venta = fecha_venta;
		}


		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

}
