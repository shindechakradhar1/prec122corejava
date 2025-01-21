package in.prec.staticandfinal.finaldemo.main;

import in.prec.staticandfinal.finaldemo.Holidays;

public class MainHolidays {
	public static void main(String[] args) {
		Holidays diwali = new Holidays("Diwali", 5);
		Holidays dasara = new Holidays("dasara", 1);
		
		System.out.println(diwali);
		System.out.println(dasara);
	}
}
