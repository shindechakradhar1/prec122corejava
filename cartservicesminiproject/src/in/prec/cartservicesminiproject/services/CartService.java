package in.prec.cartservicesminiproject.services;

import in.prec.cartservicesminiproject.entitities.Cart;
import in.prec.cartservicesminiproject.entitities.Product;
import in.prec.cartservicesminiproject.exceptions.InvalidIndexException;

public interface CartService {
	String add(Cart cart, Product product, int index) throws InvalidIndexException;
	String delete(Cart cart, int index);
	float calculateTotalSum(Cart cart);
}
