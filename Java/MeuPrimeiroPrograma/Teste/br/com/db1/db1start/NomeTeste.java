package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class NomeTeste {
	
	@Test
	public void deveTransformarParaLetraMaiuscula(){
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("mateus minirvino");
		System.out.println(valorTransformado);
		Assert.assertEquals("MATEUS MINIRVINO", valorTransformado);
	}
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("Mateus Minirvino");
		Assert.assertEquals(16, tamanhoDoNome);
	}

}
