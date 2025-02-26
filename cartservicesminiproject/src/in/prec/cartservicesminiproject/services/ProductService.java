package in.prec.cartservicesminiproject.services;

import in.prec.cartservicesminiproject.entitities.ElectronicProduct;
import in.prec.cartservicesminiproject.entitities.Product;

public interface ProductService {
	String add(Product product, ElectronicProduct eproduct);
	String update(Product product, ElectronicProduct eproduct, int index);
	String delete(Product product,int index);
}
