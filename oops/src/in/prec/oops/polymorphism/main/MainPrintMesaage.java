package in.prec.oops.polymorphism.main;

import in.prec.oops.polymorphism.subclasses.NumericMessage;
import in.prec.oops.polymorphism.superclass.PrintMessage;

public class MainPrintMesaage {

	public static void main(String[] args) {
		PrintMessage pMessage = new PrintMessage();
		
		NumericMessage nMessage = new NumericMessage();
		
		pMessage.setMsg("ABC");
		
		nMessage.setMsg(120);
		
		NumericMessage pm1=nMessage.getObj();
		
		System.out.println(pMessage.getMsg());
		System.out.println(nMessage.getMsg());
		
	}
}
