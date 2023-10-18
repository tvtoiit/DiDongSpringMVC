package ProjectSmartphoneMVC.Controller.user;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/","/trang-chu/"} , method = RequestMethod.GET)
	public ModelAndView Index() {
		_mvShase.setViewName("user/index");
		_mvShase.addObject("product_type", _homeService.getDataProduct_type());
		_mvShase.addObject("product", _homeService.getDataProducts());
		return _mvShase;
	}
	
}
