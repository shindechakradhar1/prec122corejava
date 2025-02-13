package in.prec.java8features.testingfunctionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Supplier;

import in.prec.java8features.testingfunctionalinterfaces.entities.Fan;

public class MethodReferencinigConsumerAndSupplier {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Consumer<String> fanColorConsumer = fan1::setColor;
		
		fanColorConsumer.accept("Brown");
		
		Supplier<String> fanColorSupplier = fan1::getColor;
		
		String fanColor = fanColorSupplier.get();
		
		System.out.println(fanColor);
		
	}
}
