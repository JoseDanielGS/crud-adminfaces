package com.sistema.scaa.mb;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.sistema.scaa.dao.RegistroDAO;
import com.sistema.scaa.model.Registro;



public class RegistroService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private RegistroDAO registroDAO;	
	
	
	public void salvar(Registro registro) {
		if (registro.isInclusao()) {
			registro.setCriacao(new Date());
		}
		
		if (registro.isEdicao()) {
			registro.setEdicao(new Date());
		}
		
		registroDAO.salvar(registro);
	}
	
	public void excluir(Registro registro) {
		registroDAO.excluir(registro);
	}
	
	
	public List<Registro> listAll() {
		return registroDAO.listAll();
	}
	
	public Registro porId(String id) {
		return registroDAO.porId(id);
	}

}
