package in.prec.cartservicesminiproject.utilities;

import java.util.Scanner;

import in.prec.cartservicesminiproject.entitities.Cart;
import in.prec.cartservicesminiproject.entitities.Product;

public class CartUtilityImpl implements CartUtility{
	
	private Cart cart;
	private Product product;
	
	public CartUtilityImpl(Cart cart, Product product) {
		this.cart=cart;
		this.product=product;
	}
	
	@Override
	public void add(Scanner scanner) {
		if(product.getProductList().isEmpty())
			System.out.println("Products are out of Stock..");
		else {
			System.out.println(product.getProductList());
			System.out.println("Add product to Cart");
		}
	}

	@Override
	public void delete(Scanner scanner) {
		System.out.println("Delete Cart");
	}

	@Override
	public void update(Scanner scanner) {
		System.out.println("Update Cart");
	}

	@Override
	public void print() {
		System.out.println("print Cart");
	}

	@Override
	public int printMenu(Scanner scanner) {
		System.out.println("Cart Menu");
		System.out.println("	1.Add");
		System.out.println("	2.Edit");
		System.out.println("	3.Remove");
		System.out.println("	4.Print");
		System.out.println("	0.exit");
		return scanner.nextInt();
	}

	@Override
	public void manipulateCart(Scanner scanner) {
		int choice = 0;
		do {
			choice=printMenu(scanner);
			switch(choice) {
				case 1 -> add(scanner);
				case 2 -> delete(scanner);
				case 3 -> update(scanner);
				case 4 -> print();
				case 0 -> System.out.println("Bye.. Bye..");
				default -> System.out.println("Invalid Input");
			}	
		}while(choice!=0);
	}

}
