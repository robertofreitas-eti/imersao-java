package br.eti.freitas.aula06.implementacao;

import br.eti.freitas.aula06.beans.Bacharelado;
import br.eti.freitas.aula06.beans.Medio;

public class ExecutarFormacao {

	public static void main(String[] args) {
	
		Medio med1 = new Medio("Ensino medio", 0, 50, (short) 1, "Obrigatório" );
		
		Bacharelado bac1 = new Bacharelado("Administração de Empresas", 0, 950, (short) 4, (short) 6, "Com extensão");
	}
	
}
