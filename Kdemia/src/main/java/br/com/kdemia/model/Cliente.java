package br.com.kdemia.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Cliente extends GenericDomain{

	@Column(nullable = false)
	private String matricula;
	
	@Column(nullable = false)
	private Boolean saude;
	
	@Column(nullable = false)
	private Boolean emDia;
	
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal apagar;	
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Plano plano;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Boolean getSaude() {
		return saude;
	}

	public void setSaude(Boolean saude) {
		this.saude = saude;
	}

	public Boolean getEmDia() {
		return emDia;
	}

	public void setEmDia(Boolean emDia) {
		this.emDia = emDia;
	}

	public BigDecimal getApagar() {
		return apagar;
	}

	public void setApagar(BigDecimal apagar) {
		this.apagar = apagar;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	
}
