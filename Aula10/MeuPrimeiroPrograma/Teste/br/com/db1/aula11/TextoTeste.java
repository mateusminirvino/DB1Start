package br.com.db1.aula11;

import org.junit.Assert;
import org.junit.Test;


public class TextoTeste {
	
	Texto texto = new Texto();
	
	@Test
	public void deveTransformarTextoEmMaiuscula() {
		String textoTransformado = texto.transformarTextoParaMaiuscula("olá mundo");
		Assert.assertEquals("OLÁ MUNDO", textoTransformado);
	}
	
	@Test
	public void deveTransformarTextoEmMinuscula() {
		String textoTransformado = texto.transformarTextoParaMinuscula("BEM-VINDO");
		Assert.assertEquals("bem-vindo", textoTransformado);
	}
	
	@Test
	public void deveRetornarQuantidadeDeLetras() {
		int quantidade = texto.contarLetras();
		Assert.assertEquals(8, quantidade);
	}
	
	@Test
	public void deveRetornarQuantidadeDeLetrasComEspaco() {
		int quantidade = texto.contarLetrasComEspaço();
		Assert.assertEquals(10, quantidade);
	}
	
	@Test
	public void deveRetornarAQuantidadeDeLetrasDoItem3() {
		int quantidade = texto.contarLetrasExcluindoEspacos();
		Assert.assertEquals(8, quantidade);
	}
	
	
}
