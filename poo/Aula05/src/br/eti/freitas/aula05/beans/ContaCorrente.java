package br.eti.freitas.aula05.beans;

public class ContaCorrente extends ContaBancaria {

	private double limiteCredito;
	private double taxa;

	public ContaCorrente() {
	}

	public ContaCorrente(double limiteCredito, double taxa) {
		this.limiteCredito = limiteCredito;
		this.taxa = taxa;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public boolean definirLimite(double limiteCredito) {
		if (limiteCredito > 0) {
			this.limiteCredito = limiteCredito;
			return true;
		} else {
			return false;
		}
	}
}
