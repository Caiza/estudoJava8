package cursoAlura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenarString {

	public static void main(String[] args) {
		List<String> frutas= new ArrayList<String>();
		frutas.add("uva");
		
		frutas.add("maça");
		frutas.add("pera");
		frutas.add("banana");
		
		
		
		
		Collections.sort(frutas);
	//	System.out.print(frutas);
		
		//Clase anonima
		Comparator<String> comparadorPorTamanho = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			if(o1.length()<o2.length())
				return -1;
			if(o1.length()>o2.length())
				return 1;
			return 0;
			}
		};
		
		//List tem o método sort
		frutas.sort(comparadorPorTamanho);

	//	System.out.print(frutas);
		
		//clase anonima
		Consumer<String> consumidor = new Consumer() {

			@Override
			public void accept(Object t) {
				System.out.println(t);
				
			}
			
		};
		frutas.forEach(consumidor);
		// imprime a lista de frutas
//		for(String fruta: frutas) {
//			System.out.print(fruta);
//		}
		//lambda
		frutas.forEach(fruta -> System.out.println(fruta));
		
		frutas.sort((o1, o2) -> {
			if(o1.length()<o2.length())
				return -1;
			if(o1.length()>o2.length())
				return 1;
			return 0;
		});
		
		frutas.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()) );
		
		frutas.sort(Comparator.comparing(s -> s.length()));
		frutas.sort(Comparator.comparing(String::length));
		Function<String, Integer>  funcao= String::length;
		frutas.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println("lista de frutas:"+frutas);
		
	}
	


}
