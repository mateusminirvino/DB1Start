package br.com.db1start.aula10;

public class MinhaPrimeiraClasse {   //As classes podem ser private ou protected

		public static void main(String[] args) {
		/*	System.out.println("Olá Mundo!");
			Integer numeroASerVerificado = 3;
			boolean eVerdade = numeroASerVerificado ==3;
			boolean eVerdadeNumeroImpar = numeroASerVerificado % 2 > 0;
			System.out.println(eVerdade);
			System.out.println(eVerdadeNumeroImpar);
			*/
			
			Integer resultadoDaSoma = MinhaPrimeiraClasse.somar(1,10);
			Integer resultadoDaDivisao = MinhaPrimeiraClasse.dividir(15, 2);
			Integer resultadoDaSubtracao = MinhaPrimeiraClasse.subtrair(10, 5);
			Integer resultadoDaMultiplicacao = MinhaPrimeiraClasse.multiplicar(2, 3);
			MinhaPrimeiraClasse.imprimirValor(resultadoDaSoma);
			MinhaPrimeiraClasse.imprimirValor(resultadoDaDivisao);
			MinhaPrimeiraClasse.imprimirValor(resultadoDaSubtracao);
			MinhaPrimeiraClasse.imprimirValor(resultadoDaMultiplicacao);
		}
		
		public static Integer somar (Integer numeroUm, Integer numeroDois) {
			return numeroUm + numeroDois;
		}
		
		public static void imprimirValor(Integer valor) {
			System.out.println(valor);
		}
		
		public static Integer dividir (Integer numeroUm, Integer numeroDois) {
			return numeroUm / numeroDois;
		}
		
		public static Integer subtrair(Integer numeroUm, Integer numeroDois) {
			return numeroUm-numeroDois;
		}
		
		public static Integer multiplicar(Integer numeroUm, Integer numeroDois) {
			return numeroUm * numeroDois;
		}
		
}
