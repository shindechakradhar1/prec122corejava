package in.prec.basicprograms.operators.main;

import in.prec.basicprograms.operators.Operators;

public class MainOperators {

	public static void main(String[] args) {
		Operators operator1 = new Operators();
		operator1.setOperand1(10);
		System.out.println(operator1.performLeftShiftOnOperand1(2));
	}
}
