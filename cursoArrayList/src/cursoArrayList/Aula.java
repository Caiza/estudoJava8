package cursoArrayList;

public class Aula implements Comparable<Aula>{
	
	private String nome;
	private int numeroAlunos;
	
	public Aula(String nome, int numeroAlunos) {
		this.nome = nome;
		this.numeroAlunos = numeroAlunos;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroAlunos() {
		return numeroAlunos;
	}
	public void setNumeroAlunos(int numeroAlunos) {
		this.numeroAlunos = numeroAlunos;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.nome + ", " + this.numeroAlunos + " quantidade de alunos]";
	}


	@Override
	public int compareTo(Aula outraAula) {
		return this.nome.compareTo(outraAula.nome);
	}
	
	
	
	
	

}
