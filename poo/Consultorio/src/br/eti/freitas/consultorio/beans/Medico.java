package br.eti.freitas.consultorio.beans;

import java.util.Date;

public class Medico extends Funcionario {

	private String crm;
	private String especialidade;

	/**
	 * Construtor
	 */
	public Medico() {
	}

	public Medico(String cpf, String nome, String fone, Date dataAdmissao, Date dataDemissao, double salario,
			String departamento, String crm, String especialidade) {
		super(cpf, nome, fone, dataAdmissao, dataDemissao, salario, departamento);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	/**
	 * Getters + Setters
	 */
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
