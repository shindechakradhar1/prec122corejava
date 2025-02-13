package in.prec.oops.polymorphism.subclasses;

import in.prec.oops.polymorphism.superclass.PrintMessage;

public class NumericMessage extends PrintMessage {
	private int msg;

	public NumericMessage() {}

	public NumericMessage(int msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg+"";
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}
	
	@Override
	public NumericMessage getObj() throws RuntimeException{
		return new NumericMessage();
	}
	
}
