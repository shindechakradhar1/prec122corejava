package in.prec.oops.inheritance.abstractclasses;

public abstract class Demo {

	private int var;
	
	public Demo(int var) {
		this.var=var;
	}
	
	public void showMessage() {
		System.out.println("Instance method");
	}
	
	public static void showMessage1() {
		System.out.println("Static method");
	}
	
	public abstract void print();
	
	public abstract void print1();
	
	public abstract void print2();
}
