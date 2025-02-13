package in.prec.strings.demo;

public class StringClassDemo {

	public static void main(String[] args) {
//		String name="ABC";
//		String name = new String();
//		String name = new String("ABC");
		char[] chArray = {'a','b','c','a'};
		String name = new String(chArray);
		
		int length = name.length();
		char ch = name.charAt(0);
		String result=name.replace('a', 'z');
		System.out.println(result);
		String newResult=result.replace("zb","a");
		System.out.println(newResult);
		
		String finalResult=newResult.concat(result);
		System.out.println(finalResult);
		
		boolean isContains=finalResult.contains("zzc");
		System.out.println(isContains);
		
		String subString1 = finalResult.substring(4);
		String subString2 = finalResult.substring(0,4);
		
		String[] splitResult=finalResult.split("zz");
		
		String joinResult=String.join(":", splitResult);
		System.out.println(joinResult);
		
		boolean matchResult=joinResult.matches("[a-z]\\:[a-z]+");
		System.out.println(matchResult);
		
		char[] charArray=joinResult.toCharArray();
		
		String name2=new String("ABC").intern();
		String name1="ABC";
		
		System.out.println(name1==name2);
		
	}
}
