package implementation;

import javax.swing.JOptionPane;

import beans.Product;

/**
 * This example uses gets and setters for entry data
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class ExecuteProduct01 {

	public static void main(String[] args) {

		/*
		 * Get data through default constructor 
		 */
		Product p01 = new Product();
		p01.setName("Notebook Lenovo");
		p01.setPrice(3100);
		
		JOptionPane.showMessageDialog(null, p01.details());
		
		
		/*
		 * Get data through custom constructor 
		 */
		Product p02 = new Product();
		p02.setBrand("EPSON");
		p02.setName("CX5600");
		p02.setPrice(450);

		JOptionPane.showMessageDialog(null, p02.details());


		/*
		 * Get data through custom constructor 
		 */
		Product p03 = new Product("Monitor", "AOC", 450.56);

		JOptionPane.showMessageDialog(null, p03.details());

		
		/*
		 * Produto 04 - Utilizando construtor customizado com 4 parametros de entrada
		 */
		Product p04 = new Product("iMac", "Apple", 7650.43, true);

		JOptionPane.showMessageDialog(null, p04.details());
		
	}

}
