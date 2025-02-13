package in.prec.generics.main;

import in.prec.generics.classes.GenericClass;
import in.prec.generics.classes.PreGenericObject;

public class PreGenericExample {
	public static void main(String[] args) {
		
//		PreGenericObject obj = new PreGenericObject();
//		
////		obj.setObj("ABC");
//		
//		obj.setObj(10,20,"abc",10.20F);
//		
//		IntegerClass integerData = new IntegerClass();
//		integerData.setVar1(10);
//		int result=integerData.getVar1();
//		
//		StringClass stringData = new StringClass();
//		stringData.setName("ABC");
//		String nameResult=stringData.getName();
//		
		GenericClass<Integer> intData = new GenericClass<>();
		intData.setT(10);
		int result1=intData.getT();
//		
//		GenericClass<String> strData = new GenericClass<>();
//		strData.setT("ABC");
//		String sResult=strData.getT();
	}
}
