package in.prec.oops.encapsulation;

public class Employee {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.matches("[A-Z][a-z]{1,14}"))
			this.name = name;
		else
			System.out.println("Please Enter valid name");
	}
	
}
