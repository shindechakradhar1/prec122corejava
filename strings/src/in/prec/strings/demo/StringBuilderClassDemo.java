package in.prec.strings.demo;

public class StringBuilderClassDemo {
	public static void main(String[] args) {
//		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder stringBuilder  = new StringBuilder();
		stringBuilder.append("12345");
		System.out.println(stringBuilder.capacity());
		int length=stringBuilder.length();
		
//		stringBuilder.deleteCharAt(0);
		stringBuilder.delete(1, 3);
		
		System.out.println(stringBuilder.toString());
		
		stringBuilder.setCharAt(2, (char)67);
		
		System.out.println(stringBuilder);
		
		stringBuilder.replace(0, 2, "AB");
		
		System.out.println(stringBuilder);
		
		stringBuilder.reverse();
		
		System.out.println(stringBuilder);
		
		char ch=stringBuilder.charAt(0);
		
		System.out.println(ch);
		
		int result=stringBuilder.compareTo(new StringBuilder("CBA"));
		
		System.out.println(result);
		
		boolean equalResult = stringBuilder.equals(new StringBuilder("CBA"));
		System.out.println(equalResult);
		
		String stringResult = stringBuilder.toString();
		
		System.out.println(stringResult);
		
	}
}
