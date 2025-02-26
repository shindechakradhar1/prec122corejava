package in.prec.cartservicesminiproject.repos;

import in.prec.cartservicesminiproject.entitities.ElectronicProduct;
import in.prec.cartservicesminiproject.entitities.Product;

public interface ProductRepo {
	String add(Product product, ElectronicProduct eProduct);
	String delete(Product product, int index);
	String update(Product product, ElectronicProduct eProduct, int index);
}
