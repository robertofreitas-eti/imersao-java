package br.eti.freitas.aula08.implementacao;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class ExecutarControleAcesso {

	public static void main(String[] args) {

		Set<String> controleAcesso = new HashSet<String>();
		System.out.println("> Controle de acesso iniciado... ");

		while (true) {			
			
		    String entradaSaida = JOptionPane.showInputDialog("Informe <E>ntrada, <S>a�da ou Sai<R>: ");
		    
		    if (entradaSaida.equalsIgnoreCase("e") || entradaSaida.equalsIgnoreCase("s")) {
			    String cracha = JOptionPane.showInputDialog("C�digo do crach�: ");

				if (entradaSaida.equalsIgnoreCase("E")) {
					if (!controleAcesso.contains(cracha)) {
						controleAcesso.add(cracha);
						JOptionPane.showInternalMessageDialog(null, "Bem vindo!\nAcesso liberado! [" + cracha + "]");
					} else {
						JOptionPane.showInternalMessageDialog(null, "Entrada j� registrada!");
					}	
				} else if (entradaSaida.equalsIgnoreCase("S")) { 
					if (controleAcesso.contains(cracha)) {
						controleAcesso.remove(cracha);
						JOptionPane.showInternalMessageDialog(null, "Obrigado pela visita");
					} else {
						JOptionPane.showInternalMessageDialog(null, "Saida n�o autorizada!\nEntrada n�o registrada!");
					}
				} 
				System.out.println(controleAcesso);		    	
		    } else if (entradaSaida.equalsIgnoreCase("r")) {
				System.out.println("> Controle de acesso finalizado... ");
		    	break;
		    } else {
		    	JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
		    }
		}
	
	}

}
