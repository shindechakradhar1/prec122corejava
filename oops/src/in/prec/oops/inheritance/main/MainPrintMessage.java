package in.prec.oops.inheritance.main;

import in.prec.oops.inheritance.abstractclasses.PrintMessage;
import in.prec.oops.inheritance.subclasses.IntegerMessage;
import in.prec.oops.inheritance.subclasses.StringMessage;

public class MainPrintMessage {
	public static void main(String[] args) {
		PrintMessage sMessage = new StringMessage();
		
		PrintMessage iMessage = new IntegerMessage();
		
		sMessage.print();
		
		iMessage.print();
		
//		PrintMessage pMessage = new PrintMessage();
	}
}
