package br.eti.freitas.aula10.beans;

public class Veiculo {

	private String placa;
	private String modelo;
	private int potencia;
	private String proprietario;
	
	public Veiculo() {	
	}
	
	public Veiculo(String placa, String modelo, int potencia, String proprietario) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.potencia = potencia;
		this.proprietario = proprietario;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
}
