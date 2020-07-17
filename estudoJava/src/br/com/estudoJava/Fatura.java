package br.com.estudoJava;

import java.time.LocalDate;

public class Fatura {
	
	private String emailDevedor;
	private double valor;
	private LocalDate dataVencimento;
	
	public Fatura(String emailDevedor, double valor, LocalDate dataVencimento) {
		this.emailDevedor = emailDevedor;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	

}
