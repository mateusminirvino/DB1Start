package br.com.db1.aula11;

public class Calculadora {
	
	public int somarDoisNumeros(Integer numeroUm, Integer numeroDois){
		return numeroUm + numeroDois;
	}
	
	public int subtrairDoisNumeros(Integer numeroUm, Integer numeroDois) {
		return numeroUm - numeroDois;
	}
	
	public int multiplicarDoisNumeros(Integer numeroUm, Integer numeroDois) {
		return numeroUm * numeroDois;
	}

	public int dividirDoisNumeros(Integer numeroUm, Integer numeroDois) {
		return numeroUm / numeroDois;
	}
	
	public String verificaNumeroPar(Integer numero) {
		String resultado;
		if (numero % 2 > 0)
		resultado = "O número é ímpar";
		else resultado = "O número é par";		
		return resultado;
	}
	
	public int verificaMaiorNumero(Integer numeroUm, Integer numeroDois) {
		if (numeroUm > numeroDois)
			return numeroUm;
		else 
			return numeroDois;
	}
	
	public Integer contaImparAteCem(Integer numeroInicial) {
		Integer i;
		Integer count = 0;
		for (i=numeroInicial; i<100; i++) {
			if (i % 2 > 0)
				count = count+1;
		}
		return count;
	}
}
