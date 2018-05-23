package skillUp.skillUp4.zad6;

import java.util.Scanner;

//6)	Napisz metodê, która jako parametr bêdzie przyjmowa³a napis i wypisywa³a na standardowe wyjœcie jego d³ugoœæ.
//a)	Przeka¿ do tej metody null i zobacz, jaki wyj¹tek zosta³ zg³oszony. java.lang.NullPointerException
//b)	Otocz wywo³anie metody blokiem try-catch, przechwyæ ten wyj¹tek i wypisz na standardowe wyjœcie œlad stosu wywo³añ z chwili zg³oszenia wyj¹tku.


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
