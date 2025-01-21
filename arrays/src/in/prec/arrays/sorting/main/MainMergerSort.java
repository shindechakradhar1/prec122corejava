package in.prec.arrays.sorting.main;

import java.util.Arrays;

import in.prec.arrays.sorting.MergeSort;

public class MainMergerSort {
	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int[] array = {4,6,1,2,0,1,3,5,4};
		sort.setIntArray(array);
		sort.mergeSort(0, array.length-1);
		System.out.println(Arrays.toString(array));
		
	}
}
