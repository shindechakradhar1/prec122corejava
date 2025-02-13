package in.prec.oops.inheritance.superclasses;

public class Product {
	private String name;
	
	
	public Product() {}
	
	public Product(String name) {
		this.name = name;
	}

	public void print(){
		System.out.println(name);
		
	}
	
	public void printProduct() {
		System.out.println("Product Class");
	}
}
