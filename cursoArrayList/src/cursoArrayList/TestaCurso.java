package cursoArrayList;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("c1", "caiza");
	
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		javaColecoes.adiciona(new Aula("Aula3", 21));
		
		javaColecoes.adiciona(new Aula("Aula4", 20));
		javaColecoes.adiciona(new Aula("Aula2", 18));
		
		
		Aluno a1 = new Aluno("caiza", 11);
		Aluno a2 = new Aluno("maria", 22);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		
		//O melhor jeito de ordenar uma unmodifiable list seguindo algum critério é nos aproveitarmos da possibilidade de 
		//poder *passar a unmodifiable list no construtor de uma ArrayList tradicional* , podendo assim utilizar o método .sort() de Collections.
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getNumeroAlunos());
		
		System.out.println(javaColecoes);
		
		System.out.println("Quem é o aluno com cpf 11");	
		
		Aluno aluno = javaColecoes.buscaMatriculado(11);
		
		System.out.println("aluno : " + aluno);	
	
	}

}
