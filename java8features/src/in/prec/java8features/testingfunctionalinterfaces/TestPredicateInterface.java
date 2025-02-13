package in.prec.java8features.testingfunctionalinterfaces;

import in.prec.java8features.testingfunctionalinterfaces.entities.Fan;
import in.prec.java8features.testingfunctionalinterfaces.entities.PredicateObjects;

public class TestPredicateInterface {

		public static void main(String[] args) {
			
			
					Fan fan = new Fan("wh", 4);
					
					if(PredicateObjects.validateColor.test(fan))
						System.out.println(fan + " stored in files");
					else
						System.out.println("Invalid Color");
		}
}
