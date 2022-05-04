package br.eti.freitas.aula05.beans;

public class Banco {

	private int id; 
	private String razaoSocial; 

	public Banco() {	
	}
	
	public Banco(int id, String razaoSocial) {
		this.id = id;
		this.razaoSocial = razaoSocial;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
}
