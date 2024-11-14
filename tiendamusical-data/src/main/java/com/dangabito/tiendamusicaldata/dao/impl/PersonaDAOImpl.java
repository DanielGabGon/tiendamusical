/**
 * 
 */
package com.dangabito.tiendamusicaldata.dao.impl;

import com.dangabito.tiendamusicaldata.common.CommonDAO;
import com.dangabito.tiendamusicaldata.dao.PersonaDAO;
import com.dangabito.tiendamusicalentities.entities.Persona;

/**
 * @author Dangabito
 * Clase que implementa el CRUD Generico y las funciones de la Interface de personaDAO.
 */
public class PersonaDAOImpl extends CommonDAO<Persona, PersonaDAO> {
	
	/**
	 * Metodo permite consultar una persona por su usuario y contraseña.
	 * @param usaurio {@link String} usuario capturado por la persona.
	 * @param password {@link String} contraseña capturada por la persona. 
	 * @return {@link Persona} persona encontrada.
	 */
//	public Persona findUsuarioAndPassword(String usaurio, String password) {
//		System.out.println("LLEGO AQUI");
//		return this.repository.findByUsuarioAndPassword(usaurio, password);
//	}
	

}
