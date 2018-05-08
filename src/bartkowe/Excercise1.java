package bartkowe;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {

		Double a;
		Double b;
		Double c;
		int mathType;

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Choose option \n" + "[0] Exit \n" + "[1] Addition \n" + "[2] Subtraction \n"
					+ "[3] Multiplication \n" + "[4] Division \n");

			mathType = input.nextInt();

			
			if (mathType == 0)
				break;
			
			if (mathType > 4 || mathType < 0) {
				System.out.println("This option does not exist");
				continue;
			}
			
			System.out.println("Enter a");
			a = input.nextDouble();
			System.out.println("Enter b");
			b = input.nextDouble();

			if (mathType == 1) {
				c = a + b;
				System.out.println(c);
			} else if (mathType == 2) {
				c = a - b;
				System.out.println(c);
			} else if (mathType == 3) {
				c = a * b;
				System.out.println(c);
			} else if (mathType == 4) {
				c = a / b;
				System.out.println(c);
			}
		}
	}
}
