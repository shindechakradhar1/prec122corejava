package in.prec.staticandfinal.staticdemo.moreexamples.main;

import in.prec.staticandfinal.staticdemo.moreexamples.StaticExample;

public class MainStaticExample {
	
	int variable;
	
	
	static {
		System.out.println("Static Block");
	}
	
	public void printHello() {
		System.out.println("hello");
		System.out.println(variable);
//		main("ABC","BBC");
	}

	public static void main(String... args) {
		MainStaticExample example = new MainStaticExample();
//		StaticExample.printData();
		StaticExample.demo.printVariable();
		example.printHello();
		System.out.println(example.variable);
	}
}
