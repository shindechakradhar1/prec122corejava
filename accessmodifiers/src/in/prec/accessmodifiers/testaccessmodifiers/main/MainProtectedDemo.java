package in.prec.accessmodifiers.testaccessmodifiers.main;

import in.prec.accessmodifiers.testaccessmodifiers.ProtectedDemo;

public class MainProtectedDemo extends ProtectedDemo{
	public static void main(String[] args) {
		MainProtectedDemo demo = new MainProtectedDemo();
//		demo.msg="Hello";
		demo.printProtectedDemoMessage();
	}
}
