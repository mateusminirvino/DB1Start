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
		Assert.assertEquals(8, quantidade);
	}
	
	@Test
	public void deveRetornarAStringDoItem3() {
		String resultado = texto.retirarEspacos();
		Assert.assertEquals("DB1START", resultado);
	}
	
	@Test
	public void deveRetornarAsQuatroPrimeirasLetrasDoNome() {
		String resultado = texto.exibirQuatroPrimeirasLetrasDoNome("Mateus Clemente Minirvino");
		Assert.assertEquals("Mate", resultado);
	}
	
	@Test
	public void deveRetornarAPartirDaTerceiraLetraDoNome() {
		String resultado = texto.exibirAPartirDaTerceiraLetraDoNome("Mateus Clemente Minirvino");
		Assert.assertEquals("eus Clemente Minirvino", resultado);
	}
	
	@Test
	public void deveRetornarAsQuatroUltimasLetrasDoNome() {
		String resultado = texto.exibirQuatroUltimasLetrasDoNome("Mateus Clemente Minirvino");
		Assert.assertEquals("vino", resultado);
	}
	
	@Test
	public void deveSubstituirNomePorAluno() {
		String resultado = texto.substituirNomePorAluno("Mateus Clemente Minirvino");
		Assert.assertEquals("Aluno Clemente Minirvino", resultado);
	}
	
	@Test
	public void deveQuebrarOTextoPorVirgula() {
		String resultado [] = texto.separarTextoPorVirgula();
		String arrayExperado [] = new String [resultado.length];
		arrayExperado[0] = "banana";
		arrayExperado[1] = "maçã";
		arrayExperado[2] = "melancia";
		Assert.assertArrayEquals(arrayExperado, resultado);
		}
	
	@Test
	public void deveContarAQuantidadeDeVogais() {
		int quantidade = texto.contaVogais("Tudo bem?");
		Assert.assertEquals(3, quantidade);
	}
	
	@Test
	public void deveInverterOTexto() {
		String resultado = texto.inverterTexto("Mateus");
		Assert.assertEquals("suetaM", resultado);
	}
}
