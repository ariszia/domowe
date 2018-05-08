package bartkowe.samochod;

public class Kabriolet extends Samochod {

	public Kabriolet(String marka, int rocznik) {
		super(marka, rocznik);
	}
	public static void main(String[] args) {
		Samochod mojKabriolet = new Samochod("Porsze", 1992, "uzywany");
	}
}
