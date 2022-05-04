package br.eti.freitas.aula10.dao;

import java.util.ArrayList;
import java.util.List;

import br.eti.freitas.aula10.beans.Veiculo;

public class VeiculoDao {

	static List<Veiculo> bdVeiculo = new ArrayList<Veiculo>();

	public VeiculoDao() {
	}

	// m�todo para conex�o com o banco de dados
	private static boolean conectarBD(String string) {
		return true;
	}

	// m�todo para inclus�o de veiculo
	public boolean incluir(Veiculo veiculo) {
		// verifica se o banco de dados est� conectado
		if (!conectarBD("url_banco_dados")) {
			System.out.println("Log: erro de conex�o com o banco de dados");
			return false;
		}

		bdVeiculo.add(veiculo);
		System.out.println("Log: inclus�o no banco de dados");
		return true;

	}

	// m�todo para inclus�o de veiculo
	public Veiculo ConsultarPorPlaca(String placa) {
		// verifica se o banco de dados est� conectado
		if (!conectarBD("url_banco_dados")) {
			System.out.println("Log: erro de conex�o com o banco de dados");
		}

		for (Veiculo veiculo : bdVeiculo) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				return veiculo;
			}
		}
		System.out.println("Log: veiculo placa: " + placa + " n�o localizado!");
		return null;

	}

	// m�todo para inclus�o de veiculo
	public Veiculo alterar(Veiculo veiculo) {
		// verifica se o banco de dados est� conectado
		if (!conectarBD("url_banco_dados")) {
			System.out.println("Log: erro de conex�o com o banco de dados");
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

	// m�todo para exclusao de veiculo
	public boolean excluir(String placa) {
		// verifica se o banco de dados est� conectado
		if (!conectarBD("url_banco_dados")) {
			System.out.println("Log: erro de conex�o com o banco de dados");
		}

		for (Veiculo veiculo : bdVeiculo) {
			if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
				System.out.println("Log: excluindo veiculo placa: " + placa);
				bdVeiculo.remove(veiculo);
				return true;
			} else {
				System.out.println("Log: veiculo placa: " + placa + " n�o localizado!");
			}
		}
		return false;

	}

}
