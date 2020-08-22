package cursoArrayList;

import java.util.HashSet;
import java.util.Set;

public class EstudoSet {

	public static void main(String[] args) {
		
		//set eh um conjunto, ele não possui uma lista. O set é adequado utilizar quando necessario achar um elemento pq tem uma boa performance.
		// o set não aceita elementos repetidos.
		//um conjunto não garante ordem de inserção
		Set<String> alunos = new HashSet<>();
		
		alunos.add("BB");
		alunos.add("AA");
		alunos.add("FF");
		alunos.add("DD");
		alunos.add("EE");
		
		System.out.println(alunos);
		//vantagem de usar o set -> rapidos ao utilizar contains e remove. Ideal utilizar em listas mt grandes
		//desvantagem não consigo usar o sort pq não da para ordar. Não eh pessivel acessar uma possição especifica i.e. get(0)
		boolean alunoMatriculado = alunos.contains("BB");
		System.out.println(alunoMatriculado);
	}

}
