package ProjectSmartphoneMVC.Controller.user;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Service.admin.HomeServiceImplAdmin;
import ProjectSmartphoneMVC.Service.user.HomeServiceImpl;

@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	@Autowired
	HomeServiceImplAdmin _homeServiceAdmin;
	public ModelAndView _mvShase = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		_mvShase.addObject("nameseach", null);
		return _mvShase;
	}
	
}
