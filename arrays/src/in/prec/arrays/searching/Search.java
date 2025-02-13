package in.prec.arrays.searching;

public class Search {
	private int[] array;

	private int key;

	public Search() {}

	public Search(int[] array, int key) {
		this.array = array;
		this.key = key;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	public int linearSearch() {
		for(int i=0;i<array.length;i++)
			if(key==array[i])
				return i;
		
		return -1;
	}
	
	public int binarySearch() {
		int left=0;
		int right=array.length-1;
		int mid=0;
		while(left<=right) {
			mid=(left+right)/2;
			if(key==array[mid])
				return mid;
			else if(key>array[mid])
				left=mid+1;
			else
				right=mid;
		}
		
		return -1;
	}
	
}
