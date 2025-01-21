package in.prec.recursion.operations.main;

import in.prec.recursion.operations.Operations;

public class MainOperations {
	public static void main(String[] args) {
		Operations operation = new Operations();
		int result=operation.calculatePower(10,2);
		System.out.println(result);
		
		int number=2;
		if(operation.isPrime(number, 2))
			System.out.println(number + " is prime");
		else
			System.out.println(number + " is not a Prime");
	}
}
