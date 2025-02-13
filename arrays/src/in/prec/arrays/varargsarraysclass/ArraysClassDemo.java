package in.prec.arrays.varargsarraysclass;

import java.util.Arrays;

public class ArraysClassDemo {
	
	public static void main(String[] args) {
		int[] array = new int[5];
		
		//print(array);
		
		Arrays.fill(array, 1,4,3);
		
		//print(array);
		print(6,"",1,2,3,4,5,6);
		
		
	}
	
	public static void print(int length, String name ,int... array) {
		System.out.println(Arrays.toString(array));
		
	}
}
