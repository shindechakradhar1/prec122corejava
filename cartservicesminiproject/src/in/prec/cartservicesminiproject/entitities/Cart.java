package in.prec.cartservicesminiproject.entitities;

import java.util.LinkedList;

public class Cart {
	private LinkedList<ElectronicProduct> cartProduct;

	public Cart() {}

	public Cart(LinkedList<ElectronicProduct> cartProduct) {
		this.cartProduct = cartProduct;
	}

	public LinkedList<ElectronicProduct> getCartProduct() {
		return cartProduct;
	}

	public void setCartProduct(LinkedList<ElectronicProduct> cartProduct) {
		this.cartProduct = cartProduct;
	}

	@Override
	public String toString() {
		return "Cart [cartProduct=" + cartProduct + "]";
	}

}
