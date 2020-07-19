package cursoAlura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
		
		//soma os codigos > 50
		int sum = listaTelefone.stream()
		.filter(s -> s.getCodigo() > 50)
		.mapToInt(Telefone::getCodigo)
		.sum();
		System.out.println(sum);
		
		//vai retornar se existe algum telefone com codigo  = 71
		Optional<Telefone> optionalTelefone = listaTelefone.stream()
				.filter(s -> s.getCodigo() == 71)
				.findAny();
		
		Telefone telefone = optionalTelefone.orElse(null);
		System.out.println(telefone.getEstado());
		
		listaTelefone.stream()
				.filter(s -> s.getCodigo() == 71)
				.findAny()
				.ifPresent(s -> System.out.println(s.getEstado()));
		
		listaTelefone = listaTelefone.stream()
				.filter(s -> s.getCodigo() > 50)
				.collect(Collectors.toList());
		
		//listaTelefone.parallelStream() //utilizar que tiver uma lista enorme
		listaTelefone.stream()
				.filter(s-> s.getCodigo()> 10)
				.collect(Collectors.toMap(
						s-> s.getEstado(), s-> s.getCodigo()))
				.forEach((estado, codigo) -> System.out.println(estado + " = " + codigo));
	}
	
	

}
