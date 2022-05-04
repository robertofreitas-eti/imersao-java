package br.eti.freitas.aula09.beans;

public class Login {

	private String usuario;
	private String senha;
	
	// Usuario default
	private String usuarioPadrao = "admin";
	private String senhaPadrao = "123567";
	
	public Login() {	
	}
	
	public Login(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean fazerLogin(String usuario, String senha) {
		try {
			if (usuario.equalsIgnoreCase(this.usuarioPadrao) && senha.equalsIgnoreCase(this.senhaPadrao)) {
				return true;
			} else {
				throw new Exception("Log: Usuário inválido - " + usuario);
			}				
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return false;
		
	}
}
