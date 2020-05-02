package br.com.kdemia.util;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import br.com.kdemia.model.Instrutor;
import br.com.kdemia.model.Modalidade;
import br.com.kdemia.model.Pessoa;
import br.ocm.kdemia.dao.InstrutorDAO;
import br.ocm.kdemia.dao.ModalidadeDAO;
import br.ocm.kdemia.dao.PessoaDAO;

public class ModalidadeDAOTest {
	
	@Test
	@Ignore
	public void salvar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setAtivo(true);
		pessoa.setCep("1234");
		pessoa.setCpf("4321");
		pessoa.setEmail("l@gmail.com");
		pessoa.setIdade((short)14);
		pessoa.setNome("Lucas");
		pessoa.setRg("MG18428");
		pessoa.setTelefone("339733591");
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		float salario = (float)5.000;
		Instrutor instru = new Instrutor();
		instru.setPessoa(pessoa);
		instru.setSalario(salario);
		InstrutorDAO instruDAO = new InstrutorDAO();
		instruDAO.salvar(instru);
		Modalidade modalidade = new Modalidade();
		modalidade.setDescricao("Funcional");
		modalidade.setAlunos((short) 0);
		modalidade.setAtivo(true);
		modalidade.setInstrutor(instru);
		ModalidadeDAO modalDAO = new ModalidadeDAO();
		modalDAO.salvar(modalidade);
	}
	@Test
	public void listar() {
		ModalidadeDAO modalDAO = new ModalidadeDAO();
		List<Modalidade> resultado = modalDAO.listar();
		
		
		for(Modalidade modal : resultado){
			System.out.println("-------- Modalidade ---------");
			System.out.println("Descrição: "+modal.getDescricao());
			System.out.println("Instrutor: "+modal.getInstrutor().getPessoa().getNome());
			System.out.println("Alunos:    "+modal.getAlunos());
			System.out.println("Ativo:     "+modal.getAtivo());
			System.out.println("ID:        "+modal.getCodigo());

		}
	}

}
