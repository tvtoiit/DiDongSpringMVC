package ProjectSmartphoneMVC.Controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ProjectSmartphoneMVC.Dto.CartDto;
import ProjectSmartphoneMVC.Entity.Order;

@Controller
public class OrderController extends BaseController{
	@RequestMapping(value = {"/order"}, method = RequestMethod.POST)
	public String order(HttpSession session, @ModelAttribute("order") Order order) {
		HashMap<String, CartDto> cart = (HashMap<String, CartDto>)session.getAttribute("cart");
		if(session.getAttribute("idUser") == null) {
			return "redirect:/authen/login";
		}
		String idUser = session.getAttribute("idUser").toString();
		if(cart == null) {
			return "redirect:/trang-chu/";
		}
		String maHD = "HD_";
		maHD += RandomStringUtils.randomAlphanumeric(7);
		order.setMaHD(maHD);
		order.setUser_id(Integer.parseInt(idUser));
		order.setStatus("1");
		int count=0;
		for(Map.Entry<String, CartDto> itemCart : cart.entrySet()) {
			String idProduct =String.valueOf(itemCart.getValue().getProduct().getId());
			order.setProduct(idProduct);
			order.setNum(itemCart.getValue().getQuanty());
			order.setMoney(itemCart.getValue().getTotalPice());
			count = _homeService.insertOrder(order, maHD);
		}
		if(count > 0) {
			session.removeAttribute("cart");
		}
		return "redirect:/";
	}
}
