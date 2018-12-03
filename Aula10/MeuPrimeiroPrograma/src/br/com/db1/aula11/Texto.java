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
		String texto = " DB1START ";
		return texto.length();
	}
	
	public int contarLetrasExcluindoEspacos() {
		String textoInicial = " DB1START ";
		String textoFinal = textoInicial.trim();
		return textoFinal.length();
	}

}
