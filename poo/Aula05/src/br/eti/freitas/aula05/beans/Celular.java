package br.eti.freitas.aula05.beans;

public class Celular extends Produto {

	private int cameraMega;
	private int armazenamento;
	
	public Celular() {
	}
	
	public Celular(int codigo, Double preco, String descricao, int cameraMega, int armazenamento) {
		super(codigo, preco, descricao);
		this.cameraMega = cameraMega;
		this.armazenamento = armazenamento;
	}
	
	public int getCameraMega() {
		return cameraMega;
	}
	public void setCameraMega(int cameraMega) {
		this.cameraMega = cameraMega;
	}
	
	public int getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	@Override
	public String toString() {
		return "Celular [codigo=" + this.getCodigo() + ", preco=" + this.getPreco() + ", descricao=" + this.getDescricao() + ", cameraMega=" + cameraMega + ", armazenamento=" + armazenamento + "]";
	}
	
}
