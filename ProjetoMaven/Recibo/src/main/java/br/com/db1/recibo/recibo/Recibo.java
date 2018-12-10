package br.com.db1.recibo.recibo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.recibo.pessoa.Pessoa;

@Entity
@Table(name = "recibo")
public class Recibo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "valor", precision = 14, scale = 2, nullable = false)
	private Double valor;

	@ManyToOne
	@JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = false)
	private Pessoa cliente;

	@ManyToOne
	@JoinColumn(name = "emitente_id", referencedColumnName = "id", nullable = false)
	private Pessoa emitente;

	@Column(name = "data", nullable = false)
	private LocalDate data;

}
