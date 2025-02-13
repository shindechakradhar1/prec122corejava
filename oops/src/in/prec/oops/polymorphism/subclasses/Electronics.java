package in.prec.oops.polymorphism.subclasses;

import in.prec.oops.inheritance.superclasses.Product;

public class Electronics extends Product{
	private int voltage;

	public Electronics(int voltage) {
		this.voltage = voltage;
	}
	
	@Override
	public void print() {
		System.out.println(voltage);
	}
	
	public void printElectronics() {
		System.out.println("Electronics Class");
	}
	
}
