package in.prec.accessmodifiers.testaccessmodifiers.main;

import in.prec.accessmodifiers.testaccessmodifiers.Helper;

public class MainDefaultDemo {
	public static void main(String[] args) {
//		DefaultDemo1 demo1= new DefaultDemo1();
//		DefaultDemo2 demo2= new DefaultDemo2();
//		
//		demo1.printDefaultDemo1Message();
		
		Helper helper = new Helper();
		helper.accessPrintDefaultDemo1Message();
		helper.accessPringDefaultDemo2Message();
	}
}
