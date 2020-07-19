package cursoAlura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadas = LocalDate.of(2021, Month.JUNE, 5);
		int anos = olimpiadas.getYear() - hoje.getYear();
		System.out.println(anos);
		Period periodo = Period.between(hoje, olimpiadas);
		System.out.println(periodo.getDays());
		
		System.out.println("proxima olimpiada "+olimpiadas.plusYears(4));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("proxima olimpiada "+olimpiadas.plusYears(4).format(formatter));
		
		//dia de hj com o formato
		System.out.println(LocalDateTime.now().format(formatter));
		
		DateTimeFormatter formatDia = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(LocalDateTime.now().format(formatDia));
		
		System.out.println(LocalTime.of(15,30));
		
	}
}
