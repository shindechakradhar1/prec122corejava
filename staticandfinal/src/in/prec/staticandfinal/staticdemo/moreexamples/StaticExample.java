package in.prec.staticandfinal.staticdemo.moreexamples;

import in.prec.staticandfinal.staticdemo.StaticDemo;

public class StaticExample {

	public static StaticDemo demo;
	
//	public StaticExample(){
//		demo = new StaticDemo();
//	}
	static {
		demo=new StaticDemo();
	}
	
	public static void printData() {
		demo.printVariable();
	}
	
	
}
