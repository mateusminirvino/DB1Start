package br.com.db1.db1start.Polimorfismo;

public class Diretor extends Funcionario implements Autenticavel{

	@Override
	public String autenticar() {
		return "Diretor Autenticando";
	}

	@Override
	public Boolean estaLogado() {
		return null;
	}

}
