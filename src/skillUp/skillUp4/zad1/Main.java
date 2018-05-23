package skillUp.skillUp4.zad1;

public class Main {
	
	public static void main(String[] args) {
		
		double a = 4;
		double b = 5;
		
		Calculation testinAddition = new Addition();
		System.out.println(testinAddition.compute(a, b));
		Calculation testMultiplication = new Multiplication();
		System.out.println(testMultiplication.compute(a, b));
		
	}
}
