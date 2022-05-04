package br.eti.freitas.aula09.excecao;

public enum ErrorCode {

	SALDOINVALIDO("Saldo inv�lido"),
	VALORINVALIDO("Valor inv�lido"),
	DEPOSITOINVALIDO("Dep�sito inv�lido");
	
	private String descricao;

	ErrorCode(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
