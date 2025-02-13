package in.prec.generics.main;

public class UpperBoundDemo {

	public static void main(String[] args) {
		double sum=calculateSum(10.0F,2.3F,3,4,5,6);
		System.out.println(sum);
		
		
	}
	
	public static <T extends Number>double calculateSum(T... tArray){
		
		double sum=0.0;
		for(T t:tArray)
			sum += t.doubleValue();
		
		return sum;
		
	}
}
