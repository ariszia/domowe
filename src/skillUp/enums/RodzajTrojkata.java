package skillUp.enums;

public enum RodzajTrojkata {
	
	PROSTOKATNY(1),
	ROWNOBOCZNY(2),
	ROWNORAMIENNY(3);
	
	private int priorytet;
	
	private RodzajTrojkata(int priorytet) {
		this.priorytet = priorytet;
	}
	
	public int getPriorytet() {
		return priorytet;
	}
	
}
