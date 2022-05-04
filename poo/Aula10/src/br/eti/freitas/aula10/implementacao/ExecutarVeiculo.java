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
			opcao = EntradaTela.texto("Controle de Veiculos\n\n" + "Escolha a opção\n\n" + "<I>ncluir\n" + "<A>lterar\n"
					+ "<E>xcluir\n" + "<C>consultar\n\n");

			switch (opcao.charAt(0)) {
			case 'I':
				// operações relacionadas a inclusão
				veiculo = new Veiculo(EntradaTela.texto("Placa"), EntradaTela.texto("Modelo"),
						EntradaTela.inteiro("Potência"), EntradaTela.texto("Proprietário"));

				veiculoDao.incluir(veiculo);
				break;
			case 'A':
				// operações relacionadas a alteracao
				placa = EntradaTela.texto("Informe a placa:");

				// busca veiculo pela placa
				Veiculo alterarVeiculo = veiculoDao.ConsultarPorPlaca(placa);

				if (alterarVeiculo != null) {
					// solicita novos dados
					String modelo = EntradaTela.texto("Modelo");
					int potencia = EntradaTela.inteiro("Potência");
					String proprietario = EntradaTela.texto("Proprietário");

					// atualiza
					alterarVeiculo.setModelo(modelo);
					alterarVeiculo.setPotencia(potencia);
					alterarVeiculo.setProprietario(proprietario);
					
					veiculoDao.alterar(alterarVeiculo);
				} else {
					EntradaTela.show("Veículo não localizado!");
				}

				break;
			case 'E':
				// operações relacionadas a exclusão
				placa = EntradaTela.texto("Informe a placa:");

				if (veiculoDao.excluir(placa)) {
					EntradaTela.show("Exclusão efetuada com sucesso!");
				} else {
					EntradaTela.show("Veículo não encontrado!");
				}
				break;
			case 'C':
				// operações relacionadas a consulta
				placa = EntradaTela.texto("Informe a placa:");

				Veiculo consultarVeiculo = veiculoDao.ConsultarPorPlaca(placa);

				if (consultarVeiculo != null) {
					EntradaTela.show("Dados do veículo" + "\nPlaca: " + consultarVeiculo.getPlaca() + "\nModelo: "
							+ consultarVeiculo.getModelo() + "\nPotencia: " + consultarVeiculo.getPotencia()
							+ "\nProprietário" + consultarVeiculo.getProprietario());
				} else {
					EntradaTela.show("Veículo não encontrado!");
				}
				break;
			case 'S':
				break;
			default:
				EntradaTela.show("Escolha uma das opções disponíveis!");
			}

		} while (!opcao.equalsIgnoreCase("S"));

	}

}
