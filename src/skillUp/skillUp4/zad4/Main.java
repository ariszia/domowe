package skillUp.skillUp4.zad4;

import java.nio.file.StandardWatchEventKinds;
import java.util.Scanner;

//4)	Zaimplementuj cia�o metody getDayOfWeek u�ywaj�c instrukcji steruj�cej switch, 
//w taki spos�b, aby po wywo�aniu metody z argumentem dayNumber=2 
//(postaraj si� u�y� enum � Wojtek ty musisz), zosta�o wypisane na ekran �Dzisiaj mamy wtorek�. 
//Pamietaj, �eby zabezpieczy� dzia�anie metody warto�ciami poza przedzia�em 1-7.
//U�yj wyj�tk�w. Przyk�ad poni�ej:

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
