package in.prec.arrays.copyarray.main;

import java.util.Arrays;

import in.prec.arrays.copyarray.CopyArray;

public class MainCopyArray {

	public static void main(String[] args) {
		int[] firstArray= {3,5,6,7,2,7};
		int[] secondArray= {8,9,1,2,4,10};
		CopyArray copyArray = new CopyArray();
		copyArray.setFirstArray(firstArray);
		copyArray.setSecondArray(secondArray);
		
//		int[] result=copyArray.copyTwoArrays();
		int[] result=copyArray.copyFirstHalfAndSecondHalfSortedfArray();
		System.out.println(Arrays.toString(result));
	}
}
