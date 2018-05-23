package skillUp.skillUp4.zad4;

import java.nio.file.StandardWatchEventKinds;
import java.util.Scanner;

//4)	Zaimplementuj cia³o metody getDayOfWeek u¿ywaj¹c instrukcji steruj¹cej switch, 
//w taki sposób, aby po wywo³aniu metody z argumentem dayNumber=2 
//(postaraj siê u¿yæ enum – Wojtek ty musisz), zosta³o wypisane na ekran „Dzisiaj mamy wtorek”. 
//Pamietaj, ¿eby zabezpieczyæ dzia³anie metody wartoœciami poza przedzia³em 1-7.
//U¿yj wyj¹tków. Przyk³ad poni¿ej:

public class Main {

	public static void main(String[] args) throws Exception {
		Main program = new Main();
		System.out.println("Dodaj numer dnia:");
		Scanner odczytDnia = new Scanner(System.in);
		int dayNumber = odczytDnia.nextInt();
		program.getDayOfWeek(dayNumber);
		odczytDnia.close();
		
	}

	public void getDayOfWeek(int dayNumber) throws Exception {
		  
		String dayOfWeek;
		
		switch (dayNumber) {
		case 1 : dayOfWeek = "poniedzialek";
			break;
		case 2 : dayOfWeek = "wtorek";
			break;
		case 3 : dayOfWeek = "srode";
			break;
		case 4 : dayOfWeek = "czwartek";
			break;
		case 5 : dayOfWeek = "piatek";
			break;
		case 6 : dayOfWeek = "sobota";
			break;
		case 7 : dayOfWeek = "niedziela"; 
			break;
		default : throw new Exception("Nie ma takiego dnia");
		
		}
		
		System.out.println("Dzisiaj mamy " + dayOfWeek);
	}
}
