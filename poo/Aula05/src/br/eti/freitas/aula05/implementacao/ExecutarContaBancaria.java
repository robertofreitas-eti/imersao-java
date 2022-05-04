package br.eti.freitas.aula05.implementacao;

import br.eti.freitas.aula05.beans.Banco;
import br.eti.freitas.aula05.beans.Cliente;
import br.eti.freitas.aula05.beans.ContaBancaria;

public class ExecutarContaBancaria {

	public static void main(String[] Args) {

		Banco bco1 = new Banco(237, "Bradesco");
		Banco bco2 = new Banco(341, "Itau");
				
		Cliente cli1 = new Cliente("Fausto Silva", "11200922332", "+55 11 99562-5643");
		Cliente cli2 = new Cliente("Pamela Rodrigues", "992065522332", "+55 11 88562-5643");
		Cliente cli3 = new Cliente("Camila Pitanga", "936465522332", "+55 11 87562-5645");

		ContaBancaria cc1 = new ContaBancaria(102001, 150.10, bco1, cli1);
		ContaBancaria cc2 = new ContaBancaria(103001, 150.10, bco1, cli2);
		ContaBancaria cc3 = new ContaBancaria(322009, 2000.10,bco2, cli3);
		
		System.out.println(cc1.toString());
		System.out.print(cc2.toString());
		System.out.print(cc3.toString());

	}

}
