package com.sistema.scaa.mb;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.sistema.scaa.model.Registro;



@Named
@ViewScoped
public class CadastroRegistroMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Registro registro = new Registro();
	
	private String idRegistro;
	
	@Inject
	private RegistroService registroService;
	
	
	public void inicializar() {
		if (idRegistro != null) {
			registro = registroService.porId(idRegistro);
		}
	}
	
	
	public String salvar() {
		registroService.salvar(registro);
		return "lista-registro.xhtml?faces-redirect=true";
	}
	
	public String excluir() {
		registroService.excluir(registro);
		return "lista-registro.xhtml?faces-redirect=true";
	}


	public Registro getRegistro() {
		return registro;
	}


	public void setRegistro(Registro registro) {
		this.registro = registro;
	}


	public String getIdRegistro() {
		return idRegistro;
	}


	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}

}
