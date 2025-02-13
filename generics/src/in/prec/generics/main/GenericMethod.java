package in.prec.generics.main;

import java.util.Arrays;

import in.prec.generics.entities.Student;

public class GenericMethod {

	public static void main(String[] args) {
		sort(4,5,3,1,2);
		sort("BBC", "ABC", "DBC", "CBC");
		sort(new Student(3,"ABC"), new Student(1, "BBC"), new Student(4,"CBC"), new Student(2,"DBC"));
	}
	
	public static <T extends Comparable<T>>void sort(T... tArray) {
		T temp=null;
		for(int i=0;i<tArray.length-1;i++)
			for(int j=0;j<tArray.length-1-i;j++)
				if(tArray[j].compareTo(tArray[j+1])>0) {
					temp=tArray[j];
					tArray[j]=tArray[j+1];
					tArray[j+1] = temp;
				}
		
		
//		for(T element:tArray)
//			System.out.println(element);
		System.out.println(Arrays.toString(tArray));
	}
}
