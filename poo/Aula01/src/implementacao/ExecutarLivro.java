package implementacao;


import java.util.Scanner;

import beans.Livro;

public class ExecutarLivro {

	public static void main(String[] args) {
		System.out.println("Iniciando.......");
		
		// Instanciar o objeto
		Livro livro1 = new Livro();
		
		// carregando os valores nos atributos do objeto
		livro1.titulo = "O Simbolo Perdido";
		livro1.autor = "Dan Brown";
		livro1.edicao = "3a. edi��o";
		livro1.preco = 230.00;
		
		System.out.println("Dados do livro 1");
		System.out.println("Titulo: " + livro1.titulo);
		System.out.println("Autor: " + livro1.autor);
		System.out.println("Edi��o: " + livro1.edicao);
		System.out.println("Pre�o: " + livro1.preco);

		Livro livro2 = new Livro();

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o titulo: ");
		livro2.titulo = sc.next();
		
		System.out.print("Digite o autor: ");
		livro2.autor = sc.next();

		System.out.print("Digite a edi��o: ");
		livro2.edicao = sc.next();		
		
		System.out.print("Digite o pre�o: ");
		livro2.preco = sc.nextDouble();
		
		System.out.println("Dados do livro 2");
		System.out.println("Titulo: " + livro2.titulo);
		System.out.println("Autor: " + livro2.autor);
		System.out.println("Edi��o: " + livro2.edicao);
		System.out.println("Pre�o: " + livro2.preco);
		
		sc.close();
		
	}

}
