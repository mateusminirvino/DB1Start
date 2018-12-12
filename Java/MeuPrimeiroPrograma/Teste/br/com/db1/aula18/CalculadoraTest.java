package br.com.db1.aula18;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void deveSomarDoisNumeros() {
		Calculadora calculadora = new Calculadora(2.0,2.0);
		
		Double resultado = calculadora.recebeOperacao(Operacao.SOMA);
		
		Assert.assertEquals(4, resultado, 0);
	}
	
	@Test
	public void deveSubtrairDoisNumeros() {
		Calculadora calculadora = new Calculadora(3.0,1.0);
		
		Double resultado = calculadora.recebeOperacao(Operacao.SUBTRACAO);
		
		Assert.assertEquals(2, resultado, 0);
	}
	
	@Test
	public void deveDividirDoisNumeros() {
		Calculadora calculadora = new Calculadora(6.0,2.0);
		
		Double resultado = calculadora.recebeOperacao(Operacao.DIVISAO);
		
		Assert.assertEquals(3, resultado, 0);
	}
	
	@Test
	public void deveMultiplicarDoisNumeros() {
		Calculadora calculadora = new Calculadora(7.0,2.0);
		
		Double resultado = calculadora.recebeOperacao(Operacao.MULTIPLICACAO);
		
		Assert.assertEquals(14, resultado, 0);
	}

}
