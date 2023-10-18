package ProjectSmartphoneMVC.Service.user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjectSmartphoneMVC.Dto.CartDto;

@Service
public interface ICartService {
	@Autowired
	public HashMap<String, CartDto> addCart(String id, HashMap<String, CartDto> cart);
	@Autowired
	public HashMap<String, CartDto> editCart(String id, int quanty, HashMap<String, CartDto> cart);
	@Autowired
	public HashMap<String, CartDto> deleteCart(String id, HashMap<String, CartDto> cart);
	@Autowired
	public int totalQuanty( HashMap<String, CartDto> cart);
	@Autowired
	public double totalPrice( HashMap<String, CartDto> cart);
}
