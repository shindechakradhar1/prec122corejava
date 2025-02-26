package in.prec.cartservicesminiproject.repos;

import in.prec.cartservicesminiproject.entitities.ElectronicProduct;
import in.prec.cartservicesminiproject.entitities.Product;

public class ProductRepoImpl implements ProductRepo{

	@Override
	public String add(Product product, ElectronicProduct eProduct) {
		product.getProductList().add(eProduct);
		return "Product Added successfully..";
		
	}

	@Override
	public String delete(Product product, int index) {
		product.getProductList().remove(index-1);
		return "Product deleted successfully..";
	}

	@Override
	public String update(Product product, ElectronicProduct eProduct, int index) {
		product.getProductList().set(index-1, eProduct);
		return "Product updated Successfully..";
		 
	}

}
