package br.com.db1.recibo.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", length = 60, nullable = false)
	private String nome;

	@Column(name = "documento", length = 11, nullable = false)
	private String documento;

	protected Pessoa() {

	}

	public Pessoa(String nome, String documento) {
		this.nome = nome;
		this.documento = documento;
	}

	public void alteraNome(String string) {
		this.nome = string;
	}

}
