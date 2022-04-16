package beans;

public class Produto {

	private String nome;
	private String marca;
	private double valor;
	private boolean promocao;

	/*
	 * Construtor DEFAULT 
	 * 
	 * O construtor default é opcional, porém sempre que forem implementados construturoes
	 * customizados deverá ser declarado o construtor default
	 */
	public Produto() {	
	}
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public Produto(String nome, String marca, double valor) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}

	public Produto(String nome, String marca, double valor, boolean promocao) {
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
		this.promocao = promocao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	public String detalhes() {
		return "Produto {nome=" + nome + '\'' +
				", marca=" + marca + '\'' +
				", valor=" + valor + 
				", promocao=" + promocao + 
				"}";
	}

}
