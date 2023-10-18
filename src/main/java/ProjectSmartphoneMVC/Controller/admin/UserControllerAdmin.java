package ProjectSmartphoneMVC.Controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Entity.Users;

@Controller
public class UserControllerAdmin extends BaseControllerAdmin{
	@RequestMapping(value = {"/admin/user"} , method = RequestMethod.GET)
	public ModelAndView viewUser() {
		_mvShase.setViewName("admin/manageUser");
		_mvShase.addObject("users", _homeService.getDataUsers());
		return _mvShase;
	}
	@RequestMapping(value = {"/admin/user/editor"} , method = RequestMethod.GET)
	public ModelAndView editorUser(@RequestParam String id) {
		_mvShase.setViewName("admin/editorUser");
		_mvShase.addObject("userView",_homeService.getDataUsers(id));
		_mvShase.addObject("status", null);
		_mvShase.addObject("user",new Users());
		return _mvShase;
	}
	
	@RequestMapping(value = {"/admin/user/editor"} , method = RequestMethod.POST)
	public ModelAndView UpdateUser(@ModelAttribute("user") Users users, 
			@RequestParam("role_id") int role_id) {
		users.setRole_id(role_id);
		int count = _homeService.UpdateUser(users);
		String id = String.valueOf(users.getId());
		if(count>0) {
			_mvShase.addObject("userView",_homeService.getDataUsers(id));
			_mvShase.addObject("status", "Sửa người dùng thành công");
			_mvShase.addObject("user",new Users());
		}
		else {
			_mvShase.addObject("userView",_homeService.getDataUsers(id));
			_mvShase.addObject("status", "Sửa người dùng thất bại");
			_mvShase.addObject("user",new Users());
		}
		_mvShase.setViewName("admin/editorUser");
		return _mvShase;
	}
	
}
