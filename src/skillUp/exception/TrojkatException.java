package skillUp.exception;

public class TrojkatException extends Exception {
	
	public TrojkatException() {
		super("To nie jest trojkat");
	}
	
	public TrojkatException(String message) {
		super(message);
	}
	
}
