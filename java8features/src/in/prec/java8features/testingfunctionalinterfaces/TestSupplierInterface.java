package in.prec.java8features.testingfunctionalinterfaces;

import in.prec.java8features.testingfunctionalinterfaces.entities.SupplierObjects;

public class TestSupplierInterface {
	public static void main(String[] args) {
		
				
		int val=SupplierObjects.randomIntSupplier.get();
		System.out.println(val);
				
	}
}
