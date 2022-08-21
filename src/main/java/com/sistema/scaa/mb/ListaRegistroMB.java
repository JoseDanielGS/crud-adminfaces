package com.sistema.scaa.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.sistema.scaa.model.Registro;
import com.sistema.scaa.util.FacesUtil;



@Named
@ViewScoped
public class ListaRegistroMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private RegistroService registroService;
	
	private List<Registro> registros = new ArrayList<>();
	
	private List<Registro> registroSelecionadas = new ArrayList<>();
	
	
	@PostConstruct
	public void inicializar() {
		registros = registroService.listAll();
	}
	
	public void excluirSelecionados() {
		for (Registro registro : registroSelecionadas) {
			registroService.excluir(registro);
			registros.remove(registro);
		}
		
		FacesUtil.addInfoMessage("Registro(s) excluída(s) com sucesso!");
	}

	public List<Registro> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Registro> registros) {
		this.registros = registros;
	}

	public List<Registro> getRegistroSelecionadas() {
		return registroSelecionadas;
	}

	public void setRegistroSelecionadas(List<Registro> registroSelecionadas) {
		this.registroSelecionadas = registroSelecionadas;
	}	

}
