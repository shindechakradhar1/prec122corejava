package in.prec.staticandfinal.staticdemo.main;

import in.prec.staticandfinal.staticdemo.StaticDemo;

public class MainStaticDemo {

	public static void main(String[] args) {
//		StaticDemo staticDemo = new StaticDemo();
//		staticDemo.setVariable(10);
//		StaticDemo.setVariable(20);
		int result = StaticDemo.getVariable();
		System.out.println(result);
	}
}
