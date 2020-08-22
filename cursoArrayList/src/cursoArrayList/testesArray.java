package cursoArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class testesArray {

	public static void main(String[] args) {

		String aula1 = "Java";
		String aula2 = "sql";
		String aula3 = ".Net";
		String aula4 = "Java";

		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);

		// remove primeira aula
		aulas.remove(0);

		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		Collections.sort(aulas);

		aulas.forEach(aula -> {
			System.out.println("Aulas: " + aula);
		});
	}

}
