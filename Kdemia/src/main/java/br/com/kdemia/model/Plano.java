package br.com.kdemia.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Plano")
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
	
	@ManyToMany(cascade = { CascadeType.ALL }) 
	@JoinTable(name = "Plano_Modalidade",
			  joinColumns = { @JoinColumn(name = "id_plano") },
			  inverseJoinColumns = { @JoinColumn(name = "id_modalidade") })
    private List<Modalidade> modalidades;
	
	@ManyToMany(cascade = { CascadeType.ALL }) 
	@JoinTable(name = "Plano_Extra",
			  joinColumns = { @JoinColumn(name = "id_plano") },
			  inverseJoinColumns = { @JoinColumn(name = "id_extra") })
    private List<Extra> extras;

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
