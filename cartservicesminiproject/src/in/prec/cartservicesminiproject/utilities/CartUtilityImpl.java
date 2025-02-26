package in.prec.cartservicesminiproject.utilities;

import java.util.Scanner;

import in.prec.cartservicesminiproject.entitities.Cart;
import in.prec.cartservicesminiproject.entitities.ElectronicProduct;
import in.prec.cartservicesminiproject.entitities.Product;
import in.prec.cartservicesminiproject.exceptions.InvalidIndexException;
import in.prec.cartservicesminiproject.services.CartService;
import in.prec.cartservicesminiproject.services.CartServiceImpl;

public class CartUtilityImpl implements CartUtility{
	
	private Cart cart;
	private Product product;
	private CartService service = new CartServiceImpl();
	
	public CartUtilityImpl(Cart cart, Product product) {
		this.cart=cart;
		this.product=product;
	}
	
	@Override
	public void add(Scanner scanner) {
		if(product.getProductList().isEmpty())
			System.out.println("Products are out of Stock..");
		else {
			printProductList(product);
			System.out.println("Enter a Sr.No to Add a product to Cart");
			int index = scanner.nextInt();
//			cart.getCartProduct().add();
			try
			{
					service.add(cart, product, index);
			}catch(InvalidIndexException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private void printProductList(Product product) {
		int i=0;
		for(ElectronicProduct eProduct: product.getProductList())
			System.out.println((++i) +") " + eProduct);
	}

	@Override
	public void delete(Scanner scanner) {
		print();
		System.out.println("Enter Sr.no to delete a product from cart");
		int index=scanner.nextInt();
//		cart.getCartProduct().remove(index-1);
//		System.out.println("Product deleted from cart successfully...");
		System.out.println(service.delete(cart, index));
	}

	@Override
	public void update(Scanner scanner) {
		delete(scanner);
	}

	@Override
	public void print() {
		int i=0;
		System.out.println("Cart List");
		for(ElectronicProduct eProduct:cart.getCartProduct())
			System.out.println((++i) + ") " +eProduct);
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
