package br.com.kdemia.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@SuppressWarnings("serial")
@Entity
public class Instrutor extends GenericDomain {
	
	
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	@Column(nullable = false)
	private float salario;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
