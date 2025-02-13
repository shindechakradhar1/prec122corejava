package in.prec.association.main;

import in.prec.association.entities.Child;
import in.prec.association.entities.Mother;

public class CompositionMotherChildExample {
	public static void main(String[] args) {
		Mother mother = new Mother();
		Child child = new Child("Abhishek", 32);
		mother.setName("Aish");
		mother.setAge(30);
		mother.setChild(child);
		System.out.println(mother);
	}
}
