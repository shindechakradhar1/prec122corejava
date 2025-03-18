package in.prec.cartservicesminiproject;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import in.prec.cartservicesminiproject.entitities.Cart;
import in.prec.cartservicesminiproject.entitities.Product;
import in.prec.cartservicesminiproject.utilities.CartUtility;
import in.prec.cartservicesminiproject.utilities.CartUtilityImpl;
import in.prec.cartservicesminiproject.utilities.ProductUtility;
import in.prec.cartservicesminiproject.utilities.ProductUtilityImpl;

public class App {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int choice = -1;
			Cart cart = new Cart(new LinkedList<>());
			Product product = new Product();
			CartUtility cartUtilt = new CartUtilityImpl(cart, product);
			ProductUtility productUtil = new ProductUtilityImpl(product);
			do {
				choice=-1;
				System.out.println("Main Menu");
				System.out.println("	1. Cart");
				System.out.println("	2. Product");
				System.out.println("	0. Exit");
				try {
					choice = scanner.nextInt();
				}catch(InputMismatchException e) {
					System.err.println("Invalid Number input");
					scanner.nextLine();
				}
				switch (choice) {
				case 1 -> cartUtilt.manipulateCart(scanner);
				case 2 -> productUtil.manipulateProduct(scanner);
				case 0 -> System.out.println("Bye.. Bye..");
				default -> System.out.println("Invalid Input");
				}
			} while (choice != 0);
		}
	}
}
