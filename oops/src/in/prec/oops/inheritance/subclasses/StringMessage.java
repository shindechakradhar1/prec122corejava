package in.prec.oops.inheritance.subclasses;

import in.prec.oops.inheritance.abstractclasses.PrintMessage;

public class StringMessage extends PrintMessage{

	@Override
	public void print() {
		System.out.println("Hello");
	}
}
