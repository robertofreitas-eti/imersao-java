package br.eti.freitas.aula09.implementacao;

import br.eti.freitas.aula09.beans.Cliente;
import br.eti.freitas.aula09.beans.ContaCorrente;
import br.eti.freitas.aula09.excecao.ContaCorrenteException;

public class ExecutarContaBancaria {

	public static void main(String[] Args) throws ContaCorrenteException {

		Cliente cli1 = new Cliente("Fausto Silva", "11200922332", "+55 11 99562-5643");
		Cliente cli2 = new Cliente("Pamela Rodrigues", "992065522332", "+55 11 88562-5643");

		ContaCorrente cc1 = new ContaCorrente(102001, 150.10, 0.00, cli1);
		ContaCorrente cc2 = new ContaCorrente(103001, 150.10, 0.00, cli2);

		System.out.println(cc1.toString());
		System.out.print(cc2.toString());

		System.out.println("\n\n-------------- LIMITE\n");
		try {

			System.out.println("Definir limite: " + cc1.definirLimite(-200.13));

		} catch (ContaCorrenteException ex) {
			System.out.println("Code: " + ex.getCode() );
			System.out.println("Mensagem: " + ex.getMessage() );
		} catch (Exception ex) {
			System.out.println("Exceção padrão...");
		}
		
		System.out.println("\n\n-------------- DEPOSITO\n");
		try {

			System.out.println("Efetuar depósito: " + cc1.deposito(-200.13));

		} catch (ContaCorrenteException ex) {
			System.out.println("Code: " + ex.getCode() );
			System.out.println("Mensagem: " + ex.getMessage() );
		} catch (Exception ex) {
			System.out.println("Exceção padrão...");
		}

		System.out.println("\n\n-------------- SAQUE\n");
		try {

			System.out.println("Efetuar saque: " + cc1.saque(50000.00));

		} catch (ContaCorrenteException ex) {
			System.out.println("Code: " + ex.getCode() );
			System.out.println("Mensagem: " + ex.getMessage() );
		} catch (Exception ex) {
			System.out.println("Exceção padrão...");
		}
		
	}

}
