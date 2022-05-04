package implementation;

import beans.Product;
import util.libraryScreen;

/**
 * This example uses the util class and custom constructor
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class ExecuteProduct03 {

	public static void main(String[] args) {

		/*
		 * Get information from product using constructor and static methods
		 */
		Product p01 = new Product(libraryScreen.text("Product Name:"),
								  libraryScreen.decimal("Price"));

		libraryScreen.show(p01.details());

		
		Product p02 = new Product(libraryScreen.text("Product Name:"),
				  libraryScreen.text("Brand name:"),
				  libraryScreen.decimal("Price")
				  );

		libraryScreen.show(p02.details());

		Product p03 = new Product(libraryScreen.text("Product Name:"),
				  libraryScreen.text("Brand name:"),
				  libraryScreen.decimal("Price"),
				  libraryScreen.trueFalse("On Offer?")
				  );

		libraryScreen.show(p03.details());

		
				
		
	}

	
}
