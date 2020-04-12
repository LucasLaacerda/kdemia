package br.com.kdemia.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Plano extends GenericDomain{

	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Short quanModalidade;
	
	@Column(nullable = false)
	private Short quanExtra;
	
	@Column(nullable = false)
	private String duracao; //Mensal,Semestre ou Anual
	
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal valor;
	
	@Column(nullable = false)
	private Short adquirentes;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Short getQuanModalidade() {
		return quanModalidade;
	}

	public void setQuanModalidade(Short quanModalidade) {
		this.quanModalidade = quanModalidade;
	}

	public Short getQuanExtra() {
		return quanExtra;
	}

	public void setQuanExtra(Short quanExtra) {
		this.quanExtra = quanExtra;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Short getAdquirentes() {
		return adquirentes;
	}

	public void setAdquirentes(Short adquirentes) {
		this.adquirentes = adquirentes;
	}

	
}
