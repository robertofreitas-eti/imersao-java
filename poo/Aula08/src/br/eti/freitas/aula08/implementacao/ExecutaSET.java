package br.eti.freitas.aula08.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutaSET {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		
		// Adicioanar item ao hashset
		hashSet.add("Vermelho");
		hashSet.add("Preto");
		hashSet.add("Amarelo");
		hashSet.add("Rosa");
		hashSet.add("Preto"); // importante lembrar que não permite duplicidade

		// Listar conteúdo
		System.out.println(hashSet);
		System.out.println("\n");
		
		// Percorrer conteúdo
	    System.out.println("Percorrendo hashset");
		for (String item : hashSet) {
			System.out.println("Conteudo: " + item);
		}
		System.out.println("\n");
	
		// Testar se está vazio
		System.out.println("Hashset está vazio?:" + hashSet.isEmpty());
		System.out.println("\n");

		// Remover a cor Amarelo
		System.out.println("Remover registro: " + hashSet.remove("Amarelo"));

		// Listar conteúdo
		System.out.println(hashSet);
		System.out.println("\n");

		// Adicionar 
		hashSet.add("Pink");

		// Remover a cor Amarelo
		System.out.println("Remover registro: " + hashSet.remove("Cinza"));

		// Listar conteúdo
		System.out.println(hashSet);
		System.out.println("\n");
		
	}
	
}
