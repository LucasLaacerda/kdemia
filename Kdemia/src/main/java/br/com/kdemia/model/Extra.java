package br.com.kdemia.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity //Entidade do hibernate - > Tabela
@Table(name = "Extra")
public class Extra extends GenericDomain{
	//ID foi herdado do GenericDomain
	
	@Column(length = 50,unique = true, nullable = false)
	private String descricao;

	@ManyToMany(mappedBy = "extras")
    private List<Plano> Planos;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
