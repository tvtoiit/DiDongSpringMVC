package ProjectSmartphoneMVC.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Dto.CartDto;
import ProjectSmartphoneMVC.Entity.products;

@Repository
public class CartDao extends BaseDao{
	@Autowired
	ProductsDao productsDao = new ProductsDao();
	
	public HashMap<String, CartDto> addCart(String id, HashMap<String, CartDto> cart) {
		products product = productsDao.FindProductsByID(id);
		CartDto itemCart = new CartDto();
		if(product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty()+1);
			double totalPice = (itemCart.getProduct().getPrice()-itemCart.getProduct().getPrice()*itemCart.getProduct().getDiscount()/100)*itemCart.getQuanty();
			itemCart.setTotalPice(totalPice);
		}else if(product != null){
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			double totalPice = (product.getPrice()-product.getPrice()*product.getDiscount()/100);
			itemCart.setTotalPice(totalPice);
		}
		cart.put(id, itemCart);
		return cart;
	}
	
	public HashMap<String, CartDto> editCart(String id, int quanty, HashMap<String, CartDto> cart) {
		if(cart == null) {
			return cart;
		}
		CartDto itemCart = new CartDto();
		//kiểm tra sản phẩm có tồn tại.
		if(cart.containsKey(id)) {
			//trả về 1 sản phẩm tương ứng.
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double totalPice = (itemCart.getProduct().getPrice()-itemCart.getProduct().getPrice()*itemCart.getProduct().getDiscount()/100)*quanty;
			itemCart.setTotalPice(totalPice);
		}
		cart.put(id, itemCart);
		return cart;
	}
	
	public HashMap<String, CartDto> deleteCart(String id, HashMap<String, CartDto> cart) {
		if(cart == null) {
			return cart;
		}
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	
	public int totalQuanty( HashMap<String, CartDto> cart) {
		int totalQuanty = 0;
		for(Map.Entry<String, CartDto> itemCart : cart.entrySet()) {
			totalQuanty +=itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}
	
	public double totalPrice( HashMap<String, CartDto> cart) {
		double totalPrice = 0;
		for(Map.Entry<String, CartDto> itemCart : cart.entrySet()) {
			totalPrice +=itemCart.getValue().getTotalPice();
		}
		return totalPrice;
	}
}
