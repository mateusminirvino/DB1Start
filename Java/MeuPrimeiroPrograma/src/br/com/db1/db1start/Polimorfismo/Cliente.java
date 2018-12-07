package br.com.db1.db1start.Polimorfismo;

public class Cliente implements Autenticavel{

	@Override
	public String autenticar() {
		return "Cliente Autenticando";
	}

	@Override
	public Boolean estaLogado() {
		return null;
	}

}
