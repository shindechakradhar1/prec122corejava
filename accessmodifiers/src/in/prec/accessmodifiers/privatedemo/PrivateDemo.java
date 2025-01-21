package in.prec.accessmodifiers.privatedemo;

public class PrivateDemo {
	private int variable1;
	private int variable2;
	
	public PrivateDemo() {}
	
	public PrivateDemo(int variable1, int variable2) {
		this.variable1=variable1;
		this.variable2=variable2;
	}
	
	public void setVariable1(int variable1) {
		if(variable1>0)
		this.variable1=variable1;
	}
	
	public void setVariable2(int variable2) {
		this.variable2=variable2;
	}
	
	public int getVariable1() {
		return variable1;
	}
	
	public int getVariable2() {
		return variable2;
	}
	
	@Override
	public String toString() {
		return "Variable1: " + variable1
				+ " Variable2: " + variable2;	
	}
}
