package in.prec.java8features.streamapi;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class TestStreamApi {

	public static void main(String[] args) {
//		String[][] strArray = {{"ABC","BBC"},{"CBC","DBC"},{"EBC","FBC"}};
//		
//		Stream<String[]> strStream = Arrays.stream(strArray);
		
//		Stream<Integer> intStream=Stream.of(1,2,3,4,5,6,7,8,9,10);
		
//		intStream
//			.filter(no->no%2==0)
//				.forEach(System.out::println);
//		long result=strStream.flatMap(strArray1->Arrays.stream(strArray1))
//		.filter(str->str.charAt(0)=='F').count();
//		
//		System.out.println(result);
//		
//		strStream.close();
	
//		******************************************
		
//		int[][] intArray = {{7,6,1},{2,3,9},{5,4,8}};
//		Stream<int[]> intStream=Arrays.stream(intArray);
//		intStream.flatMapToInt(intArray1->Arrays.stream(intArray1))
////		.peek(no->System.out.println("Before Filter: " + no))
//		.filter(no->no%2==0)
////		converting int to Integer using boxed, to use comparator interface
//		.boxed()
//		.sorted(Comparator.naturalOrder())
////		.peek(no->System.out.println("After Filter: " + no))
//		.forEach(System.out::println);
		
//		*************************
		
//		int[][] intArray = {{3,1,5},{4,7,2},{9,6,8}};
//		Stream<int[]> intStream = Arrays.stream(intArray);
//		OptionalInt result=intStream.flatMapToInt(Arrays::stream)
//		.filter(no -> no%2==0)
////		reduce(initialval, binaryOperation) will return value only else returns Optional
//		.reduce((a,b)->(a>b)?b:a);
//		
//		if(result.isPresent())
//			System.out.println(result.getAsInt());
//		
////		result.ifPresent(System.out::println);
//		
//		intStream.close();
		
//		******************************************
		
		int[][] intArray = {{1,2,3},{4,5,6},{7,8,9}};
		Stream<int[]> intStream=Arrays.stream(intArray);
		
//		toArray method
		
//		int[] intEvenArray=intStream
//		.flatMapToInt(Arrays::stream)
//		.filter(no->no%2==0)
//		.toArray();
//		System.out.println(Arrays.toString(intEvenArray));
		
//		min method
//		OptionalDouble average=intStream
//		.flatMapToInt(Arrays::stream)
//		.average();
//		
//		average.ifPresent(System.out::println);
		
//		findFirst 
//		OptionalInt firstElement=intStream
//		.flatMapToInt(Arrays::stream)
//		.findFirst();
//		
//		if(firstElement.isPresent())
//			System.out.println(firstElement.getAsInt());
		
//		anyMatch
		boolean isPresent=intStream
		.flatMapToInt(Arrays::stream)
		.allMatch(no->no==0);
		
	}
}
