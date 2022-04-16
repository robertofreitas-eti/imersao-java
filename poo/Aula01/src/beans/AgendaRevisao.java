package beans;

import java.util.Date;

public class AgendaRevisao {

	public String cliente;
	public String modelo;
	public long quilometragemVeiculo;
	public Date data;
	public Date hora;
	
	public void agendar() {
		System.out.println("Agendamento efetuado!");
	}
	
	public void cancelarAgenda() {
		System.out.println("Agendamento cancelado!");
	}
	
}
