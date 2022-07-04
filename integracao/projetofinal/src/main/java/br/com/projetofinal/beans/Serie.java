package br.com.projetofinal.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_serie")
public class Serie {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="tb_serie_pk")
	@SequenceGenerator(name="serie_sq", sequenceName="serie_sq")	
	private int id;

	@Column(name="genero", length = 70)
	private String genero;
	
	@Column(name="titulo", length = 70)
	private String titulo;
	
	@Column(name="sinopse", length = 2400)
	private String sinopse;

	@Column(name="lancamento", length = 70)
	private String lancamento;
	
	@ManyToOne
	@JsonIgnoreProperties("series")
	private Provedora provedora;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public Provedora getProvedora() {
		return provedora;
	}

	public void setProvedora(Provedora provedora) {
		this.provedora = provedora;
	}

}
