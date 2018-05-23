package skillUp.skillUp4.zad5;

import java.util.ArrayList;
import java.util.List;

public class ProductExercise {

	List<Product> allProducts = new ArrayList<Product>();


	
	public static void main(String[] args) {
		
		ProductExercise sklep = new ProductExercise();
		sklep.allProducts.add(new Product ("Bulki",0.8 ,Category.FOOD));
		sklep.allProducts.add(new Product ("Chleb",1.5 ,Category.FOOD));
		sklep.allProducts.add(new Product ("Masakra",40.5 ,Category.COSMETICS));
		sklep.allProducts.add(new Product ("Kredka do oczu",25.0 ,Category.COSMETICS));
		sklep.allProducts.add(new Product ("Kinder joy",4.0 ,Category.FOOD));
		sklep.allProducts.add(new Product ("Grabie",20.0 ,Category.OTHER));
		sklep.allProducts.add(new Product ("Chustka",18.0 ,Category.OTHER));
		sklep.allProducts.add(new Product ("Kredki",2.0 ,Category.OTHER));
		sklep.allProducts.add(new Product ("Komorka",999.99 ,Category.OTHER));
		sklep.allProducts.add(new Product ("Schab",14.0 ,Category.FOOD));

		System.out.println(sklep.allProducts);
		System.out.println(sklep.productByCategory(Category.FOOD));
	}
	
	public List<Product> productByCategory(Category kategoria) {
		List<Product> productsByCategory = new ArrayList<Product>();
		
		for (Product produkt : allProducts ) {
			if (produkt.category == kategoria) {
				productsByCategory.add(produkt);
			}
		}
		return productsByCategory;
	}

}
