package br.eti.freitas.aula07.implementacao;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.eti.freitas.aula07.beans.Livro;

public class ExecutarLivro {

	public static void main(String[] args) {

		
		JTextField titulo = new JTextField(40);
	    JTextField autor = new JTextField(35);
	    JTextField isbn = new JTextField(15);
	    JTextField paginas = new JTextField(5);
	    JTextField preco = new JTextField(15);
		
  	    JPanel frame = new JPanel();
  	    JPanel panel = new JPanel();
  	    frame.setSize(380, 320);  	    
  	    
  	    frame.add(panel);
	    frame.setLayout(new FlowLayout());
	    frame.add(new JLabel("Titulo"));
	    frame.add(titulo);
	    frame.add(new JLabel("Autor"));
	    frame.add(autor);
	    frame.add(new JLabel("Isbn"));
	    frame.add(isbn);
	    frame.add(new JLabel("Páginas"));
	    frame.add(paginas);
	    frame.add(new JLabel("Preço"));
	    frame.add(preco);
	    
		Livro l01 = new Livro("Clipper", "Paulo Antonio Jaber", "218882111-21", 200, 432);
		Livro l02 = new Livro("ZIM", "Camoes e Silva", "2188820485787523993111-21", 20, 32);
		Livro l03 = new Livro("Oracle", "Francisco Botellho", "21888211728283731-21", 30, 210);
		Livro l04 = new Livro("SQL Server", "Bill Gates", "234423218882111-21", 40, 120);

		List<Livro> listaLivros = new ArrayList<Livro>();

		listaLivros.add(l01);
		listaLivros.add(l02);
		listaLivros.add(l03);
		listaLivros.add(l04);
	    
	    
	    int result = JOptionPane.showConfirmDialog(null, frame, "Dados do Livro", JOptionPane.OK_CANCEL_OPTION);
	    if (result == JOptionPane.OK_OPTION) {
			Livro l05 = new Livro(titulo.getText(), autor.getText(), isbn.getText(), 5, 32);
			listaLivros.add(l05);
	    }
				
		Collections.sort(listaLivros);
		
		System.out.println(listaLivros);
		
	}

}
