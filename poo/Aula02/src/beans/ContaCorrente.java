package beans;

public class ContaCorrente {

		private double saldo;
		private int numero;
		
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public void saque(double valor) {
			this.saldo -= valor;			
		}
		
		public void deposito(double valor) {
			this.saldo += valor;
		}
		
		public void extrato( ) {
			
			System.out.println("=====================================");
			System.err.println("      EXTRATO DE CONTA CORRENTE      ");
			System.out.println("=====================================\n");
			System.out.println("Número.: " + this.numero);
			System.out.println("Saldo..: " + this.saldo);
			System.out.println("\n=====================================\n\n");
		}
		
		
}
