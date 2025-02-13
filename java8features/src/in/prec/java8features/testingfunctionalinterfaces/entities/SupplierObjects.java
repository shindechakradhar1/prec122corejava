package in.prec.java8features.testingfunctionalinterfaces.entities;

import java.util.function.Supplier;

public class SupplierObjects {
	public static final Supplier<Integer> randomIntSupplier =
			()->(int) (Math.random()*100);
			
}
