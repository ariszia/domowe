package bartkowe.samochod;

public class Samochod {
	
	public Samochod(String marka) {
		wypisz(marka +"1"); 
	}
	public Samochod(String marka, int rocznik) {
		wypisz(marka + rocznik +"2"); 
	}
	public Samochod(String marka, int rocznik, String stan ) {
		wypisz(marka + rocznik + stan +"3"); 
	}
	
	public void wypisz(String text) {
		System.out.println(text);
	}
	
}
