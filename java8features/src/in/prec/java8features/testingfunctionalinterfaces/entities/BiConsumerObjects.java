package in.prec.java8features.testingfunctionalinterfaces.entities;

import java.util.function.BiConsumer;

public class BiConsumerObjects {
	public static final BiConsumer<String, Integer> nameAndAgeConsumer = 
			(name, age)->
				System.out.print("name: " + name + " age:" + age);
	
	
	public static final BiConsumer<String, Integer>	validVoterConsumer = 
			(name, age)-> System.out.print((age>18)?" Valid Voter":" Invalid Voter");
	
	public static final BiConsumer<String, Integer> votingList=nameAndAgeConsumer.andThen(validVoterConsumer);
	
}
