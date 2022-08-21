package com.sistema.scaa.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.sistema.scaa.model.Registro;

public class RegistroDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Registro salvar(Registro tarefa) {
		return manager.merge(tarefa);
	}
	
	public void excluir(Registro registro) {
		try {
			registro = porId(registro.getUuid());
			manager.remove(registro);
			manager.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Registro porId(String uuid) {		
		return manager.find(Registro.class, uuid);
	}
	
	public List<Registro> listAll() {
		return manager.createNativeQuery("SELECT * FROM Registr", Registro.class).getResultList();
	}

}
