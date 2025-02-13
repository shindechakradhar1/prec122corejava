package in.prec.wrapperclasses;


public abstract class WrapperClassesDemo  {
	public static void main(String[] args) {
// 		Deprecated from SE version 9
//		Integer var1 = new Integer(10);
		
//		Boxing
		Integer var2=Integer.valueOf(20);
		
		
//		unboxing
		int var3 = var2.intValue();
		
		System.out.println(var2);
		
		int var01=10;
		
		Integer var4=var01;
		
		int var5=var4;
		
//		constant MAX_VALUE and MIN_VALUE
		System.out.println(Integer.MIN_VALUE);
		
//		parseXxx(Static method)
		int parseIntResult=Integer.parseInt("10110");
		
		float parseFloatResult=Float.parseFloat("12.50");
		
//		xxxValue
		
		int intValueResult=var4.intValue();
		
		float floatValueResult = var4.floatValue();
		
		Float floatVar = 10.20F;
		
		int floatIntValueResult=floatVar.intValue();
		
//		toString()
		
		String floatToStringResult=floatVar.toString();
		
		Byte byteVar = 10;
		
		System.out.println
			(Integer.toBinaryString(byteVar));
		
//		Character (isLetter isDigit)(static)
		
		Character ch = 'a';
		
		boolean isLetter=Character.isLetter(ch);
		boolean isDigit=Character.isDigit(ch);
		
		Character chUpper=Character.toUpperCase(ch);
		
		Boolean isTrue = true;
		
		Boolean isParseResult=Boolean.parseBoolean("true");
		
		Boolean isFalse = false;
		
		Integer intVariable1 = 200;
		Integer intVariable2= 200;
		
		System.out.println(intVariable1==intVariable2);
		
		Float floatVar1=10.10F;
		Float floatVar2=10.11F;
		
		System.out.println(floatVar1==floatVar2);
		
		if(floatVar1.equals(floatVar2))
			System.out.println("Are equals");
		
		int compareToResult=floatVar1.compareTo(floatVar2);
		
		System.out.println(compareToResult);
		
		int compareResult = Float.compare(floatVar1, floatVar2);
	}
}
