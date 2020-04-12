package br.com.kdemia.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//Class usada para todas as tabelas
//Nao é uma tabela
//Class utilizada por outras para gerar tabela
//Forma de compartilhar a chave primaria
@SuppressWarnings("serial")
@MappedSuperclass
public class GenericDomain implements Serializable{
	
	@Id //Indica que quem herdar essa class vai ter essa chave primaria
	@GeneratedValue(strategy = GenerationType.AUTO) //Banco gerencia a minha chave auto incremento
	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	
	

}
