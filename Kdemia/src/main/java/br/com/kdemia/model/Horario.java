package br.com.kdemia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity //Entidade do hibernate - > Tabela
public class Horario extends GenericDomain{
	
	//Modalidade
	@ManyToOne //Uma Modalidade possui varios horarios
	@JoinColumn(nullable = false)
	private Modalidade modalidade;
	
	@Column(nullable = false)
	//@Temporal(TemporalType.DATE)
	private String dia; //Segunda,Terça,Quarta,Quinta...
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date hora;

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	} 
	
	
	
	
}
