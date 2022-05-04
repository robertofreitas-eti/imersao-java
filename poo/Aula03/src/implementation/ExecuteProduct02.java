package implementation;

import javax.swing.JOptionPane;

import beans.Product;

public class ExecuteProduct02 {

	public static void main(String[] args) {

		Product p01 = new Product(); 

		p01.setName(JOptionPane.showInputDialog("Nome do produto:"));
		p01.setBrand(JOptionPane.showInputDialog("Marca do produto:"));
		p01.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Valor do produto:")));
		p01.setOnOffer( JOptionPane.showConfirmDialog(null, "Produto em promoção:","Pergunta",JOptionPane.YES_NO_OPTION) == 0 ? true : false);
		JOptionPane.showMessageDialog( null, p01.details());
	}

}
