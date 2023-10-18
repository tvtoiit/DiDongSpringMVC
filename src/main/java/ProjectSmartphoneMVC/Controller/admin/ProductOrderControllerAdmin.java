package ProjectSmartphoneMVC.Controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Dto.ProductsOrdersManageDto;


@Controller
public class ProductOrderControllerAdmin extends BaseControllerAdmin{
	@RequestMapping(value = {"/admin/order"} , method = RequestMethod.GET)
	public ModelAndView productOrder() {
		_mvShase.addObject("ordersProduct", new ProductsOrdersManageDto());
		_mvShase.setViewName("admin/manageProductOrder");
		_mvShase.addObject("orders", _homeService.getDataOrdersManageDtos());
		_mvShase.addObject("hide", null);
		return _mvShase;
	}
	
	@RequestMapping(value = {"/admin/order/cancelOrder"} , method = RequestMethod.GET)
	public String cancelOrder(@RequestParam String id) {
		_homeService.UpdateOrder("3", id);
		String url = "redirect:/admin/order";
		return url;
	}
	@RequestMapping(value = {"/admin/order/approveOrder"} , method = RequestMethod.GET)
	public String approveOrder(@RequestParam String id) {
		_homeService.UpdateOrder("2", id);
		String url = "redirect:/admin/order";
		return url;
	}
	
	@RequestMapping(value = {"/admin/order/status"} , method = RequestMethod.GET)
	public ModelAndView productOrderStatus() {
		_mvShase.addObject("ordersProduct", new ProductsOrdersManageDto());
		_mvShase.setViewName("admin/manageProductOrder");
		_mvShase.addObject("orders", _homeService.getDataOrdersManageDtos());
		_mvShase.addObject("hide", null);
		return _mvShase;
	}
	@RequestMapping(value = {"/admin/order/status"} , method = RequestMethod.POST)
	public ModelAndView productOrderStatus(@ModelAttribute("ordersProduct") ProductsOrdersManageDto ordersManageDto ) {
		if(ordersManageDto.getName_status().equals("1")) {
			_mvShase.setViewName("admin/manageProductOrder");
			_mvShase.addObject("orders", _homeService.getDataOrdersManageDtos());
			_mvShase.addObject("hide", null);
		}else if(ordersManageDto.getName_status().equals("2")) {
			_mvShase.setViewName("admin/manageProductOrder");
			_mvShase.addObject("orders", _homeService.getDataOrdersManageDtos("1"));
			_mvShase.addObject("hide", null);
		}else if(ordersManageDto.getName_status().equals("3")) {
			_mvShase.setViewName("admin/manageProductOrder");
			_mvShase.addObject("orders", _homeService.getDataOrdersManageDtos("2"));
			_mvShase.addObject("hide", "1");
		}else if(ordersManageDto.getName_status().equals("4")) {
			_mvShase.addObject("hide", "1");
			_mvShase.setViewName("admin/manageProductOrder");
			_mvShase.addObject("orders", _homeService.getDataOrdersManageDtos("3"));
		}
		return _mvShase;
	}
	
}
