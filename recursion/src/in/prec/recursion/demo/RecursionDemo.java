package in.prec.recursion.demo;

public class RecursionDemo {

	private int variable;

	public RecursionDemo() {}

	public RecursionDemo(int variable) {
		this.variable = variable;
	}

	public int getVariable() {
		return variable;
	}

	public void setVariable(int variable) {
		this.variable = variable;
	}
	
	
	public void printVariable(int no) {
		if(no-->0)
			printVariable(no);
		
		System.out.println(no);
	}
	
	

	@Override
	public String toString() {
		return "RecursionDemo [variable=" + variable + "]";
	}

}
