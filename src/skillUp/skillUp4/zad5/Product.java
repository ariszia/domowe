package skillUp.skillUp4.zad5;

public class Product {
	String name;
	double price;
	Category category;

	public Product(String name, double price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public String toString() {
		return ("name: "+ name + " price: " + price +" category: " + category);
	}
}