package br.eti.freitas.aula06.beans;
/**
 * Uso de classe abstrata e herança
 * 
 * @author Roberto Freitas
 */
public abstract class Formacao {

	private String descricao;
	private int duracao;
	private float mensalidade;
	private short periodo;

	public Formacao() {	
	}
	
	public Formacao(String descricao, int duracao, float mensalidade, short periodo) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
		this.periodo = periodo;
	}


	/**
	 * Getters e Setters
	 */
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public short getPeriodo() {
		return periodo;
	}

	public void setPeriodo(short periodo) {
		this.periodo = periodo;
	}

	/**
	 * Métodos (sobrecarga + polimorfismo)
	 */
	public float retornarMedia(float ps1, float ps2) {
		return ((ps1 + ps2) / 2);
	}
	
	public float retornarMedia(float ps1, float ps2, float nac1, float nac2) {
		return ((ps1 + ps2) / 2) + ((nac1 + nac2) / 2) + 2;
	}
	
	public float retornarMedia(float ps1, float ps2, float nac1, float nac2, float am1, float am2) {
		return ((ps1 + ps2) / 2) + ((nac1 + nac2) / 2) + 2 + ((am1 + am2) / 2) + 4;
	}
	
	/**
	 * Métodos (não foi utilizado interface)
	 */
	public void definirDuracao() {
		System.out.println("Método não 'definirDuracao' implementado em formação!");
	}

	public void calcularMensalidade(double valor) {
		System.out.println("Método não 'calcularMensalidade' implementado em formação!");		
	}
	
}
