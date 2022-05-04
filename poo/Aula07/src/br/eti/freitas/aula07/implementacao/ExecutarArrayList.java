package br.eti.freitas.aula07.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.eti.freitas.aula07.beans.Aluno;

public class ExecutarArrayList {

	public static void main(String[] args) {
	
		// 
		List<String> listaNomes = new ArrayList<String>();
		
		// Carrega lista
		listaNomes.add("Ana");
		listaNomes.add("Maria");
		listaNomes.add("Tania");
		listaNomes.add("Isilda");
		listaNomes.add("Carolina");
		listaNomes.add("Josefa");
		
		// Mostra posições
		System.out.println("Lista: " + listaNomes);
		
		// Adiciona CAMILINHA na posição 1
		listaNomes.add(1,"CAMILINHA");

		// Exibe lista
		System.out.println("Lista: " + listaNomes);
		
		// Classifica lista por ordem alfabetica
		Collections.sort(listaNomes);

		// Exibe lista após classificação
		System.out.println("Lista: " + listaNomes);
		
		// Pesquisar
		
		String nomePesquisado = JOptionPane.showInputDialog("Nome a pesquisar: ");
		int posicao = listaNomes.indexOf(nomePesquisado);
		
		if (posicao >= 0 ) {
			System.out.println("Achei na posição " + posicao + " nome " + listaNomes.get(posicao));
		} else {
			System.out.println("Não localizado!");
		}
		
		///// Utilizando objeto para carregar a lista
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();

		// Cria objetos com aluno
		Aluno al1 = new Aluno("Roberto",7,2,16);
		Aluno al2 = new Aluno("Maria",4,22,17);
		Aluno al3 = new Aluno("Celina",8,8,13);

		// Adiciona objetos de alunos a lista
		listaAlunos.add(al1);		
		listaAlunos.add(al2);		
		listaAlunos.add(al3);		

		// Classifica a lista
		Collections.sort(listaAlunos);
		
		System.out.println(listaAlunos);
		
		
	}
	
}
