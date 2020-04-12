package br.com.kdemia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@SuppressWarnings("serial")
@Entity //Entidade do hibernate - > Tabela
public class Modalidade extends GenericDomain{

	@Column(length = 50, nullable = false)
	private String descricao;
	
	//Tabela Instrutor -> Id instrutor
	@JoinColumn(nullable = false)
	@ManyToOne
	private Instrutor instrutor;
	
	//Tabela Horario -> Id horario
	
	
	
	@Column(nullable = false)
	private Short alunos;
	
	
	@Column(nullable = false)
	private Boolean ativo;


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Instrutor getInstrutor() {
		return instrutor;
	}


	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
	}
	

	public Short getAlunos() {
		return alunos;
	}


	public void setAlunos(Short alunos) {
		this.alunos = alunos;
	}


	public Boolean getAtivo() {
		return ativo;
	}


	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	

}
