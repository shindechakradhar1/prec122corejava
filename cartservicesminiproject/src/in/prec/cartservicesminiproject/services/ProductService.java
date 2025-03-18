package in.prec.cartservicesminiproject.services;

import in.prec.cartservicesminiproject.entitities.ElectronicProduct;
import in.prec.cartservicesminiproject.entitities.Product;
import in.prec.cartservicesminiproject.exceptions.BrandNameFormatException;
import in.prec.cartservicesminiproject.exceptions.NameFormatException;
import in.prec.cartservicesminiproject.exceptions.NegativeIdException;

public interface ProductService {
	String add(Product product, ElectronicProduct eproduct) throws NegativeIdException, NameFormatException, BrandNameFormatException;
	String update(Product product, ElectronicProduct eproduct, int index) throws NegativeIdException, NameFormatException, BrandNameFormatException;
	String delete(Product product,int index);
}
