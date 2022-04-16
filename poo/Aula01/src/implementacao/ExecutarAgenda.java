package implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import beans.AgendaRevisao;

public class ExecutarAgenda {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm");
		AgendaRevisao agenda1 = new AgendaRevisao();
		
		agenda1.cliente = "Roberto Freitas";
		agenda1.modelo = "Harley Fat Bob";
		agenda1.quilometragemVeiculo = (long) 45000;
		agenda1.data = formatDate.parse("08/04/2022");
		agenda1.hora = formatTime.parse("14:15");
		
		agenda1.agendar();
		
		System.out.println("Dados do Agendamento");
		System.out.println("Cliente: " + agenda1.cliente);
		System.out.println("Modelo: " + agenda1.modelo);
		System.out.println("KM: " + agenda1.quilometragemVeiculo);
		System.out.println("Data: " + formatDate.format(agenda1.data));
		System.out.println("Hora: " + formatTime.format(agenda1.hora));
		
	}
	
}
