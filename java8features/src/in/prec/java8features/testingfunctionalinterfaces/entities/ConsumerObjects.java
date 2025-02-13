package in.prec.java8features.testingfunctionalinterfaces.entities;

import java.util.function.Consumer;

public class ConsumerObjects {

	public static final Consumer<String> stringConsumer 
	= System.out::println;
			
	public static final Consumer<Integer> intConsumer = 
					var -> System.out.println(var);
					
	public static final Consumer<Fan> fanConsumer = 
			fan -> System.out.print(fan);
			
}
