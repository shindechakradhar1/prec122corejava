package in.prec.logicalprograms.charactercounting;

public class CharacterCounting {
	String variable;
	public CharacterCounting() {}
	public CharacterCounting(String variable) {
		this.variable=variable;
	}
	public void setVariable(String variable) {
		this.variable=variable;
	}
	
	public String getVariable() {
		return variable;
	}
	
	public void coutnVowels() {
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int consonant=0;
		for(int j=0;j<variable.length();j++) {
			switch (variable.toLowerCase().charAt(j)) {
			case 'a' -> a++;
			case 'e' -> e++;
			case 'i' -> i++;
			case 'o' -> o++;
			case 'u' -> u++;
			default -> consonant++;
			}
		}
		
		System.out.println("a: " + a);
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
		System.out.println("Consonant: " + consonant);
	}
}
