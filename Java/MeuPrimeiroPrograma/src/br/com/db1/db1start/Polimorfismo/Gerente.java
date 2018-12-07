package br.com.db1.db1start.Polimorfismo;

public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public String autenticar() {
		return "Gerente Autenticando";
	}

	@Override
	public Boolean estaLogado() {
		return null;
	}

}
