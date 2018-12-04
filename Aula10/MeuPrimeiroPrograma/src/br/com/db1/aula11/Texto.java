package br.com.db1.aula11;

public class Texto {
	
	public String transformarTextoParaMaiuscula(String texto) {
		return texto.toUpperCase();
	}
	
	public String transformarTextoParaMinuscula(String texto) {
		return texto.toLowerCase();
	}
	
	public int contarLetras() {
		String texto = "DB1START";
		return texto.length();
	}
	
	public int contarLetrasComEspaço() {
		String textoInicial = " DB1START ";
		String textoFinal = textoInicial.trim();
		return textoFinal.length();
	}
	
	public String retirarEspacos() {
		String textoInicial = " DB1START ";
		String textoFinal = textoInicial.trim();
		return textoFinal;
	}

	public String exibirQuatroPrimeirasLetrasDoNome(String nomeCompleto) {
		return nomeCompleto.substring(0, 4);
	}
	
	public String exibirAPartirDaTerceiraLetraDoNome(String nomeCompleto) {
		return nomeCompleto.substring(3);
	}
	
	public String exibirQuatroUltimasLetrasDoNome(String nomeCompleto) {
		int tamanho = nomeCompleto.length();
		return nomeCompleto.substring(tamanho-4);
	}
	
	public String substituirNomePorAluno(String nomeCompleto) {
		/*int count = 0;
		while(nomeCompleto.charAt(count) != ' ') {
				count++;
			}
		}*/
			
		String aluno = "Aluno ";
		nomeCompleto = nomeCompleto.split(" ",2)[1];
		aluno = aluno.concat(nomeCompleto);
		return aluno;
	}
	
	public String [] separarTextoPorVirgula() {
		String texto = "banana,maçã,melancia";
		String array [] = new String [50];
		array = texto.split(",");
		return array;
	}
	
	public int contaVogais (String texto) {
		int count = 0;
		texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
				count++;
		}
		return count;
	}
	
	public String inverterTexto(String texto) {
		String textoInvertido = new StringBuilder(texto).reverse().toString();
		return textoInvertido;
	}
	
}
