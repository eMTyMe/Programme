package Rohdateien;

public class KontoException extends Exception
{
	
	public KontoException(String message) {
		super(message);
	}
	
	public KontoException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public KontoException(Throwable cause) {
		super(cause);
	}
	
}
