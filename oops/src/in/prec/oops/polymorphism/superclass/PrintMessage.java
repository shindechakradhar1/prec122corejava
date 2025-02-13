package in.prec.oops.polymorphism.superclass;

import java.io.FileNotFoundException;

public class PrintMessage {
	private String msg;

	public PrintMessage() {}

	public PrintMessage(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public PrintMessage getObj() throws NullPointerException{
		return new PrintMessage();
	}

}
