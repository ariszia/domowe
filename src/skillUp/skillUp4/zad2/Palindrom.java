package skillUp.skillUp4.zad2;

//Stwórz metodê checkPalindrome(String word), 
//która bêdzie zwracaæ wartoœæ logiczn¹ w zale¿noœci od tego czy przekazany String w argumencie
//jest palindromem, czy nie. Wskazówka: wykorzystaj konstrukcjê if – else if. Je¿eli nie jest palindromem, rzuæ wyj¹tkiem. 

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
