package br.eti.freitas.aula10.dao;

import java.util.ArrayList;
import java.util.List;

import br.eti.freitas.aula10.beans.Veiculo;

public class VeiculoDao {

	static List<Veiculo> bdVeiculo = new ArrayList<Veiculo>();

	public VeiculoDao() {
	}

	// método para conexão com o banco de dados
	private static boolean conectarBD(String string) {
		return true;
	}

	// método para inclusão de veiculo
	public boolean incluir(Veiculo veiculo) {
		// verifica se o banco de dados está conectado
		if (!conectarBD("url_banco_dados")) {
			System.out.println("Log: erro de conexão com o banco de dados");
			return false;
		}

		bdVeiculo.add(veiculo);
		System.out.println("Log: inclusão no banco de dados");
		return true;

	}

	// método para inclusão de veiculo
	public Veiculo ConsultarPorPlaca(String placa) {
		// verifica se o banco de dados está conectado
		if (!conectarBD("url_banco_dados")) {
			System.out.println("Log: erro de conexão com o banco de dados");
		}

		for (Veiculo veiculo : bdVeiculo) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				return veiculo;
			}
		}
		System.out.println("Log: veiculo placa: " + placa + " não localizado!");
		return null;

	}

	// método para inclusão de veiculo
	public Veiculo alterar(Veiculo veiculo) {
		// verifica se o banco de dados está conectado
		if (!conectarBD("url_banco_dados")) {
			System.out.println("Log: erro de conexão com o banco de dados");
		}

		for (Veiculo item : bdVeiculo) {
			if (item.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
				System.out.println("Log: alterando veiculo placa: " + veiculo.getPlaca());
				bdVeiculo.remove(item);
				bdVeiculo.add(item);
			}
		}
		return null;

	}

	// método para exclusao de veiculo
	public boolean excluir(String placa) {
		// verifica se o banco de dados está conectado
		if (!conectarBD("url_banco_dados")) {
			System.out.println("Log: erro de conexão com o banco de dados");
		}

		for (Veiculo veiculo : bdVeiculo) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("Log: excluindo veiculo placa: " + placa);
				bdVeiculo.remove(veiculo);
				return true;
			} else {
				System.out.println("Log: veiculo placa: " + placa + " não localizado!");
			}
		}
		return false;

	}

}
