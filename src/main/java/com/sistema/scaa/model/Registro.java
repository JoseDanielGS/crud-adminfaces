package com.sistema.scaa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="registro", schema = "teste")
public class Registro implements Serializable{

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getLocalApreencao() {
		return localApreencao;
	}

	public void setLocalApreencao(String localApreencao) {
		this.localApreencao = localApreencao;
	}

	public Date getDataApreencao() {
		return dataApreencao;
	}

	public void setDataApreencao(Date dataApreencao) {
		this.dataApreencao = dataApreencao;
	}

	public String getSituacaoSaude() {
		return situacaoSaude;
	}

	public void setSituacaoSaude(String situacaoSaude) {
		this.situacaoSaude = situacaoSaude;
	}

	public String getDestinoFinal() {
		return destinoFinal;
	}

	public void setDestinoFinal(String destinoFinal) {
		this.destinoFinal = destinoFinal;
	}

	public String getCpfTutor() {
		return cpfTutor;
	}

	public void setCpfTutor(String cpfTutor) {
		this.cpfTutor = cpfTutor;
	}

	public String getNomeTutor() {
		return nomeTutor;
	}

	public void setNomeTutor(String nomeTutor) {
		this.nomeTutor = nomeTutor;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

//	@GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid")
//    @Column(columnDefinition = "VARCHAR(32)")
//    @Id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String uuid;
	
	@Column private String especie;
	
	@Column private float tamanho;
	
	@Column	private float peso;
	
	@Column	private String localApreencao;
	
	@Column	private Date dataApreencao;
	
	@Column	private String situacaoSaude;
	
	@Column	private String destinoFinal;
	
	@Column	private String cpfTutor;
	
	@Column	private String nomeTutor;
	
	@Column	private String celular;
	
	public Date getCriacao() {
		return criacao;
	}

	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}

	public Date getEdicao() {
		return edicao;
	}

	public void setEdicao(Date edicao) {
		this.edicao = edicao;
	}

	@Column private Date criacao;
	
	@Column private Date edicao;
	
	
	public boolean isInclusao() {
		return getUuid() == null ? true : false;
	}
	
	public boolean isEdicao() {
		return !isInclusao();
	}
	
}
