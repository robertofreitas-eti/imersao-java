package br.eti.freitas.aula07.beans;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private int media;
	private int falta;
	private int idade;
	
	public Aluno() {		
	}
	
	public Aluno(String nome, int media, int falta, int idade) {
		this.nome = nome;
		this.media = media;
		this.falta = falta;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}

	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
		
	@Override
	public int compareTo(Aluno outroAluno) {
		return this.nome.compareToIgnoreCase(outroAluno.getNome());
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", media=" + media + ", falta=" + falta + ", idade=" + idade + "]";
	}
	
}
