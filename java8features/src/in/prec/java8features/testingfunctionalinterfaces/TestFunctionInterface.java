package in.prec.java8features.testingfunctionalinterfaces;

import java.util.function.Function;

public class TestFunctionInterface {
	public static void main(String[] args) {
		Function<String, Integer> lengthFunction = 
//				(String name) -> {return name.length();};
				name -> name.length();
				
		System.out.println(lengthFunction.apply("Ashish"));
		
		
	}
}
