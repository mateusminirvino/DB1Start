package br.com.db1.recibo.pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
	
	EntityManager em;

	@Before
	public void setUp() {
		EntityManagerFactory efm = Persistence.createEntityManagerFactory("db1start");
		em = efm.createEntityManager();
		em.getTransaction().begin();
	}

	@After
	public void after() {
		em.getTransaction().commit();

		em.close();
	}

	@Test
	public void deveSalvarUmaPessoa() {
		Pessoa pessoa = new Pessoa("Mateus", "108744871");
		em.persist(pessoa);
	}
	
	@Test
	public void deveAlterarPessoa() {
		Query query = em.createQuery("select c from Pessoa c where c.nome = :pNome");
		query.setParameter("pNome", "Mateus");
		query.setMaxResults(1);
		Pessoa pessoa = (Pessoa)query.getSingleResult();
		pessoa.alteraNome("José");
		em.persist(pessoa);
		
	}

}
