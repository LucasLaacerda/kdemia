package br.com.kdemia.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.kdemia.model.Instrutor;
import br.com.kdemia.model.Modalidade;
import br.ocm.kdemia.dao.InstrutorDAO;
import br.ocm.kdemia.dao.ModalidadeDAO;

public class ModalidadeBiz {
	
	private Modalidade modalidade;
	private List<Modalidade> modalidades;
	private List<Instrutor> instrus;

	
	public Modalidade getModalidade() {
		return modalidade;
	}
	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}
	public List<Modalidade> getModalidades() {
		return modalidades;
	}
	public void setModalidades(List<Modalidade> modalidades) {
		this.modalidades = modalidades;
	}
	
	
	public void novo() {
		modalidade = new Modalidade();		
	}
	public void salvar() {
		try {
			ModalidadeDAO modalDAO = new ModalidadeDAO();
			modalDAO.merge(modalidade);
			
			modalidade = new Modalidade();
			
			
			InstrutorDAO instruDAO = new InstrutorDAO();
			instrus = instruDAO.listar("nome");
			
			modalidades = modalDAO.listar("nome");
			
			
			//Messages.addFlashGlobalInfo("Cidade cadastrada com sucesso");
		}catch (Exception e) {
			//Messages.addFlashGlobalError("Ocorreou um erro ao gerar uma nova cidades");
			e.printStackTrace();
		}
	}
	
	@PostConstruct
	public void listar() {
		try {
			ModalidadeDAO modalDAO = new ModalidadeDAO();
			modalidades = modalDAO.listar();
		}catch (Exception e) {
			//Messages.addGlobalError("Ocorreu um erro ao listar os estados");
			e.printStackTrace();
		}
		
	}
	
	public void editar() { //ActionEvent evento
		try {
			//modalidade = (Modalidade) evento.getComponent().getAttributes().get("cidadeSelecionada");
			
			InstrutorDAO instruDAO = new InstrutorDAO();
			instrus = instruDAO.listar("nome");
		}catch (Exception e) {
			//Messages.addFlashGlobalError("Ocorreou um erro ao gerar uma cidade");
			e.printStackTrace();
		}
	}
	
	public void excluir() { //ActionEvent evento
		try {
			//modalidade = (Modalidade) evento.getComponent().getAttributes().get("cidadeSelecionada");
			ModalidadeDAO modalidadeDAO = new ModalidadeDAO();
			modalidadeDAO.excluir(modalidade);
			
			modalidades = modalidadeDAO.listar();
			
			//Messages.addGlobalInfo("Cidade removida com sucesso!");
		}catch (RuntimeException e) {
			//Messages.addFlashGlobalError("Ocorreu um erro na exclusão");
			e.printStackTrace();
		}
	}
	
}
