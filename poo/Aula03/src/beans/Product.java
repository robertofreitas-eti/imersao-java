package beans;

public class Product {

	private String name;
	private String brand;
	private double price;
	private boolean onOffer;

	/*
	 * Construtor DEFAULT 
	 * 
	 * O construtor default é opcional, porém sempre que forem implementados construturoes
	 * customizados deverá ser declarado o construtor default
	 */
	public Product() {	
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public Product(String name, String brand, double price, boolean onOffer) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.onOffer = onOffer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isOnOffer() {
		return onOffer;
	}

	public void setOnOffer(boolean onOffer) {
		this.onOffer = onOffer;
	}

	public String details() {
		return "Product {name='" + name + "'" +
				", brand='" + brand + "'" +
				", price=" + price + 
				", onOffer=" + onOffer + 
				"}";
	}

}
