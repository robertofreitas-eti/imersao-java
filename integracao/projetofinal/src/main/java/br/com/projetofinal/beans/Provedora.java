package br.com.projetofinal.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_provedora")
public class Provedora {

	@Id
	@Column(name = "id")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_provedora_pk")
	@SequenceGenerator(name = "provedora_sq", sequenceName = "provedora_sq")
	private int id;

	@Column(name = "nome", length = 30)
	private String nome;

	@Column(name = "site", length = 70)
	private String site;

	@Column(name = "fundacao")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	private Date fundacao;

	@OneToMany(mappedBy = "provedora", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("provedora")
	private List<Serie> series;

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

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Date getFundacao() {
		return fundacao;
	}

	public void setFundacao(Date fundacao) {
		this.fundacao = fundacao;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

}
