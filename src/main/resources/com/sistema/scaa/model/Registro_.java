package com.sistema.scaa.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-02-21T00:37:55.794-0300")
@StaticMetamodel(Registro.class)
public class Registro_ {
	public static volatile SingularAttribute<Registro, String> uuid;
	public static volatile SingularAttribute<Registro, String> especie;
	public static volatile SingularAttribute<Registro, Float> tamanho;
	public static volatile SingularAttribute<Registro, Float> peso;
	public static volatile SingularAttribute<Registro, String> localApreencao;
	public static volatile SingularAttribute<Registro, Date> dataApreencao;
	public static volatile SingularAttribute<Registro, String> situacaoSaude;
	public static volatile SingularAttribute<Registro, String> destinoFinal;
	public static volatile SingularAttribute<Registro, String> cpfTutor;
	public static volatile SingularAttribute<Registro, String> nomeTutor;
	public static volatile SingularAttribute<Registro, String> celular;
	public static volatile SingularAttribute<Registro, Date> criacao;
	public static volatile SingularAttribute<Registro, Date> edicao;
}
