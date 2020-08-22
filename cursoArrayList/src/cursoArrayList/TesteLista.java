package cursoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteLista {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("XXXXXXXXXXX", 20);
		Aula a2 = new Aula("yyyyyyyyyyy", 15);
		Aula a3 = new Aula("ccccccccccc", 16);
		Aula a4 = new Aula("ddddddddddd", 19);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		
		System.out.println(aulas);
		//ordena e compara a lista de aulas comparando com o numero de alunos
		Collections.sort(aulas, Comparator.comparing(Aula::getNumeroAlunos));
		
		System.out.println(aulas);
	}

}
