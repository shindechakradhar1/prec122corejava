package in.prec.cartservicesminiproject.exceptions;

public class InvalidIndexException extends Exception{

	public InvalidIndexException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidIndexException(String message) {
		super(message);
	}
	
}
