package br.eti.freitas.consultorio.beans;

import java.util.Date;

public class Funcionario extends Pessoa {

	private Date dataAdmissao;
	private Date dataDemissao;
	private double salario;
	private String departamento;

	public Funcionario() {	
	}
	
	public Funcionario(String cpf, String nome, String fone, Date dataAdmissao, Date dataDemissao, double salario, String departamento) {
		super(cpf, nome, fone);
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.salario = salario;
		this.departamento = departamento;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Date getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
