package ProjectSmartphoneMVC.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeControllerAdmin extends BaseControllerAdmin{

	@RequestMapping(value = {"/admin/"} , method = RequestMethod.GET)
	public ModelAndView Index() {
		_mvShase.setViewName("admin/index");
		return _mvShase;
	}
}

