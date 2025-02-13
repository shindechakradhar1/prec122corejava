package in.prec.oops.inheritance.main;

import in.prec.oops.inheritance.abstractclasses.Demo;
import in.prec.oops.inheritance.subclasses.Demo2;

public class MainDemo {

	public static void main(String[] args) {
		Demo2 demo = new Demo2(10);
		
		demo.print1();
		demo.showMessage();
		
		Demo.showMessage1();
	}
}
