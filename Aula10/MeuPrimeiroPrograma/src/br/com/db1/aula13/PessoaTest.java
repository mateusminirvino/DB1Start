package br.com.db1.aula13;

import org.junit.Assert;
import org.junit.Test;



public class PessoaTest {
	
	@Test
	public void Testar(){
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Mateus");
		Assert.assertEquals("Mateus", pessoa.getNome());
	}

}
