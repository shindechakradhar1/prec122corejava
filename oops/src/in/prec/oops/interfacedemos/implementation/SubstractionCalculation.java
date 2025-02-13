package in.prec.oops.interfacedemos.implementation;

import in.prec.oops.interfacedemos.Calculator;

public class SubstractionCalculation implements Calculator{
	@Override
	public int calculate(int number1, int number2) {
		return number1-number2;
	}
}
