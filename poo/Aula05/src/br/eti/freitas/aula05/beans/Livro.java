package br.eti.freitas.aula05.beans;

public class Livro extends Produto {

	private String isbn;
	private String autor;
		
	public Livro() {
	}

	public Livro(int codigo, Double preco, String descricao, String isbn, String autor) {
		super(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
//
//	@Override
//	public String toString() {
//		return "Livro [codigo=" + this.getCodigo() + ", preco=" + this.getPreco() + ", descricao=" + this.getDescricao() + ", isbn=" + isbn + ", autor=" + autor + "]";
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +  ", Livro [isbn=" + isbn + ", autor=" + autor + "]";
//		};
	}
	
	
	
}
