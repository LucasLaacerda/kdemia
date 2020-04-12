package br.com.kdemia.model;

import javax.persistence.Column;
import javax.persistence.Entity;


@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain{

	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 14, nullable = false)
	private String cpf;
	
	@Column(length = 12, nullable = false)
	private String rg;
	
	@Column(length = 10, nullable = false)
	private String cep;
	
	@Column(length = 13, nullable = false)
	private String telefone;

	@Column(length = 100, nullable = false)
	private String email;
	
	@Column(nullable = false)
	private Short idade;
	
	@Column(nullable = false)
	private Boolean ativo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getIdade() {
		return idade;
	}

	public void setIdade(Short idade) {
		this.idade = idade;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
			

	
}
