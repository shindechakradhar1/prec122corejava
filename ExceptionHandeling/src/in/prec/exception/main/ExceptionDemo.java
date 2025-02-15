package in.prec.exception.main;

public class ExceptionDemo {

	public static void main(String[] args) {
//		throwUncheckedException();
		try {
		throwCheckedException();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	public static void throwUncheckedException(){
		throw(new NullPointerException());
	}
	
	public static void throwCheckedException() throws InterruptedException{
		throw (new InterruptedException());
	}
}
