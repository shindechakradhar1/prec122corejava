package in.prec.arrays.sorting.main;

import java.util.Arrays;

import in.prec.arrays.sorting.InsertionSort;

public class MainInsertionSort {
	public static void main(String[] args) {
		String[] names= {"Rushikesh","Mayur","Dhruv","Vrushali","Bharati","Punam"};
		InsertionSort sort = new InsertionSort();
		sort.setNames(names);
		for(String name:names)
			System.out.print(name+" ");
		sort.insertionSort();
		System.out.println();
		System.out.println(Arrays.toString(names));
	}
}
