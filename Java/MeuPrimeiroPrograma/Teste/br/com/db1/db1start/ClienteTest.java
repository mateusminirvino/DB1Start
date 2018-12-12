package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;



public class ClienteTest {
	
	@Test
	public void deveRetornarNomeMaiusculo() {
		Cliente cliente = new Cliente("Maiko Cunha");
		
		String nomeMaiusculo = cliente.trataNome(TratamentoNome.UPPERCASE);
		
		Assert.assertEquals("MAIKO CUNHA", nomeMaiusculo);
	}
	
	@Test
	public void deveRetornarNomeMinusculo() {
		Cliente cliente = new Cliente("Maiko Cunha");
		
		String nomeMinusculo = cliente.trataNome(TratamentoNome.LOWERCASE);
		
		Assert.assertEquals("maiko cunha", nomeMinusculo);
	}

}
