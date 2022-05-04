package br.eti.freitas.aula09.excecao;

public enum ErrorCode {

	SALDOINVALIDO("Saldo inválido"),
	VALORINVALIDO("Valor inválido"),
	DEPOSITOINVALIDO("Depósito inválido");
	
	private String descricao;

	ErrorCode(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
