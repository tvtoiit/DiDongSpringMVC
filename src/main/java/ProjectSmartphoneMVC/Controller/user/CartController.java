package ProjectSmartphoneMVC.Controller.user;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Dto.CartDto;
import ProjectSmartphoneMVC.Entity.Order;
import ProjectSmartphoneMVC.Service.user.CartServiceIml;

@Controller
public class CartController extends BaseController{
	
	@Autowired
	private CartServiceIml cartService = new CartServiceIml();
	
	@RequestMapping(value = {"gio-hang"})
	public ModelAndView Index() {
		_mvShase.addObject("order", new Order());
		_mvShase.setViewName("user/cart");
		_mvShase.addObject("product_type", _homeService.getDataProduct_type());
		_mvShase.addObject("product", _homeService.getDataProducts());
		return _mvShase;
	}
	
	@RequestMapping(value = {"/cart/"})
	public String Cart(HttpServletRequest request,HttpSession session, @PathVariable String id) {
		
		return "redirect:"+request.getHeader("Refere");
	}
	
	@RequestMapping(value = {"/addCart/{id}/{sale}"})
	public String AddCart(HttpServletRequest request,HttpSession session, @PathVariable String id, @PathVariable String sale) {
		HashMap<String, CartDto> cart = (HashMap<String, CartDto>)session.getAttribute("cart");
		if(cart == null) {
			cart = new HashMap<String, CartDto>();
		}
		cart = cartService.addCart(id, cart);
		session.setAttribute("cart", cart);
		session.setAttribute("totalQuantyCart", cartService.totalQuanty(cart));
		session.setAttribute("totalpriceCart", cartService.totalPrice(cart));
		//chuyển về trang hiện tại đã click
//		return "redirect:"+request.getHeader("Refere");
		return "redirect:/product?id="+id+"&sale="+sale;
	}
	
	@RequestMapping(value = {"editCart/{id}/{quanty}"})
	public String editCart(HttpSession session,@PathVariable String id, @PathVariable int quanty) {
		HashMap<String, CartDto> cart = (HashMap<String, CartDto>)session.getAttribute("cart");
		if(cart == null) {
			cart = new HashMap<String, CartDto>();
		}
		
		cart = cartService.editCart(id, quanty, cart);
		session.setAttribute("cart", cart);
		session.setAttribute("totalQuantyCart", cartService.totalQuanty(cart));
		session.setAttribute("totalpriceCart", cartService.totalPrice(cart));
		
		return "redirect:/gio-hang/";
	}
	
	@RequestMapping(value = {"deleteCart/{id}"})
	public String deleteCart(HttpSession session,@PathVariable String id) {
		HashMap<String, CartDto> cart = (HashMap<String, CartDto>)session.getAttribute("cart");
		if(cart == null) {
			cart = new HashMap<String, CartDto>();
		}
		cart = cartService.deleteCart(id, cart);
		if(cart.size() > 0) {
			session.setAttribute("cart", cart);
			session.setAttribute("totalQuantyCart", cartService.totalQuanty(cart));
			session.setAttribute("totalpriceCart", cartService.totalPrice(cart));
		}
		return "redirect:/gio-hang/";
	}
	
}
