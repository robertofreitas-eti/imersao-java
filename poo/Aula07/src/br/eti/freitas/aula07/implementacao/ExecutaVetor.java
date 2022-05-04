package br.eti.freitas.aula07.implementacao;

import br.eti.freitas.aula07.beans.Aluno;

public class ExecutaVetor {

	public static void main(String[] args) {
		
		// Cria um vetor com 3 elementos (lembre-se que começa do zero)
		String listaNome[] = {"MARIA", "ANA", "JOSE"};
		
		System.out.println("Tamanho do vetor: " + listaNome.length);
		System.out.println("\n");
		
		// Apresenta valor que está no indice 1 do vetor
		System.out.println("Indice [" + 1 + "] = " + listaNome[1]);
		System.out.println("\n");

		// Tenta atribuir um valor a 3 posição do vetor
		try {
			listaNome[3] = "MARCO POLO";			
		} catch(Exception e) {
			System.out.println("ERRO: Erro ao atribuir valor ao vetor");
			System.out.println("DESCRIPTION" + e);
		}
		System.out.println("\n");

		// Lista valores do vetor
		for (int posicao = 0; posicao < listaNome.length; posicao ++) {
			System.out.println("Indice [" + posicao + "] = " + listaNome[posicao]);
		}
		System.out.println("\n");

		
		// Criando vetor com objeto
		Aluno[] listaAlunos = new Aluno[3];
		
		listaAlunos[0] = new Aluno("Roberto",7,2,16);
		listaAlunos[1] = new Aluno("Maria",4,22,17);
		listaAlunos[2] = new Aluno("Celina",8,8,13);
		
		for (int posicao = 0; posicao < listaAlunos.length; posicao ++) {
			System.out.println("Indice [" + posicao + "] = " + listaAlunos[posicao].getNome() + " Media: " + listaAlunos[posicao].getMedia());
		}
		System.out.println("\n");		
		
		
	}
}
