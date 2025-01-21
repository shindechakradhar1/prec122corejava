package in.prec.arrays.sorting;

public class InsertionSort {

	private String[] names;

	public InsertionSort() {}

	public InsertionSort(String[] names) {
		this.names = names;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}
	
	public void insertionSort() {
		String key;
		int j;
		for(int i=0;i<names.length;i++) {
			key=names[i];
			j=i-1;
			while(j>=0 && names[j].compareTo(key)>0) {
				names[j+1]=names[j];
				j--;
			}
			names[j+1]=key;
		}
	}
	
	
}
