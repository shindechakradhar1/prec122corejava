package in.prec.cartservicesminiproject.entitities;

import java.util.LinkedList;

public class Product {
	
	private LinkedList<ElectronicProduct> productList = new LinkedList<>();

	public Product() {}

	public Product(LinkedList<ElectronicProduct> productList) {
		this.productList = productList;
	}

	public LinkedList<ElectronicProduct> getProductList() {
		return productList;
	}

	public void setProductList(LinkedList<ElectronicProduct> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Product [productList=" + productList + "]";
	}

}
