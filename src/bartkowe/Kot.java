package bartkowe;

public class Kot {

	int wiek;
	
	public static void main(String[] args) {
		Kot mruczek = new Kot();
		mruczek.ustawWiek(2);
		
		Kot kicia = new Kot();
	}
	
	public Kot() {
		wiek = 0;
		System.out.println(wiek);
	}

	public void ustawWiek(int wiek) {
		this.wiek = wiek;
		System.out.println(wiek);
	}
}
