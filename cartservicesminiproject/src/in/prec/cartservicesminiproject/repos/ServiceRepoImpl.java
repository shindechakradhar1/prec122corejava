package in.prec.cartservicesminiproject.repos;

import in.prec.cartservicesminiproject.entitities.Cart;
import in.prec.cartservicesminiproject.entitities.ElectronicProduct;

public class ServiceRepoImpl implements ServiceRepo{

	@Override
	public String add(Cart cart, ElectronicProduct eProduct) {
		cart.getCartProduct().add(eProduct);
		return "Product Added to cart successfully..";
	}

	@Override
	public String delete(Cart cart, int index) {
		cart.getCartProduct().remove(index-1);
		return "Product deleted from cart successfully...";
	}

}
