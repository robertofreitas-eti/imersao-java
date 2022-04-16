package implementacao;

import beans.ContaCorrente;

public class ExecutarContaCorrente {
	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.setNumero(2532232);
		conta.setSaldo(0);

		conta.extrato();
		
		conta.deposito(200);
		conta.extrato();
		
		conta.deposito(500);
		conta.extrato();
		
		conta.saque(123);
		conta.extrato();
		
	}
}
