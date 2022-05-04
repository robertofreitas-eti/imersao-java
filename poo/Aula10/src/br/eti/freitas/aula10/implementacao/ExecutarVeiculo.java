package br.eti.freitas.aula10.implementacao;

import br.eti.freitas.aula10.beans.Veiculo;
import br.eti.freitas.aula10.dao.VeiculoDao;
import br.eti.freitas.aula10.util.EntradaTela;

public class ExecutarVeiculo {

	public static void main(String[] args) {

		String placa;
		String opcao;
		Veiculo veiculo = new Veiculo();
		VeiculoDao veiculoDao = new VeiculoDao();

		do {
			opcao = EntradaTela.texto("Controle de Veiculos\n\n" + "Escolha a op��o\n\n" + "<I>ncluir\n" + "<A>lterar\n"
					+ "<E>xcluir\n" + "<C>consultar\n\n");

			switch (opcao.charAt(0)) {
			case 'I':
				// opera��es relacionadas a inclus�o
				veiculo = new Veiculo(EntradaTela.texto("Placa"), EntradaTela.texto("Modelo"),
						EntradaTela.inteiro("Pot�ncia"), EntradaTela.texto("Propriet�rio"));

				veiculoDao.incluir(veiculo);
				break;
			case 'A':
				// opera��es relacionadas a alteracao
				placa = EntradaTela.texto("Informe a placa:");

				// busca veiculo pela placa
				Veiculo alterarVeiculo = veiculoDao.ConsultarPorPlaca(placa);

				if (alterarVeiculo != null) {
					// solicita novos dados
					String modelo = EntradaTela.texto("Modelo");
					int potencia = EntradaTela.inteiro("Pot�ncia");
					String proprietario = EntradaTela.texto("Propriet�rio");

					// atualiza
					alterarVeiculo.setModelo(modelo);
					alterarVeiculo.setPotencia(potencia);
					alterarVeiculo.setProprietario(proprietario);
					
					veiculoDao.alterar(alterarVeiculo);
				} else {
					EntradaTela.show("Ve�culo n�o localizado!");
				}

				break;
			case 'E':
				// opera��es relacionadas a exclus�o
				placa = EntradaTela.texto("Informe a placa:");

				if (veiculoDao.excluir(placa)) {
					EntradaTela.show("Exclus�o efetuada com sucesso!");
				} else {
					EntradaTela.show("Ve�culo n�o encontrado!");
				}
				break;
			case 'C':
				// opera��es relacionadas a consulta
				placa = EntradaTela.texto("Informe a placa:");

				Veiculo consultarVeiculo = veiculoDao.ConsultarPorPlaca(placa);

				if (consultarVeiculo != null) {
					EntradaTela.show("Dados do ve�culo" + "\nPlaca: " + consultarVeiculo.getPlaca() + "\nModelo: "
							+ consultarVeiculo.getModelo() + "\nPotencia: " + consultarVeiculo.getPotencia()
							+ "\nPropriet�rio" + consultarVeiculo.getProprietario());
				} else {
					EntradaTela.show("Ve�culo n�o encontrado!");
				}
				break;
			case 'S':
				break;
			default:
				EntradaTela.show("Escolha uma das op��es dispon�veis!");
			}

		} while (!opcao.equalsIgnoreCase("S"));

	}

}
