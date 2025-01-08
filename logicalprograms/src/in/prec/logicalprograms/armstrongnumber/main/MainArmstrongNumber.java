package in.prec.logicalprograms.armstrongnumber.main;

import in.prec.logicalprograms.armstrongnumber.ArmstrongNumber;
import java.util.Scanner;
public class MainArmstrongNumber {

	public static void main(String[] args) {
		ArmstrongNumber number = new ArmstrongNumber();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer Value:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isArmstrongNumber())
			System.out.println(variable + " is a Armstrong Number");
		else
			System.out.println(variable + " is not a Armstrong Number");
		
		scanner.close();
		
		
	}
}
