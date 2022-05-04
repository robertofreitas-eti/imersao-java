package br.eti.freitas.aula07.beans;

public class Livro implements Comparable<Livro>  {

	private String titulo;
	private String ator;
	private String isbn;
	private int paginas;
	private float preco;

	public Livro() {	
	}
	
	public Livro(String titulo, String ator, String isbn, int paginas, int preco) {
		this.titulo = titulo;
		this.ator = ator;
		this.isbn = isbn;
		this.paginas = paginas;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAtor() {
		return ator;
	}
	public void setAtor(String ator) {
		this.ator = ator;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public float getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", preco=" + preco + "]\n";
	}
	
	@Override
	public int compareTo(Livro outroLivro) {
		return this.titulo.compareToIgnoreCase(outroLivro.getTitulo());
	}
}
