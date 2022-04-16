package implementacao;

import beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {

		/*
		 * Produto 01
		 */
		Produto p01 = new Produto();
		p01.setNome("Notebook Lenovo");
		p01.setValor(3100);
		
		System.out.println("Nome: " + p01.getNome() + "\nMarca: " + p01.getMarca() + "\nValor R$: " + p01.getValor()  + "\nPromoção: " + p01.isPromocao() + "\n");
		
		
		/*
		 * Produto 02
		 */
		Produto p02 = new Produto();
		p02.setMarca("EPSON");
		p02.setNome("CX5600");
		p02.setValor(450);

		System.out.println("Nome: " + p02.getNome() + "\nMarca: " + p02.getMarca() + "\nValor R$: " + p02.getValor()  + "\nPromoção: " + p02.isPromocao() + "\n");


		/*
		 * Produto 03
		 */
		Produto p03 = new Produto("Monitor", "AOC", 450.56);

		System.out.println("Nome: " + p03.getNome() + "\nMarca: " + p03.getMarca() + "\nValor R$: " + p03.getValor()  + "\nPromoção: " + p03.isPromocao() + "\n");

		
		/*
		 * Produto 04
		 */
		Produto p04 = new Produto("iMac", "Apple", 7650.43, true);

		System.out.println("Nome: " + p04.getNome() + "\nMarca: " + p04.getMarca() + "\nValor R$: " + p04.getValor()  + "\nPromoção: " + p04.isPromocao() + "\n");
		
	}

}
