package in.prec.cartservicesminiproject.exceptions;

public class NegativeIdException extends Exception{

	public NegativeIdException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegativeIdException(String message) {
		super(message);
	}
	
}
