package in.prec.exception.customexceptions;

public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidAgeException(String message) {
		super(message);
	}

	public InvalidAgeException(Throwable cause) {
		super(cause);
	}
	
}
