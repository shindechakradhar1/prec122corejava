package in.prec.logicalprograms.reversenumber.main;

import in.prec.logicalprograms.reversenumber.ReverseNumber;

public class MainReverseNumber {

	public static void main(String[] args) {
		ReverseNumber number = new ReverseNumber();
		number.setNumber(125);
		if(number.checkForPallindromeNumber())
			System.out.println("Givern Number is Pallindrome");
		else
			System.out.println("Givern Number is Not a Pallindrome");
	}
}
