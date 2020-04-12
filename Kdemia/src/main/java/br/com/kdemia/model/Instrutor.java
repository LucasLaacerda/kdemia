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
	
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal salario;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
	
}
