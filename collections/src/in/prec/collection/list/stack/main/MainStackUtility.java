package in.prec.collection.list.stack.main;

import java.util.Scanner;

import in.prec.collection.list.stack.utility.UtilityOperation;

public class MainStackUtility {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int choice = 0;
			UtilityOperation util = new UtilityOperation(5);
			do {
				System.out.println("1.redo");
				System.out.println("2.undo");
				System.out.println("3.print");
				System.out.println("0.Exit");
				choice = scanner.nextInt();
				switch (choice) {
				case 1 -> util.redo();
				case 2 -> util.undo();
				case 3 -> util.printStack();
				case 0 -> System.out.println("Bye.. bye..");
				default -> System.out.println("Invalid Input");
				}
			} while (choice != 0);

		}
	}
}
