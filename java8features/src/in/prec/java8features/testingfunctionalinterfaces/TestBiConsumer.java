package in.prec.java8features.testingfunctionalinterfaces;

import static in.prec.java8features.testingfunctionalinterfaces.entities.BiConsumerObjects.*;

public class TestBiConsumer {
	public static void main(String[] args) {
		
		nameAndAgeConsumer.accept("Ashish", 24);
		
		votingList.accept("Navnath", 17);
	}
}
