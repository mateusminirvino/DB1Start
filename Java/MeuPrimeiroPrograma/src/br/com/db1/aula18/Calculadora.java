package br.com.db1.aula18;

public class Calculadora {

	private Double num1;
	private Double num2;
	
	public Calculadora(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Double recebeOperacao(Operacao operacao) {
		return operacao.executorDeOperacoes(this.num1, this.num2);
		
	}
	
}
