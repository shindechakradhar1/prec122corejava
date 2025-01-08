package in.prec.logicalprograms.reversenumber;

public class ReverseNumber {

	int number;
	
	public ReverseNumber() {}
	
	public ReverseNumber(int number) {
		this.number=number;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int reverseGivernNumber() {
		int result=0;
		int temp = number;
		while (temp != 0) {
			result = result * 10 + temp % 10;
			temp = temp / 10;
		}
		
		return result;
	}
	
	public boolean checkForPallindromeNumber() {
		return reverseGivernNumber()==number;
	}
}
