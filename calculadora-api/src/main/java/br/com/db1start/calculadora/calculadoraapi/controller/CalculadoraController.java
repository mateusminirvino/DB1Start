package br.com.db1start.calculadora.calculadoraapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1start.calculadora.calculadoraapi.model.Calculadora;
import br.com.db1start.calculadora.calculadoraapi.model.OperacaoMatematica;
import br.com.db1start.calculadora.calculadoraapi.service.CalculadoraService;

@RestController
@RequestMapping("api/calculadora")
public class CalculadoraController {
	
	@Autowired
	private CalculadoraService calculadoraService;
	
	@GetMapping
	public Calculadora salvaCalculo(@RequestParam("numeroUm") Double numeroUm, @RequestParam("numeroDois") Double numeroDois, @RequestParam("operacao") OperacaoMatematica operacao) {
		Calculadora calculadora = calculadoraService.salvarOperacao(numeroUm, numeroDois, operacao);
		return calculadora;
	}

}
