package br.com.db1.aula11;

import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTeste {
	
	@Test
	public void deveSomarDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		int valorDaSoma = calculadora.somarDoisNumeros(2, 3);
		Assert.assertEquals(5, valorDaSoma);
	}
	
	@Test
	public void deveSubtrairDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		int valorSubtracao = calculadora.subtrairDoisNumeros(10, 5);
		Assert.assertEquals(5, valorSubtracao);
	}

	@Test
	public void deveMultiplicarDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		int valorMultiplicacao = calculadora.multiplicarDoisNumeros(50, 2);
		Assert.assertEquals(100, valorMultiplicacao);
	}
	
	@Test
	public void deveDividirDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		int valorDivisao = calculadora.dividirDoisNumeros(9, 3);
		Assert.assertEquals(3, valorDivisao);
	}
	
	@Test
	public void deveDizerSeONumeroEImpar() {
		Calculadora calculadora = new Calculadora();
		String valor = calculadora.verificaNumeroPar(9);
		Assert.assertEquals("O número é ímpar", valor);
	}
	
	@Test
	public void deveDizerSeONumeroEPar() {
		Calculadora calculadora = new Calculadora();
		String valor = calculadora.verificaNumeroPar(8);
		Assert.assertEquals("O número é par", valor);
	}
	
	@Test
	public void deveDizerNumeroMaior() {
		Calculadora calculadora = new Calculadora();
		int valor = calculadora.verificaMaiorNumero(7, 3);
		Assert.assertEquals(7, valor);
	}
	
	@Test
	public void deveContarQuantidadeDeImpares() {
		Calculadora calculadora = new Calculadora();
		Integer valor = calculadora.contaImparAteCem(0);
		Assert.assertSame(50, valor);
	}
}
