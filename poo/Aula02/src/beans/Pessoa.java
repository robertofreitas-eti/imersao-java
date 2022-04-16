package beans;

public class Pessoa {

	private int id;
	private String nome;
	private int idade;
	private String sentimento;
	private String cidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSentimento() {
		return sentimento;
	}

	public void setSentimento(String sentimento) {
		this.sentimento = sentimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	// Métodos
	public void comer(String refeicao) {
		System.out.println("Tipo de refeição: " + refeicao);
		this.sentimento = "Relaxado e tranquilo";
	}

	public void dormir(int tempo) {

		if (tempo <= 4) {
			System.out.println("Dormuiu muito pouco!");
		} else if (tempo > 4 && tempo <= 6) {
			System.out.println("Dormiu bem!");
		} else if (tempo > 6 && tempo <= 8) {
			System.out.println("Dormiu suficiente!");
		} else {
			System.out.println("Preguiçoso!");			
		}

	}

}
