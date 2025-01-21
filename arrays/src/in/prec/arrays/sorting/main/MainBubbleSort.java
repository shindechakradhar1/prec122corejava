package in.prec.arrays.sorting.main;

import in.prec.arrays.sorting.BubbleSort;

public class MainBubbleSort {

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		String[] names = {"FBC","ABC", "EBC", "BBC", "DBC", "CBC"};
		sort.setStringArray(names);
		System.out.println("Before Sorting:");
		for(String name:names)
			System.out.print(name + " ");
		
		System.out.println();
		
		sort.bubbleSort();
		
		
		
		System.out.println("After Sorting:");
		for(String name:names)
			System.out.print(name + " ");
		
		
	}
}
