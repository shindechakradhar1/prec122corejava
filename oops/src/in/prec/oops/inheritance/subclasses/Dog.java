package in.prec.oops.inheritance.subclasses;

import in.prec.oops.inheritance.superclasses.Animal;

public class Dog extends Animal {

	private String breed;
	private int legs;
	public Dog() {
		System.out.println("Dog constructor" + getColor());
	}
	public Dog(String breed, int legs, String color, int age) {
		super(color, age);
		this.breed=breed;
		this.legs=legs;
	}
	
	public Dog(String breed, int legs) {
		this.breed = breed;
		this.legs = legs;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
}
