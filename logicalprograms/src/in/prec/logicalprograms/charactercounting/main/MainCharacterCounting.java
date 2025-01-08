package in.prec.logicalprograms.charactercounting.main;

import in.prec.logicalprograms.charactercounting.CharacterCounting;

public class MainCharacterCounting {
	public static void main(String[] args) {
		CharacterCounting charCounting= new CharacterCounting();
		
		charCounting.setVariable("aeriuousdfjaskldfoiuoerwasdafdsf");
		charCounting.coutnVowels();
	}
}
