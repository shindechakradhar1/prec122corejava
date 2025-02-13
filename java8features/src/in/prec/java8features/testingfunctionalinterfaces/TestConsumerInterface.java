package in.prec.java8features.testingfunctionalinterfaces;

import static in.prec.java8features.testingfunctionalinterfaces.entities.ConsumerObjects.*;
import in.prec.java8features.testingfunctionalinterfaces.entities.Fan;

public class TestConsumerInterface {
	public static void main(String[] args) {

		stringConsumer.accept("ABC");
		stringConsumer.accept("BBC");
		stringConsumer.accept("CBC");

		intConsumer.accept(100);

		Fan fan1 = new Fan("Black", 3);

		fanConsumer.accept(fan1);

	}

}
