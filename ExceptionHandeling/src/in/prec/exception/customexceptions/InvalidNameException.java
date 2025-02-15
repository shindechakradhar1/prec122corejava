package in.prec.exception.customexceptions;

public class InvalidNameException extends Exception{

	public InvalidNameException(String message, Throwable cause) {
		super(message, cause);}

	public InvalidNameException(String message) {
		super(message);
	}

	public InvalidNameException(Throwable cause) {
		super(cause);
	}

	
	
}
