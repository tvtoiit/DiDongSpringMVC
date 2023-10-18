package ProjectSmartphoneMVC.Controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Service.admin.HomeServiceImplAdmin;

@Controller
public class BaseControllerAdmin {
	@Autowired
	HomeServiceImplAdmin _homeService;
	
	public ModelAndView _mvShase = new ModelAndView();
}
