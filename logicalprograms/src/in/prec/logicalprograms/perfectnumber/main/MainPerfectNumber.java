package in.prec.logicalprograms.perfectnumber.main;

import in.prec.logicalprograms.perfectnumber.PerfectNumber;
import java.util.Scanner;
public class MainPerfectNumber {

	public static void main(String[] args) {
		PerfectNumber number = new PerfectNumber();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isPerfectNumber())
			System.out.println(variable + " is a Perfect Number");
		else
			System.out.println(variable + " is not a Perfect Number");
		
		
	}
}
