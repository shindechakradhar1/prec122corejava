package in.prec.generics.classes;

public class GenericClassForArrays<T> {

	private T[] tArray;
	
	public void setTArray(T... tArray) {
		this.tArray=tArray;
	}
	
	public void printArray() {
//		for(int i=0;i<tArray.length;i++)
		for(T tElement:tArray) 
			System.out.println(tElement);
	}
}
