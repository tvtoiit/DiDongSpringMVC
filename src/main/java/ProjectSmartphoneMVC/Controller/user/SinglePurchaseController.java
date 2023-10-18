package ProjectSmartphoneMVC.Controller.user;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Dto.ProductsOrdersManageDto;

@Controller
public class SinglePurchaseController extends BaseController{
	@RequestMapping(value = "/donmua" , method = RequestMethod.GET)
	public ModelAndView viewOrder(HttpSession session) {
		if(session.getAttribute("idUser") == null) {
			_mvShase.setViewName("redirect:/trang-chu");
		}else {
			String idUser = session.getAttribute("idUser").toString(); 
			List<ProductsOrdersManageDto> list = _homeService.getOderByUser(idUser);
			if(list.size()>0) {
				_mvShase.addObject("userName", list.get(0).getUser_name());
			}
			else {
				_mvShase.addObject("userName", null);
			}
			_mvShase.addObject("donmua", _homeService.getOderByUser(idUser));
			_mvShase.setViewName("user/singlepurchase");
		}
		return _mvShase;
	}
}
