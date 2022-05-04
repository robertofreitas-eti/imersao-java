package br.eti.freitas.aula05.beans;

public class Produto {
	
	private int codigo;
	private Double preco;
	private String descricao;

	public Produto() {	
	}
	
	public Produto(int codigo, Double preco, String descricao) {
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", preco=" + preco + ", descricao=" + descricao + "]";
	}

}
