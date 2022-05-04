package br.eti.freitas.poo.aula04.implementacao;

import br.eti.freitas.poo.aula04.beans.Motor;
import br.eti.freitas.poo.aula04.beans.Veiculo;

public class ExecutarVeiculo {

	public static void main(String[] args) {

			Veiculo fusca = new Veiculo();
			Veiculo kombi = new Veiculo();
			
			Motor vw1600 = new Motor(1600, 4, "Gasolina");
			Motor vw1200 = new Motor(1200, 4, "Gasolina");
			
			fusca.setModelo("Fusca");
			fusca.setCategoria("Classico");
			fusca.setPlaca("FUW9992");
			fusca.setPortas(4);
			fusca.setMotorizacao(vw1600);
			
			fusca.acelerar();
			fusca.getMotoriizacao().ligar();
			
			
	}

}
