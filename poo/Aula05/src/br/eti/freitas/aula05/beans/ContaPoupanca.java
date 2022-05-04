package br.eti.freitas.aula05.beans;

public class ContaPoupanca {

	private double rendimento;

	public ContaPoupanca() {
	}

	public ContaPoupanca(double rendimento) {
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public boolean creditarRendimento(double Rendimento) {
		if (rendimento > 0) {
			this.rendimento = Rendimento;
			return true;
		} else {
			return false;
		}
	}

}
