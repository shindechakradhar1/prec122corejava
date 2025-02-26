package in.prec.cartservicesminiproject.services;

import in.prec.cartservicesminiproject.entitities.ElectronicProduct;
import in.prec.cartservicesminiproject.entitities.Product;
import in.prec.cartservicesminiproject.repos.ProductRepo;
import in.prec.cartservicesminiproject.repos.ProductRepoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductRepo repo = new ProductRepoImpl();
	@Override
	public String add(Product product, ElectronicProduct eProduct) {
		String msg;
		if (validateEproduct(eProduct)) {
			msg = repo.add(product, eProduct);
		} else {
			msg = "Invalid input from User";
		}

		return msg;
	}

	@Override
	public String update(Product product, ElectronicProduct eproduct, int index) {
		String msg;
		if (index > 0 && index <= product.getProductList().size()) {
			if (validateEproduct(eproduct)) {
				msg=repo.update(product, eproduct, index);
			} else {
				msg = "Invalid Input from user";
			}
		}else {
			msg = "Invalid Sr.no Entered By user";
		}
		return msg;
	}

	@Override
	public String delete(Product product, int index) {
		String msg;
		if (index > 0 && index <= product.getProductList().size()) {
			msg=repo.delete(product, index);
		}else
			msg="Invalid Sr.no Entered By user";
		
		return msg;
	}

	private boolean validateEproduct(ElectronicProduct eProduct) {
		boolean flag;
		if (eProduct.getId() > 0 && eProduct.getName().matches("[A-Z ]+") && eProduct.getBrand().matches("[A-Z ]+")
				&& eProduct.getPrice() > 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

}
