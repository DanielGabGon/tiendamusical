package com.dangabito.tiendamusicalentities.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Dangabito
 * Clase que contiene entidades de perfiles de usuarios.
 */
@Entity
@Table(name = "rol")
public class Rol extends Common{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRol")
     private Long idRo;
     
	@Column(name = "nombre", length = 45,nullable = false )
     private String nombre;

	/**
	 * @return the idRo
	 */
	public Long getIdRo() {
		return idRo;
	}

	/**
	 * @param idRo the idRo to set
	 */
	public void setIdRo(Long idRo) {
		this.idRo = idRo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
     
	
}
