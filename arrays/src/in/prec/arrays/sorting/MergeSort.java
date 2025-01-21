package in.prec.arrays.sorting;

import java.util.Arrays;

public class MergeSort {

	int[] intArray;

	public MergeSort() {}

	public MergeSort(int[] intArray) {
		this.intArray = intArray;
	}

	public int[] getIntArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}
	
	public void mergeSort(int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(left,mid);
			mergeSort(mid+1,right);
			merge1(left,mid,right);
		}
	}

	private void merge(int left, int mid, int right) {
		int firstArraySize = mid-left+1;
		int secondArraySize = right-mid;
		int[] firstArray = new int[firstArraySize];
		int[] secondArray = new int[secondArraySize];
		
		for(int i=0;i<firstArraySize;i++)
			firstArray[i]=intArray[left+i];
		
		for(int j=0;j<secondArraySize;j++)
			secondArray[j]=intArray[mid+1+j];
		
		int f=0;
		int s=0;
		int r=left;
		while(f<firstArraySize && s<secondArraySize) {
			if(firstArray[f]<secondArray[s]) {
				intArray[r]=firstArray[f];
				r++;
				f++;
			}else {
				intArray[r]=secondArray[s];
				r++;
				s++;
			}		
		}
		
		while(f<firstArraySize) {
			intArray[r]=firstArray[f];
			r++;
			f++;
		}
		
		while(s<secondArraySize) {
			intArray[r]=secondArray[s];
			r++;
			s++;
		}
			
	}
	
	private void merge1(int left, int mid, int right) {
//		int[] tempArray = new int[intArray.length];
//		for(int i=0;i<intArray.length;i++)
//			tempArray[i]=intArray[i];
		int[] tempArray = Arrays.copyOf(intArray, right+1);
		
		int f=left;
		int s=mid+1;
		int r=left;
		while(f<=mid && s<=right) 
			if(tempArray[f]<tempArray[s]) 
				intArray[r++] = tempArray[f++];
			else 
				intArray[r++]=tempArray[s++];
			
		while(f<=mid) 
			intArray[r++]=tempArray[f++];
		
		while(s<=right) 
			intArray[r++]=tempArray[s++];
			
	}
	
	
}
