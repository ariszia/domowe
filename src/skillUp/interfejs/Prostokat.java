package skillUp.interfejs;

public class Prostokat implements Figura {

	private int a;
	private int b;
	
	public Prostokat() {
		
	}
	
	public Prostokat(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public float pole() {
		return (float) (a*b);
	}

	@Override
	public float obwod() {
		return (float) ((2*a) +(2*b));
	}

}
