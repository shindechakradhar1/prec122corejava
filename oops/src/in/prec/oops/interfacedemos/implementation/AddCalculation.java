package in.prec.oops.interfacedemos.implementation;

import in.prec.oops.interfacedemos.Calculator;

public class AddCalculation implements Calculator{
	public int calculate(int number1, int number2) {
		return number1+number2;
	}
}
