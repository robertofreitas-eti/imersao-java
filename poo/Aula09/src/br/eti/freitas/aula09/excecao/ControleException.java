package br.eti.freitas.aula09.excecao;

public class ControleException extends Exception {

	public ControleException(String message, Exception ex) {
		super(message, ex);
		print();
		
        if (message.equalsIgnoreCase("log")){
        	logarBanco();
        }
		
        if (message.equalsIgnoreCase("email")){
            enviarEmail();
        }
	}

    private void logarBanco() {
        System.out.println("-Abrindo Conexao banco de dados");
        System.out.println("-gravando registros de log no banco");
        System.out.println("-----Detalhes----");
        System.out.println(getMessage());
        printStackTrace();
    }	
	
    private void enviarEmail() {
        System.out.println("-Abrindo Conexao email");
        System.out.println("-email suporte: Supote@fiap.br");
        System.out.println("-----Detalhes----");
        System.out.println(getMessage());
        printStackTrace();
    }	
	
	public void print() {
		System.out.println("Custon Exception");
		System.out.println(getMessage());
	}

}
