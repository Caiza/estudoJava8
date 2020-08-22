package cursoArrayList;

import java.util.HashSet;
import java.util.Set;

public class EstudoSet {

	public static void main(String[] args) {
		
		//set eh um conjunto, ele n�o possui uma lista. O set � adequado utilizar quando necessario achar um elemento pq tem uma boa performance.
		// o set n�o aceita elementos repetidos.
		//um conjunto n�o garante ordem de inser��o
		Set<String> alunos = new HashSet<>();
		
		alunos.add("BB");
		alunos.add("AA");
		alunos.add("FF");
		alunos.add("DD");
		alunos.add("EE");
		
		System.out.println(alunos);
		//vantagem de usar o set -> rapidos ao utilizar contains e remove. Ideal utilizar em listas mt grandes
		//desvantagem n�o consigo usar o sort pq n�o da para ordar. N�o eh pessivel acessar uma possi��o especifica i.e. get(0)
		boolean alunoMatriculado = alunos.contains("BB");
		System.out.println(alunoMatriculado);
	}

}
