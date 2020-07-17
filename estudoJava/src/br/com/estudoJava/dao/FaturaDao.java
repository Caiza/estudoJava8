package br.com.estudoJava.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.estudoJava.Fatura;

public class FaturaDao {

	List<Fatura> faturasVencidas = new ArrayList<Fatura>();
	
	//simula o banco
	
	Fatura f1 = new Fatura("pedro@gmail.com", 100, LocalDate.now().minusDays(2));
	Fatura f2 = new Fatura("maria@gmail.com", 50, LocalDate.now().minusMonths(2));
	Fatura f3 = new Fatura("carol@gmail.com", 1000, LocalDate.now().minusWeeks(3).minusDays(1));
	
	public List<Fatura> buscarFaturaVencida() {
		return Arrays.asList(f1, f2, f3);
	}
	
	
}
