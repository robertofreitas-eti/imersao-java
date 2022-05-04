package br.eti.freitas.aula05.implementacao;

import br.eti.freitas.aula05.beans.Celular;
import br.eti.freitas.aula05.beans.Livro;
import br.eti.freitas.aula05.beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {

		Produto produto01 = new Produto(10101, 2400.00, "Notebook Lenovo");
		Produto produto02 = new Produto(10102, 3500.00, "Notebook Dell");
	
		Livro livro01 = new Livro(202001, 130.00, "Simbolo Perdido", "QISEKD02872-888DEJNB","Dan Brown");
		Livro livro02 = new Livro(202002, 180.00, "Inferno", "YRTYU776666-888DEJNB","Dan Brown");
		
		Celular celular01 = new Celular(40112, 2123.30, "Iphone S", 8, 64);
		Celular celular02 = new Celular(40113, 4566.20, "Iphone S PLUS", 16, 128);

		/**
		 * Dados básicos de produto
		 */
		System.out.println(produto01.toString());
		System.out.println(produto02.toString());

		/**
		 * Dados de celular (herança de livro)
		 */
		System.out.println(livro01.toString());
		System.out.println(livro02.toString());
		
		/**
		 * Dados de celular (herança de produto)
		 */
		System.out.println(celular01.toString());
		System.out.println(celular02.toString());
		
	}

}
