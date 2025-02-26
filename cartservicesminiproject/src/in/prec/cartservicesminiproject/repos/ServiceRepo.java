package in.prec.cartservicesminiproject.repos;

import in.prec.cartservicesminiproject.entitities.Cart;
import in.prec.cartservicesminiproject.entitities.ElectronicProduct;

public interface ServiceRepo {
	String add(Cart cart, ElectronicProduct eProduct);
	String delete(Cart cart, int index);
}
