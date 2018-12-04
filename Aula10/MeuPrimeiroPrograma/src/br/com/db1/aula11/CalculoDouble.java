package br.com.db1.aula11;

public class CalculoDouble {
	
	public double menorValorEntreDoisNumeros(double numero1, double numero2) {
		if (numero1>numero2)
			return numero2;
		else
			return numero1;
	}
	
	public double menorValorEntreTresNumeros(double numero1, double numero2, double numero3) {
		if (numero1>numero2) {
			if (numero2>numero3) {
				return numero3;
			}
			else {
				return numero2;
			}
		}
		else {
				if (numero1>numero3) {
					return numero3;
				}
				else {
					return numero1;
				}
			}
		}
	
	public double calculaMediaDeTresNumeros(double num1, double num2, double num3) {
		double media = (num1+num2+num3)/3;
		return media;
	}
	
	public double calculaAreaTriangulo(double base, double altura) {
		double area = (base*altura)/2;
		return area;
	}
}
