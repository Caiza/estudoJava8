package cursoAlura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemplosStreams {

	public static void main(String[] args) {
		
		List<Telefone> listaTelefone = new ArrayList<Telefone>();
		
		listaTelefone.add(new Telefone("BA", 71));
		listaTelefone.add(new Telefone("SE", 79));
		listaTelefone.add(new Telefone("SP", 11));
		listaTelefone.add(new Telefone("CE", 81));
		
		listaTelefone.sort(Comparator.comparing(Telefone::getCodigo));
		//listaTelefone.forEach(s -> System.out.println(s.getEstado()));
		
		//imprime todos os estados  com codigo > 50
		listaTelefone.stream()
		.filter(s -> s.getCodigo() > 50)
		.forEach(s -> System.out.println(s.getEstado()));
		
		//imprime todos com codigo > 50
		listaTelefone.stream()
		.filter(s -> s.getCodigo() > 50)
		.map(s -> s.getCodigo())
		.forEach(total -> System.out.println("total "+total));
		
		int sum = listaTelefone.stream()
		.filter(s -> s.getCodigo() > 50)
		.mapToInt(Telefone::getCodigo)
		.sum();
		System.out.println(sum);
		
		
	}

}
