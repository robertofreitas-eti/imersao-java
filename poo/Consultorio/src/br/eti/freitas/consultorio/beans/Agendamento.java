package br.eti.freitas.consultorio.beans;

import java.util.Date;

public class Agendamento {

	private Paciente paciente;
	private Medico medico;
	private Funcionario atendente;
	private Date dataHora;
	private Double valor;

	/**
	 * Construtor
	 */
	public Agendamento() {	
	}
	
	public Agendamento(Paciente paciente, Medico medico, Funcionario atendente, Date dataHora, Double valor) {
		this.paciente = paciente;
		this.medico = medico;
		this.atendente = atendente;
		this.dataHora = dataHora;
		this.valor = valor;
	}
	
	/**
	 * Getters + Setters
	 */
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Funcionario getAtendente() {
		return atendente;
	}
	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}

	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	/**
	 * Métodos
	 */
	public String agendar() {
		return "Agendamento efetuado!";
	}

	public String consultaAgendamento() {
		return "Agendamento [paciente=" + paciente + ", medico=" + medico + ", atendente=" + atendente + ", dataHora="
				+ dataHora + ", valor=" + valor + "]";
	}
	
	
}
