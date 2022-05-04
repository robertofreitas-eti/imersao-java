package br.eti.freitas.consultorio.beans;

import java.util.Date;

public class Gerente extends Funcionario {

	private String departamentoResponsavel;

	public Gerente() {	
	}
	
	public Gerente(String cpf, String nome, String fone, Date dataAdmissao, Date dataDemissao, double salario,
			String departamento, String departamentoResponsavel) {
		super(cpf, nome, fone, dataAdmissao, dataDemissao, salario, departamento);
		this.departamentoResponsavel = departamentoResponsavel;
	}

	public String getDepartamentoResponsavel() {
		return departamentoResponsavel;
	}

	public void setDepartamentoResponsavel(String departamentoResponsavel) {
		this.departamentoResponsavel = departamentoResponsavel;
	}	
	
}
