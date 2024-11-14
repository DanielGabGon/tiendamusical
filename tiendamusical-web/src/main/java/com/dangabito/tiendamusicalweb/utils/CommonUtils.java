package com.dangabito.tiendamusicalweb.utils;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.application.FacesMessage.Severity;
import jakarta.faces.context.FacesContext;

/**
 * @Dangabito
 * Clase generada para crear funciones globales o comunes entre clases del proyecto.
 */
public class CommonUtils {

	/**
	 * Metodo que permite mostrar un mensaje al usuario.
	 * @param severity {@link Severity} objeto que indica el tipo de mensaje a mostrar. 
	 * @param summary {@link String} titulo del mensaje.
	 * @param detail {@link String} detalle del mensaje.
	 */
   public static void mostrarMensaje(Severity severity, String summary, String detail) {
	   FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(severity,summary,detail));
   }

}
