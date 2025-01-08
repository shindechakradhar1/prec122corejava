package in.prec.logicalprograms.primenumber.main;

import java.util.Scanner;

import in.prec.logicalprograms.primenumber.PrimeNumber;

public class MainPrimeNumber {

	public static void main(String[] args) {
		PrimeNumber number = new PrimeNumber();
//		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter A Integer Number:");
//		int variable=scanner.nextInt();
		
		for(int i=2;i<=1000;i++) {
			number.setNumber(i);
		
			if(number.isPrime())
				System.out.println(i + " is a Prime Number");
//			else
//				System.out.println(i + " is not a Prime Number");
		}
	}
}
