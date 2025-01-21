package in.prec.arrays.sorting.main;

import in.prec.arrays.sorting.SelectionSort;

public class MainSelectionSort {

	public static void main(String[] args) {
		String[] temp = {"Vivek", "Navnath", "Tejas", "Ayush", "Piyush"};
		SelectionSort sort = new SelectionSort();
		sort.setStringArray(temp);
		
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");
		sort.selectionSort();
		System.out.println();
		for(String name:temp)
			System.out.print(name + " ");
	}
}
