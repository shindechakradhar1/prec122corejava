package in.prec.logicalprograms.reversestring.main;

import java.util.Scanner;

import in.prec.logicalprograms.reversestring.ReverseString;

public class MainReverseString {
	public static void main(String[] args) {
		ReverseString reverseString=new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Address to reverse:");
		String temp=scanner.nextLine();
		reverseString.setVariable(temp);
//		String result = reverseString.reverseString();
		String result = reverseString.reverseStringLine();
		System.out.println(result);
		
		scanner.close();
	}
}
