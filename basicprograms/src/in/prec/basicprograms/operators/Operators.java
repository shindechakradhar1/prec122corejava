package in.prec.basicprograms.operators;

public class Operators {

	int operand1;
	int operand2;
	
	public Operators() {
		operand1=10;
		operand2=20;
	}
	
	public Operators(int operand1, int operand2){
		this.operand1=operand1;
		this.operand2=operand2;
	}
	
	public void setOperand1(int operand1) {
		this.operand1=operand1;
	}
	
	public void setOperand2(int operand2) {
		this.operand2=operand2;
	}
	
	public int getOperand1() {
		return operand1;
	}
	
	public int getOperand2() {
		return operand2;
	}
	
	public int performAddition() {
		return operand1+operand2;
	}
	
	public int performLeftShiftOnOperand1(int position) {
		return operand1<<position;
	}
}
