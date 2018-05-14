package skillUp.enums;

public enum TypFigury {
	TROJKAT(3),
	PROSTOKAT(4);
	
	private int ileBokow;
	
	private TypFigury(int ileBokow) {
		this.setIleBokow(ileBokow);
	}
	
	public int getIleBokow() {
		return ileBokow;
	}
	
	public void setIleBokow(int ileBokow) {
		this.ileBokow = ileBokow;
	}
	
}
