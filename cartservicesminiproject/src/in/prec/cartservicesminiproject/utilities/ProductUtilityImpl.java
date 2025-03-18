package in.prec.cartservicesminiproject.utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

import in.prec.cartservicesminiproject.entitities.ElectronicProduct;
import in.prec.cartservicesminiproject.entitities.Product;
import in.prec.cartservicesminiproject.exceptions.BrandNameFormatException;
import in.prec.cartservicesminiproject.exceptions.NameFormatException;
import in.prec.cartservicesminiproject.exceptions.NegativeIdException;
import in.prec.cartservicesminiproject.services.ProductService;
import in.prec.cartservicesminiproject.services.ProductServiceImpl;

public class ProductUtilityImpl implements ProductUtility {
	private Product product;
	private ProductService service = new ProductServiceImpl();

	public ProductUtilityImpl(Product product) {
		this.product = product;
	}

	@Override
	public void add(Scanner scanner) {
		int id;
		String name;
		String brand;
		float price;
		try {
			System.out.println("Enter Product Id: ");
			id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Product Name: ");
			name = scanner.nextLine();
			System.out.println("Enter Product Brand: ");
			brand = scanner.nextLine();
			System.out.println("Enter Product Price: ");
			price = scanner.nextFloat();
			ElectronicProduct eProduct = new ElectronicProduct(id, name, brand, price);

			System.out.println(service.add(product, eProduct));
		} catch (NegativeIdException | NameFormatException | BrandNameFormatException e) {
			System.err.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.err.println("Invalid Input..");
			scanner.nextLine();
		}
//		product.getProductList().add(eProduct);
//		System.out.println("Product Added Successfully..");
	}

	@Override
	public void delete(Scanner scanner) {
		print();
		System.out.println("Enter a sr.No of Product to delete");
		int index = scanner.nextInt();
		System.out.println(service.delete(product, index));
//		product.getProductList().remove(index-1);
//		System.out.println("Product Deleted Successfully..");
	}

	@Override
	public void update(Scanner scanner) {
		print();
		System.out.println("Enter a sr.No of Product to update");
		int index = scanner.nextInt();
		int id;
		String name;
		String brand;
		float price;
		System.out.println("Enter Product Id: ");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Product Name: ");
		name = scanner.nextLine();
		System.out.println("Enter Product Brand: ");
		brand = scanner.nextLine();
		System.out.println("Enter Product Price: ");
		price = scanner.nextFloat();
		ElectronicProduct eProduct = new ElectronicProduct(id, name, brand, price);
		try {
			System.out.println(service.update(product, eProduct, index));
		} catch (NegativeIdException | NameFormatException | BrandNameFormatException e) {
			System.err.println(e.getMessage());
		}
//		product.getProductList().set(index-1, eProduct);
	}

	@Override
	public void print() {
		if (product.getProductList().isEmpty()) {
			System.out.println("Products are out of Stock..");
		} else {
			int i = 1;
			for (ElectronicProduct eProduct : product.getProductList())
				System.out.println((i++) + ") " + eProduct);
		}
	}

	private int printMenu(Scanner scanner, int attempts) {
		int choice = -1;
		if (attempts > 0) {
			try {
				System.out.println("Product Menu remaining attempts: " + attempts);
				System.out.println("	1.Add");
				System.out.println("	2.Edit");
				System.out.println("	3.Remove");
				System.out.println("	4.Print");
				System.out.println("	0.exit");
				choice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Invalid Number input");
				scanner.nextLine();
				printMenu(scanner, attempts - 1);
			}
		}
		return choice;
	}

	@Override
	public void manipulateProduct(Scanner scanner) {
		int choice = 0;
		do {
			choice = printMenu(scanner, 3);
			switch (choice) {
			case 1 -> add(scanner);
			case 2 -> update(scanner);
			case 3 -> delete(scanner);
			case 4 -> print();
			case 0 -> System.out.println("Exited from Product Manu");
			default -> System.out.println("Invalid Input");
			}

		} while (choice != 0);
	}

}
