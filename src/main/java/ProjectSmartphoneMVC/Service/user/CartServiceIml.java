package ProjectSmartphoneMVC.Service.user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjectSmartphoneMVC.Dao.CartDao;
import ProjectSmartphoneMVC.Dto.CartDto;

@Service
public class CartServiceIml implements ICartService{
	@Autowired
	private CartDao cartDao = new CartDao();
	
	@Override
	public HashMap<String, CartDto> addCart(String id, HashMap<String, CartDto> cart) {
		return cartDao.addCart(id, cart);
	}

	@Override
	public HashMap<String, CartDto> editCart(String id, int quanty, HashMap<String, CartDto> cart) {
		return cartDao.editCart(id, quanty, cart);
	}

	@Override
	public HashMap<String, CartDto> deleteCart(String id, HashMap<String, CartDto> cart) {
		return cartDao.deleteCart(id, cart);
	}

	@Override
	public int totalQuanty(HashMap<String, CartDto> cart) {
		return cartDao.totalQuanty(cart);
	}

	@Override
	public double totalPrice(HashMap<String, CartDto> cart) {
		return cartDao.totalPrice(cart);
	}

}
