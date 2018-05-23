package skillUp.skillUp4.zad2;

//Stw�rz metod� checkPalindrome(String word), 
//kt�ra b�dzie zwraca� warto�� logiczn� w zale�no�ci od tego czy przekazany String w argumencie
//jest palindromem, czy nie. Wskaz�wka: wykorzystaj konstrukcj� if � else if. Je�eli nie jest palindromem, rzu� wyj�tkiem. 

public class Palindrom {

	public static void main(String[] args) throws Exception {

		Palindrom p = new Palindrom();
		p.checkPalindrome("Bedronka");
	}
	
	public boolean checkPalindrome(String word) throws Exception {
		word = word.toLowerCase();
		String reverse = new StringBuilder(word).reverse().toString() ;
		
		if (reverse.equals(word)) {
			return true;
		} else throw new Exception(word + " it's not Palindrome");
	}
	

}
