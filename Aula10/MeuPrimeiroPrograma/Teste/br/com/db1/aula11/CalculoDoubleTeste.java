package br.com.db1.aula11;

import org.junit.Assert;
import org.junit.Test;

public class CalculoDoubleTeste {
	
	CalculoDouble calculo = new CalculoDouble();
	
	@Test
	public void deveRetornarOMenorValorEntreDoisNumeros() {
		double resultado = calculo.menorValorEntreDoisNumeros(5.0, 10.0);
		Assert.assertEquals(5.0, resultado, 0.0);
	}
	
	@Test
	public void deveRetornarOMenorValorEntreTresNumeros() {
		double resultado = calculo.menorValorEntreTresNumeros(6.0, 7.0, 5.0);
		Assert.assertEquals(5.0, resultado, 0.0);
	}
	
	@Test
	public void deveRetornarAMediaEntreTresNumeros() {
		double resultado = calculo.calculaMediaDeTresNumeros(2.0, 1.0, 3.0);
		Assert.assertEquals(2.0, resultado, 0.0);
	}
	
	@Test
	public void deveRetornarAreaTriangulo() {
		double resultado = calculo.calculaAreaTriangulo(3.0, 10.0);
		Assert.assertEquals(15.0, resultado, 0.0);
	}

}
