package in.prec.arrays.shifting.main;

import in.prec.arrays.shifting.ArrayShifting;

public class MainArrayShifting {

	public static void main(String[] args) {
		ArrayShifting shifting = new ArrayShifting();
		int[] intArray = {10,20,30,40,50};
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i] + " ");
		
		for(int i=0;i<2;i++)
			shifting.rightShift(intArray);
		System.out.println();
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i] + " ");
	}
}
