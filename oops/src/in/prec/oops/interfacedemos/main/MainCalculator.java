package in.prec.oops.interfacedemos.main;

import in.prec.oops.interfacedemos.Calculator;
import in.prec.oops.interfacedemos.implementation.AddCalculation;
import in.prec.oops.interfacedemos.implementation.SubstractionCalculation;

public class MainCalculator {

	public static void main(String[] args) {
		Calculator addCalc=new AddCalculation();
		addCalc.printMessage("J122");
		addCalc.printMessage(addCalc.calculate(10, 20)+"");
		
		Calculator subCalc = new SubstractionCalculation();
		subCalc.printMessage(subCalc.calculate(30, 20)+"");
		
//		Calculator mulCalc = new Calculator() {
//			@Override
//			public int calculate(int number1, int number2) {
//				return number1*number2;
//			}
//		};
		Calculator mulCalc = (number1, number2)-> number1*number2;
		
		mulCalc.printMessage(mulCalc.calculate(5, 4)+"");
		
		Calculator divCalc = (n1,n2)->n1/n2;
		
		divCalc.printMessage(divCalc.calculate(30, 6)+"");
		
		Calculator leftShiftCalc = (n1,n2)->n1<<n2;
		
		leftShiftCalc.printMessage(leftShiftCalc.calculate(10, 2) + "");
		
		
	}
}
