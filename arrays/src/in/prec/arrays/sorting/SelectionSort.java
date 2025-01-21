package in.prec.arrays.sorting;

public class SelectionSort {

	private String[] stringArray;

	public SelectionSort() {}

	public SelectionSort(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public void selectionSort() {
		int key;
		String temp;
		for(int i=0;i<stringArray.length;i++) {
			key=i;
			for(int j=i+1;j<stringArray.length;j++)
				if(stringArray[key].compareTo(stringArray[j])>0)
					key=j;
			temp=stringArray[i];
			stringArray[i]=stringArray[key];
			stringArray[key]=temp;
		}
	}
	
	
}
