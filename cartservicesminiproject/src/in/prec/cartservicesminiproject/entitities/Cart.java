package in.prec.cartservicesminiproject.entitities;

import java.util.LinkedList;

public class Cart {
	private LinkedList<Product> cartProduct;

	public Cart() {}

	public Cart(LinkedList<Product> cartProduct) {
		this.cartProduct = cartProduct;
	}

	public LinkedList<Product> getCartProduct() {
		return cartProduct;
	}

	public void setCartProduct(LinkedList<Product> cartProduct) {
		this.cartProduct = cartProduct;
	}

	@Override
	public String toString() {
		return "Cart [cartProduct=" + cartProduct + "]";
	}

}
