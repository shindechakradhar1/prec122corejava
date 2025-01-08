package in.prec.logicalprograms.reversestring;

public class ReverseString {
	String variable;
	public ReverseString() {}
	public ReverseString(String variable) {
		this.variable=variable;
	}
	
	public void setVariable(String variable) {
		this.variable=variable;
	}
	
	public String getVariable() {
		return variable;
	}
	
	public String reverseString() {
		char[] charArray=variable.toCharArray();
		int left=0;
		int right=charArray.length-1;
		while(left<=right) {
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		
		return new String(charArray);
	}
	
	public String reverseStringLine() {
		String[] stringArray=variable.split(" ");
		int left=0;
		int right=stringArray.length-1;
		while(left<=right) {
			String temp=stringArray[left];
			stringArray[left]=stringArray[right];
			stringArray[right]=temp;
			left++;
			right--;
		}
		return String.join(" ", stringArray);
		
	}
}
