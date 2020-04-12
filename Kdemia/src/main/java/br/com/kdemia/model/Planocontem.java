package br.com.kdemia.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Planocontem extends  GenericDomain{
	
	@ManyToOne //Uma Modalidade possui varios horarios
	@JoinColumn(nullable = false)
	private Plano plano;
	
	@ManyToOne //Uma Modalidade possui varios horarios
	@JoinColumn(nullable = false)
	private Modalidade modalidade;
	
	@ManyToOne //Uma Modalidade possui varios horarios
	@JoinColumn(nullable = false)
	private Extra extra;

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Extra getExtra() {
		return extra;
	}

	public void setExtra(Extra extra) {
		this.extra = extra;
	}
	
	
	
}
