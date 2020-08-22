package cursoArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	
	private String instrutor;
	
	private List<Aula> aulas = new ArrayList<Aula>();

	private Map<Integer, Aluno> matriculaAluno = new HashMap<>();
	private Set<Aluno> alunos = new HashSet<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		//return aulas;
		return Collections.unmodifiableList(aulas); //lista imodificavel, somente para leitura, não consigo modificar, remover ou add
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
//	public  int getNumeroAlunos() {
//		int total = 0;
//		for (Aula aula : aulas) {
//			total += aula.getNumeroAlunos();
//		}
//		return total;
//	}

	public  int getNumeroAlunos() {
		return this.aulas.stream().mapToInt(Aula::getNumeroAlunos).sum();
	}
	
	@Override
	public String toString() {
		return " [ Curso: " + nome + ", total: " + this.getNumeroAlunos() + "aulas: " + this.aulas + " ]";
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaAluno.put(aluno.getCpf(), aluno);
	}
	
	public Aluno buscaMatriculado(int numero) {
		if(!matriculaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaAluno.get(numero);
	}
	

}
