package br.eti.freitas.aula09.implementacao;

import javax.swing.JOptionPane;

import br.eti.freitas.aula09.beans.Login;

public class ExecutarLogin {

	public static void main(String[] args) {
	
		String usuario = JOptionPane.showInputDialog("Usuario de acesso: ");
		String senha = JOptionPane.showInputDialog("Senha de acesso: ");
		
		Login login = new Login();
		
		if (login.fazerLogin(usuario, senha)) {
			System.out.println("Acesso liberado!");
		} else {
			System.out.println("Crendenciais inválidas!");
		}
		
	}
	
}
