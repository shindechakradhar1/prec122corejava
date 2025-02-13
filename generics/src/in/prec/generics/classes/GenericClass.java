package in.prec.generics.classes;

public class GenericClass<T>{ //Typed Parameter

	private T t;
	
	public void setT(T t) {
		this.t=t;
	}
	
	public T getT() {
		return t;
	}
}
