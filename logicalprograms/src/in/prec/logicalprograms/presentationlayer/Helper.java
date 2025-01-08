package in.prec.logicalprograms.presentationlayer;

import java.util.Scanner;

import in.prec.logicalprograms.armstrongnumber.ArmstrongNumber;
import in.prec.logicalprograms.perfectnumber.PerfectNumber;
import in.prec.logicalprograms.primenumber.PrimeNumber;
import in.prec.logicalprograms.reversenumber.ReverseNumber;

public class Helper {

	public int printMenu(Scanner scanner) {
		System.out.println("1. to check if Number is Pallindrome");
		System.out.println("2. to check if Number is Armstrong");
		System.out.println("3. to check if Number is Perfect");
		System.out.println("4. to check if Number is Prime");
		System.out.println("0. To exit..");
		return scanner.nextInt();
	}
	
	
	public void checkPallindromeNumber(Scanner scanner) {
		ReverseNumber number = new ReverseNumber();
		System.out.println("Enter a Number:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.checkForPallindromeNumber())
			System.out.println(variable + " is a Pallindrome Number");
		else
			System.out.println(variable + " is not a Pallindrome Number");
	}
	
	public void checkArmstrongNumber(Scanner scanner) {
		ArmstrongNumber number = new ArmstrongNumber();
		System.out.println("Enter a Number:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isArmstrongNumber())
			System.out.println(variable + " is a Armstrong Number");
		else
			System.out.println(variable + " is not a Armstrong Number");
	}
	
	public void checkPerfectNumber(Scanner scanner) {
		PerfectNumber number = new PerfectNumber();
		System.out.println("Enter a Number");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		if(number.isPerfectNumber())
			System.out.println(variable + " is a Perfect Number");
		else
			System.out.println(variable + " is not a Perfect Number");
	}
	
	public void checkPrimeNumber(Scanner scanner) {
		PrimeNumber number = new PrimeNumber();
		System.out.println("Enter a Number");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		if(number.isPrime())
			System.out.println(variable + " is a Prime Number");
		else
			System.out.println(variable + " is not a Prime Number");
	}
}
