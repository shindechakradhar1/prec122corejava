package in.prec.generics.main;

import in.prec.generics.classes.Dictionary;

public class MainDictionary {

	public static void main(String[] args) {
		Dictionary<String, Long>[] phoneBook = new Dictionary[10];
		phoneBook[0] = new Dictionary<>();
		phoneBook[0].setKey("Ayush");
		phoneBook[0].setValue(987456321L);
		
		System.out.println(phoneBook[0]);
		
		Dictionary<String, String> wordDictionary = new Dictionary<>();
		wordDictionary.setKey("Fool");
		wordDictionary.setValue("Idiot");
		
		System.out.println(wordDictionary);
	}
}
