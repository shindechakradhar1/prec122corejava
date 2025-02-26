package in.prec.cartservicesminiproject.services;

import in.prec.cartservicesminiproject.entitities.Cart;
import in.prec.cartservicesminiproject.entitities.ElectronicProduct;
import in.prec.cartservicesminiproject.entitities.Product;
import in.prec.cartservicesminiproject.exceptions.InvalidIndexException;
import in.prec.cartservicesminiproject.repos.ServiceRepo;
import in.prec.cartservicesminiproject.repos.ServiceRepoImpl;

public class CartServiceImpl implements CartService{

	private ServiceRepo repo = new ServiceRepoImpl();
	
	@Override
	public String add(Cart cart, Product product, int index) throws InvalidIndexException{
//		if(index>0 && index<=product.getProductList().size())
//			return repo.add(cart, product.getProductList().get(index-1));
//		else
//			return "Invalid Sr.no Entered By User";
		String msg;
		try {
			ElectronicProduct eProduct=product.getProductList().get(index-1);
			msg=repo.add(cart, eProduct);
		}catch(IndexOutOfBoundsException e) {
			msg = "Something went Wrong";
			throw(new InvalidIndexException("Invalid Sr.no", e));
		}
		return msg;
	}

	@Override
	public String delete(Cart cart, int index) {
		if(index>0 && index<=cart.getCartProduct().size())
			return repo.delete(cart, index);
		else
			return "Invalid Sr.no";
	}

}
