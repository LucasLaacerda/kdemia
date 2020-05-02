package br.com.kdemia.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.junit.Test;

import br.com.kdemia.model.Modalidade;

public class HibernateUtilTest {
    private List<Modalidade> modalidades = new ArrayList<Modalidade>();

	
	@Test
	public void conectar(){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
	
	
	
	
}