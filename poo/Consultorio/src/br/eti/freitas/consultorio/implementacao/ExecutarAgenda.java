package br.eti.freitas.consultorio.implementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.eti.freitas.consultorio.beans.Agendamento;
import br.eti.freitas.consultorio.beans.Funcionario;
import br.eti.freitas.consultorio.beans.Medico;
import br.eti.freitas.consultorio.beans.Paciente;

public class ExecutarAgenda {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
		Paciente pc01 = new Paciente("585.879.555-89", "Fausto Silva", "+55 21 32454-8584");
		Funcionario fc01 = new Funcionario("322.932.122-64", "Thainara Campos Silva", "+55 11 4343-4333", formatDate.parse("2020/03/20"),null, 0, "RECEPÇÃO");
		Medico md01 = new Medico("253.717.262-89", "JOÃO CARLOS RIBEIRO", "+55 11 99823-2121", formatDate.parse("2022/04/01"), null, 0, "CLINICA GERAL", "XW2122-2", "ORTOPEDISTA");
		
		Agendamento ag01 = new Agendamento(pc01, md01,fc01, formatDate.parse("2019/03/22"),250.00);
		
		System.out.println(ag01.consultaAgendamento());
	}	
	
}
