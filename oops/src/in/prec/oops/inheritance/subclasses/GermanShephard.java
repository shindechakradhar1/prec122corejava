package in.prec.oops.inheritance.subclasses;

public class GermanShephard extends Dog {

	String speciality;

	public GermanShephard() {
		System.out.println("German Shephard constructor");
	}

	public GermanShephard(String speciality) {
		this.speciality = speciality;
	}
	
	public GermanShephard
	(String speciality, String breed, int legs, String color, int age) {
		super(breed, legs, color, age);
		this.speciality=speciality;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
}
