package br.eti.freitas.aula06.beans;

public class Bacharelado extends Formacao {

	private short cargaHorariaEstagio;
	private String projetoConclusao;

	public Bacharelado() {	
	}
	
	public Bacharelado(String descricao, int duracao, float mensalidade, short periodo, short cargaHorariaEstagio, String projetoConclusao) {
		super(descricao, duracao, mensalidade, periodo);
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.projetoConclusao = projetoConclusao;
	}

	public short getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(short cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	@Override
	public void calcularMensalidade(double fator) {
		setMensalidade((float) (getMensalidade() * fator * 200));
	}	
	
	@Override
	public void definirDuracao( ) {
		if (getDescricao().toLowerCase().contains("engenharia")) {
			setDuracao(48);
		} else {
			setDuracao(60);
		}
	}
}
