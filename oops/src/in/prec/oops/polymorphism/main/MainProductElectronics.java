package in.prec.oops.polymorphism.main;

import in.prec.oops.inheritance.superclasses.Product;
import in.prec.oops.polymorphism.subclasses.Electronics;

public class MainProductElectronics {

	public static void main(String[] args) {
		// upcasting
		Product product = new Electronics(12);
		
		// downcasting
		Electronics electronic = new Electronics(10);//(Electronics) new Product("Charger");
		
		
		electronic.print();
		product.print();
		
		
	}
}
