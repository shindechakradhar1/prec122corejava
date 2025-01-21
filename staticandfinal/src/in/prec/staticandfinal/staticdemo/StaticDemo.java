package in.prec.staticandfinal.staticdemo;

public class StaticDemo {
	static int variable;
	int variable2;
	
	public static void setVariable(int variable) {
		StaticDemo.variable=variable;
	}
	
	public static int getVariable() {
		StaticDemo demo = new StaticDemo();
		setVariable(10);
		System.out.println(variable);
		System.out.println(demo.variable2);
		demo.printVariable();
		return variable;
	}
	
	public void printVariable() {
		System.out.println(variable2);
		System.out.println(variable);
//		getVariable();
	}
}
