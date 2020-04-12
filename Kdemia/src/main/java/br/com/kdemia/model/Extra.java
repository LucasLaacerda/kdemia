package br.com.kdemia.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity //Entidade do hibernate - > Tabela
public class Extra extends GenericDomain{
	//ID foi herdado do GenericDomain
	
	@Column(length = 50,unique = true, nullable = false)
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
