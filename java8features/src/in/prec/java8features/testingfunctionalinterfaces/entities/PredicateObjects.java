package in.prec.java8features.testingfunctionalinterfaces.entities;

import java.util.function.Predicate;

public class PredicateObjects {
	public static final Predicate<Fan> validateColor=
			fan -> 
				fan.getColor().matches("[A-Z][a-z]+") 
				&& 
				fan.getColor().length()>=3;
}
