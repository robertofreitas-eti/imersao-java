package br.eti.freitas.aula05.beans;

public class ContaBancaria {

	private Banco banco;
	private int numero;
	private int agencia;
	private Double saldo;
	private Cliente cliente;
	
	public ContaBancaria() {	
	}
	
	
	public ContaBancaria(Banco banco, int numero, int agencia, Double saldo, Cliente cliente) {
		this.banco = banco;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	
	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Boolean saque(Double valor) {
		if (this.saldo < valor) {
			this.saldo -= valor;
			System.out.println(String.format("Efetuado saque no valor de %.2f.", valor));
			return true;
		} else {
			System.out.println("Valor do saque superior ao disponível na conta!");
			return false ;
		}
	}
	
	public Boolean deposito(Double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println(String.format("Efetuado deposito efetuado no valor de %.2f.", valor));			
			return true;		
		} else {
			System.out.println("Valor para depósito inválido!");			
			return false;		
		}
	}
	
	public Boolean definirLimite(Double valor) {
		if (valor > 0) {
			System.out.println(String.format("Efetuado ajuste no limite de crédito para %.2f.", valor));
			return true;								
		} else {
			System.out.println("Valor do limite inválido!");
			return false;					
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", saldo=" + saldo //+ ", limiteCredito=" + limiteCredito
				+ ", cliente=" + cliente + "]";
	}
	
}
