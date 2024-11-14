package com.dangabito.tiendamusicalentities.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author Dangabito
 * Clase que contiene los campos de la base de datos que se puede utilizar en varias tablas.
 * y que es compartida con otras clase con la anotación @MapperSuperClass
 */
@MappedSuperclass
public class Common {

	
	@Column(name = "fechaCreacion" , nullable = false)
     private LocalDateTime fechaCreacion;
     
	@Column(name = "fechaModificacion")
     private LocalDateTime fechaActualizacion;
     
	@Column(name = "estatus")
     private boolean estatus;
     
	
}
