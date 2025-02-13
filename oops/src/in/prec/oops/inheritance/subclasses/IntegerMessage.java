package in.prec.oops.inheritance.subclasses;

import in.prec.oops.inheritance.abstractclasses.PrintMessage;

public class IntegerMessage extends PrintMessage{

	@Override
	public void print() {
		System.out.println(100);
	}
}
