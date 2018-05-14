package skillUp.interfejs;

import skillUp.exception.TrojkatException;

public class Trojkat implements Figura {
	
	private float	podstawa;
	private float	wysokosc;
	private float	bok2;
	private float	bok3;
	
	@Override
	public float pole() {
		return (podstawa * wysokosc) / 2;
	}
	
	@Override
	public float obwod() {
		return (podstawa + bok2 + bok3);
	}
	
	public Trojkat() {
		
	}
	
	public Trojkat(float podstawa, float wysokosc) {
		this.podstawa = podstawa;
		this.wysokosc = wysokosc;
	}
	
	public Trojkat(int podstawa, int bok2, int bok3) throws TrojkatException {
		this.podstawa = podstawa;
		this.bok2 = bok2;
		this.bok3 = bok3;
		
		if (!czyTrojkat()) {
			throw new TrojkatException();
		}
		
		if (podstawa <= 0) {
			throw new TrojkatException("podstawa musi być > 0");
		}
		if (bok2 <= 0) {
			throw new TrojkatException("bok2 musi być > 0");
		}
		if (bok3 <= 0) {
			throw new TrojkatException("bok3 musi być > 0");
		}
		
	}
	
	private boolean czyTrojkat() {
		return podstawa + bok2 > bok3 && podstawa + bok3 > bok2 && bok2 + bok3 > podstawa;
	}
	
	public boolean czyProstokatny() {
		// jesli wyona warynek bedzie true w przeciwnym przypadku jest domyslnie false
		return (bok3 * bok3) == (bok2 * bok2) + (podstawa * podstawa);
	}
	
	public int dluzszyBok1(int a, int b) {
		// jezeli a jest wieksze od b zwroc a . W przeciwnym wypadku zwroc b. (warunek) ? wynik :(else) wynik 2
		return (a > b) ? a : b;
		// nie bedzie dzialac jak beda 2 boki takie same. Pokaze nam ze b.
	}
	
	public int dluzszyBok(int a, int b) {
		if (a > b) {
			return a;
		} else if (a == b) {
			System.out.println("sa rowne");
			return a;
		} else {
			return b;
		}
	}
	
	public float najdluzszyBok() {
		if (podstawa >= bok2 && podstawa >= bok3) {
			return podstawa;
		} else if (bok2 >= podstawa && bok2 >= bok3) {
			return bok2;
		} else
			return bok3;
	}
	
}
