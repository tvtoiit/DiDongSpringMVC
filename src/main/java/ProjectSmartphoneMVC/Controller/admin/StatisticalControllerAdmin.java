package ProjectSmartphoneMVC.Controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Dto.StatisticalDto;

@Controller
public class StatisticalControllerAdmin extends BaseControllerAdmin{
	@RequestMapping(value = {"/admin/statistical"} , method = RequestMethod.GET)
	public ModelAndView viewStatistical(ModelMap mm) {
		_mvShase.setViewName("admin/manageStatistical");
		List<StatisticalDto> list = _homeService.getDataStatisticalByNow();
		mm.put("chartNow", list);
		return _mvShase;
	}
}
