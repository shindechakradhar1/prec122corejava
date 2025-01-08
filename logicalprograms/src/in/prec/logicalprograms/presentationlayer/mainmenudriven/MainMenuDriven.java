package in.prec.logicalprograms.presentationlayer.mainmenudriven;

import java.util.Scanner;

import in.prec.logicalprograms.presentationlayer.Helper;

public class MainMenuDriven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Helper helper = new Helper();
		int option=0;
		do {
			option=helper.printMenu(scanner);
			System.out.println(option);
			switch(option) {
			case 1:	helper.checkPallindromeNumber(scanner);
					break;
			case 2:	helper.checkArmstrongNumber(scanner);
					break;
			case 3:	helper.checkPerfectNumber(scanner);
					break;
			case 4:	helper.checkPrimeNumber(scanner);
					break;
			case 0: System.out.println("Bye...");
					break;
			default: System.out.println("Invalid Input..");
			}
		}while(option!=0);
		
		scanner.close();
	}
}
