/**
 * 
 */
package com.dangabito.tiendamusicaldata.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * @author Dangabito
 * Clase Generica que representa los metodos del CRUD que se reutilizan en todas la entidades del proyecto.
 * E - significa le entidad a utilizar en el CRUD.
 * R - Significa el repositorio a utilizar de JPA para ejecutar el CRUD.
 */
public class CommonDAO<E, R extends JpaRepository<E, Long> & JpaSpecificationExecutor<E>>  {

 
	@Autowired
	protected R repository;
	/**
	 * Metodo que permite consultar una lista de datos paginable de una entidad.
	 * @param   {@link pageable} indica como se obtendran los resultados.
	 * @return {@link Page} lista con los datos de la consulta.
	 * 
	 */
	public Page<E> consultarListaPaginable(Pageable pageable) {
		return this.repository.findAll(pageable);
	}
	
	/**
	 * Metodo que permite persistir la informaión de cualquier entidad.
	 * @param e {@link object} o entidad a persistir
	 * @return {@link objeto} objeto recuperado despues de persistir el registro.
	 */
	public E guardar(E e) {
		return this.repository.save(e);
	}
	
	/**
	 * Metodo que permite actualalizar la información de cualquier entidad.
	 * @param e {@link object} o entidad a actualizar
	 * @return {@link objeto} objeto recuperado despues de actualizar el registro.
	 */
	public E actualizar(E e) {
		return this.repository.save(e);
	}
	
	/**
	 * Metodo que permite eliminar la informaión de cualquier entidad.
	 * @param e {@link object} o entidad a eliminar
	 */
	public void eliminar(E e) {
		this.repository.delete(e);
	}

}
