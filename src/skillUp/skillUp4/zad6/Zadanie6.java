package skillUp.skillUp4.zad6;

import java.util.Scanner;

//6)	Napisz metod�, kt�ra jako parametr b�dzie przyjmowa�a napis i wypisywa�a na standardowe wyj�cie jego d�ugo��.
//a)	Przeka� do tej metody null i zobacz, jaki wyj�tek zosta� zg�oszony. java.lang.NullPointerException
//b)	Otocz wywo�anie metody blokiem try-catch, przechwy� ten wyj�tek i wypisz na standardowe wyj�cie �lad stosu wywo�a� z chwili zg�oszenia wyj�tku.


public class Zadanie6 {

	public static void main(String[] args) {
		
		Zadanie6 l = new Zadanie6();
		
		System.out.println("Wypisz dowolny wyraz: ");
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		
		try {
			l.stringToLength(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void stringToLength(String string) {
		int stringLength = string.length();
		System.out.println(stringLength);
		
	}

}
