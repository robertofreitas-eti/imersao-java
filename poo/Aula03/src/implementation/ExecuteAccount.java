package implementation;

import beans.Account;

/**
 * This example uses JPanelOption and custom constructor
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class ExecuteAccount {

	public static void main(String[] args) {
		
		
		Account account01 = new Account(202010, "CHECKING ACCOUNT","Fausto Silva", 1000.00);
		System.out.println(account01.bankStatement());

		account01.defineCreditLimit(0.00);
		account01.deposit(500.34);
		System.out.println(account01.bankStatement());

		System.out.println(account01.withdraw(1500.34) + "\n");
		System.out.println(account01.bankStatement());

		System.out.println(account01.withdraw(15.00) + "\n");
		System.out.println(account01.bankStatement());

		account01.defineCreditLimit(20.00);
		System.out.println(account01.bankStatement());

		System.out.println(account01.withdraw(15.00) + "\n");
		System.out.println(account01.bankStatement());
		
		Account account02 = new Account(3010, "SAVING ACCOUNT","Ana Maria Braga", 1000.00);
		System.out.println(account02.bankStatement());
		
		System.out.println(account02.defineCreditLimit(500.00) + "\n");
		System.out.println(account02.bankStatement());

		
		Account account03 = new Account(7802010, "CHECKING ACCOUNT","Luciano Huck", 1000.00);
		System.out.println(account03.bankStatement());

		System.out.println(account03.defineCreditLimit(500.00) + "\n");
		System.out.println(account03.bankStatement());
		
		account03.deposit(100.00);
		System.out.println(account03.bankStatement());
		
		System.out.println(account03.withdraw(2100.00) + "\n");
		System.out.println(account03.bankStatement());
		
/**		
		Account account05 = new Account(libraryScreen.number("Account:")
									   ,libraryScreen.text("Type: ")
				                       ,libraryScreen.text("Person:")
				                       ,libraryScreen.decimal("Ballance:")
				                       ,libraryScreen.decimal("Credit limit:")
				                       );
		
		libraryScreen.show(account01.bankStatement());
*/		

	}
	
}
