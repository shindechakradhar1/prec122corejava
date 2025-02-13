package in.prec.association.entities;

public class Mother {
	private String name;
	private int age;
	private Child child;

	public Mother() {
		child = new Child();
	}

	public Mother(String name, int age, Child child) {
		this.name = name;
		this.age = age;
		this.child = new Child();
		this.child=child;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child=child;
	}

	@Override
	public String toString() {
		return "Mother [name=" + name + ", age=" + age + ", child=" + child + "]";
	}

}
