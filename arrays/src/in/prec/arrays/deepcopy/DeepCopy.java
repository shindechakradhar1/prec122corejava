package in.prec.arrays.deepcopy;

import java.util.Arrays;

public class DeepCopy {

	public void copyEachElement(int[] srcArray) {
		int[] destArray = new int[srcArray.length];
		for (int i = 0; i < srcArray.length; i++)
			destArray[i] = srcArray[i];

		System.out.println("sourceArray");
		for (int number : srcArray)
			System.out.print(number + " ");

		System.out.println("destination Array");
		System.out.println(Arrays.toString(destArray));

		destArray[0] = 111;

		System.out.println("destination Array");
		System.out.println(Arrays.toString(destArray));
		
		System.out.println("sourceArray");
		for (int number : srcArray)
			System.out.print(number + " ");
	}
	
	public void shalowCopy(int[] srcArray) {
		srcArray[0]=101;
	}

	public static void main(String[] args) {
		DeepCopy copy = new DeepCopy();
		int[] sourceArray = new int[] { 1, 2, 3, 4, 5, 6 };

		for(int number:sourceArray)
			System.out.print(number + " ");
		System.out.println();
		copy.shalowCopy(sourceArray);
		
		for(int number:sourceArray)
			System.out.print(number + " ");
	}
}
