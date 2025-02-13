package in.prec.oops.interfacedemos;

@FunctionalInterface
public interface Calculator {

	public final static int VAR=100;
	
//	Single Abstract Method(SAM)
	public abstract int calculate(int number1, int number2);
	
	public default void printMessage(String message) {
		printMyMessage(message);
	}
	
	private void printMyMessage(String message) {
		System.out.println(message);
	}
	
	public static void printVar() {
		System.out.println(VAR);
	}
	
}
