package in.prec.arrays.searching.main;

import in.prec.arrays.searching.Search;
import in.prec.arrays.sorting.MergeSort;

public class MainSearching {

	public static void main(String[] args) {
		int[] array = {3,2,1,5,6};
		System.out.println(array.length);
//		Arrays.sort(array);
		MergeSort sort = new MergeSort();
		sort.setIntArray(array);
		sort.mergeSort(0, array.length-1);
		int key=3;
		Search search = new Search();
		search.setArray(array);
		search.setKey(key);
		int result = search.binarySearch();
		if(result >=0)
			System.out.println("Given Key found at: " + result);
		else
			System.out.println("Given key not found");
	}
}
