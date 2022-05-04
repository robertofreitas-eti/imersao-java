package br.eti.freitas.aula09.beans;

import br.eti.freitas.aula09.excecao.ContaCorrenteException;
import br.eti.freitas.aula09.excecao.ErrorCode;

public class ContaCorrente {

	private int numero;
	private Double saldo;
	private Double limiteCredito;
	private Cliente cliente;
	
	public ContaCorrente() {	
	}
	
	public ContaCorrente(int numero, Double saldo, Double limiteCredito, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limiteCredito = limiteCredito;
		this.cliente = cliente;
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

	public Double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Boolean saque(Double valor) throws ContaCorrenteException {
		if ((this.saldo + this.limiteCredito) > valor) {
			this.saldo -= valor;
			System.out.println(String.format("Efetuado saque no valor de %.2f.", valor));
			return true;
		} else {
			//System.out.println("Valor do saque superior ao disponível na conta!");
			//return false ;
			throw new ContaCorrenteException("Valor do saque superior ao disponível na conta!", ErrorCode.SALDOINVALIDO);
		}
	}
	
	public Boolean deposito(Double valor) throws ContaCorrenteException {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println(String.format("Efetuado deposito efetuado no valor de %.2f.", valor));			
			return true;		
		} else {
			//System.out.println("Valor para depósito inválido!");			
			//return false;		
			throw new ContaCorrenteException("Valor para depósito inválido!", ErrorCode.DEPOSITOINVALIDO);
		}
	}
	
	public Boolean definirLimite(Double valor) throws ContaCorrenteException {
		if (valor > 0) {
			System.out.println(String.format("Efetuado ajuste no limite de crédito para %.2f.", valor));
			return true;								
		} else {
			//System.out.println("Valor do limite inválido!");
			//return false;					
			throw new ContaCorrenteException("Valor do limite inválido!", ErrorCode.VALORINVALIDO);
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", saldo=" + saldo + ", limiteCredito=" + limiteCredito
				+ ", cliente=" + cliente + "]";
	}
	
}
