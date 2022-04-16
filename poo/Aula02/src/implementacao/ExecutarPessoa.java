package implementacao;

import beans.Pessoa;

public class ExecutarPessoa {

	public static void main(String[] args) {

		System.out.println("Iniciando...");
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(1); 
		pessoa.setCidade("Roberto Freitas");
		pessoa.setIdade(43);
		pessoa.setCidade("São Bernardo do Campo");
		pessoa.setSentimento("Não definido");
				
		System.out.println("Dados da pessoa");
		System.out.println("=================================");
		System.out.println("Identificador.: " + pessoa.getId());
		System.out.println("Nome..........: " + pessoa.getNome());
		System.out.println("Idade.........: " + pessoa.getIdade());
		System.out.println("Cidade........: " + pessoa.getCidade());
		System.out.println("Sentimento....: " + pessoa.getSentimento());
		
		pessoa.comer("Almoço");
		System.out.println("Sentimento : " + pessoa.getSentimento());

		pessoa.dormir(7);
		System.out.println("Sentimento : " + pessoa.getSentimento());
		
		
	}

}
