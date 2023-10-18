package ProjectSmartphoneMVC.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class searchController extends BaseController {

	@RequestMapping(value = {"/search"} , method = RequestMethod.POST)
	public ModelAndView ProductDetails(@RequestParam("searchInput") String search) {
		_mvShase.addObject("search", _homeService.FindProduct(search));
		_mvShase.addObject("nameseach", search);
		_mvShase.setViewName("user/search");
		return _mvShase;
	}
	
}
