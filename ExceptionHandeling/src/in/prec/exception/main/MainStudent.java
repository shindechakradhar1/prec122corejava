package in.prec.exception.main;

import java.util.Scanner;

import in.prec.exception.utility.StudentUitility;

public class MainStudent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentUitility util = new StudentUitility();
		util.intsert(scanner);
		
		
		scanner.close();
		
		
	}
}
