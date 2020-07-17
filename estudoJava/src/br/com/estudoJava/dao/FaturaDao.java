package br.com.estudoJava.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import br.com.estudoJava.Fatura;

public class FaturaDao {
	
	public List<Fatura> buscarFaturaVencida(){
		
		//simula o banco
		
		Fatura f1 = new Fatura("pedro@gmail.com", 300, LocalDate.now().minusDays(2));
		Fatura f2 = new Fatura("joana@gmail.com", 100, LocalDate.now().minusWeeks(1).minusDays(2));
		Fatura f3 = new Fatura("maria@gmail.com", 500, LocalDate.now().minusYears(1));
		
		return Arrays.asList(f1, f2, f3);
		
	}	

}
