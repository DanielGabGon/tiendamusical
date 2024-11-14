package com.dangabito.tiendamusicalweb.controllers;

import java.io.Serializable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;

import com.dangabito.tiendamusicalentities.entities.Persona;
import com.dangabito.tiendamusicalservices.service.LoginService;
import com.dangabito.tiendamusicalweb.utils.CommonUtils;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

/**
 * @author Dangabito Controlador que se encarga del flujo de la pantalla de
 *         login.xhtml
 */
@Named
@RequestScope
public class LoginController implements Serializable {
	
	@Autowired
	private LoginService loginServiceImlp;

	/**
	 * @return the loginServiceImlp
	 */
	public LoginService getLoginServiceImlp() {
		return loginServiceImlp;
	}

	/**
	 * @param loginServiceImlp the loginServiceImlp to set
	 */
	public void setLoginServiceImlp(LoginService loginServiceImlp) {
		this.loginServiceImlp = loginServiceImlp;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void init() {
		System.out.println("Inicializando login......");
	}
	
	/**
	 * Metodo que permite a la persona ingresar a su pantalla de home.
	 */
	public void entrar() {
		Persona personaConsultada=this.loginServiceImlp.consultarUsuarioLogin(this.usuario, this.password);
		
		
		
		if(personaConsultada!=null){
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_INFO, "¡EXITOSO!", "Bienvenido al home");
		}else {
			System.out.println("LLEgando aqui");
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "¡UPS!", "El usuario y/o contraseña son incorrectos");
		}
	}
	
	

	/**
	 * Usuario capturado por la persona.
	 */
	private String usuario;
	/**
	 * Contraseña capturada por la persona.
	 */
	private String password;
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
