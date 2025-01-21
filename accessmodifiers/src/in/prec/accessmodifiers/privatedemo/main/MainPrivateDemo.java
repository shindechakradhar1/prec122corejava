package in.prec.accessmodifiers.privatedemo.main;

import in.prec.accessmodifiers.privatedemo.PrivateDemo;

public class MainPrivateDemo {
	public static void main(String[] args) {
		PrivateDemo privateDemo = new PrivateDemo();
		privateDemo.setVariable1(10);
		privateDemo.setVariable2(20);
//		privateDemo.variable1=-10;
		System.out.println(privateDemo);
	}
}
