package in.prec.arrays.copyarray;

public class CopyArray {
	int[] firstArray;
	int[] secondArray;

	public CopyArray() {
	}

	public CopyArray(int[] firstArray, int[] secondArray) {
		this.firstArray = firstArray;
		this.secondArray = secondArray;
	}

	public int[] getFirstArray() {
		return firstArray;
	}

	public void setFirstArray(int[] firstArray) {
		this.firstArray = firstArray;
	}

	public int[] getSecondArray() {
		return secondArray;
	}

	public void setSecondArray(int[] secondArray) {
		this.secondArray = secondArray;
	}
	
	public int[] copyTwoArrays() {
		int[] resultArray=new int[firstArray.length+secondArray.length];
		int r=0;
		for(int f=0;f<firstArray.length;f++)
			resultArray[r++]=firstArray[f];
		
		for(int s=0;s<secondArray.length;s++)
			resultArray[r++]=secondArray[s];
		
		return resultArray;
	}
	
	public int[] copyFistHalfAndSecondHalfArray() {
		int midFirst = (firstArray.length-1)/2;
		int midSecond = (secondArray.length-1)/2;
		int[] result = new int[midFirst+1 + midSecond+1];
		int r=0;
		for(int f=0;f<=midFirst;f++)
			result[r++]=firstArray[f];
		
		for(int s=midSecond;s<secondArray.length;s++)
			result[r++]=secondArray[s];
		
		return result;
	}
	
	public int[] copyFirstHalfAndSecondHalfSortedfArray() {
		int midFirst = (firstArray.length-1)/2;
		int midSecond=(secondArray.length-1)/2;
		
		int[] result = new int[midFirst+1 + midSecond+1];
		if(secondArray.length%2==0)
			midSecond++;
		int f=0;
		int s=midSecond;
		int r=0;
		while(f<=midFirst && s<secondArray.length)
			if(firstArray[f]<secondArray[s]) 
				result[r++]=firstArray[f++];
			else 
				result[r++]=secondArray[s++];
		
		while(f<=midFirst)
			result[r++]=firstArray[f++];
		while(s<secondArray.length)
			result[r++]=secondArray[s++];
		
		return result;
	}

}
