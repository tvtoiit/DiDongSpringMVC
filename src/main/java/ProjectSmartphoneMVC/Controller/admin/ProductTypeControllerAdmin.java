package ProjectSmartphoneMVC.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Entity.product_type;

@Controller
public class ProductTypeControllerAdmin extends BaseControllerAdmin{
	@RequestMapping(value = {"/admin/product_type"} , method = RequestMethod.GET)
	public ModelAndView productType() {
		_mvShase.setViewName("admin/manageProductType");
		_mvShase.addObject("productTypeManage", _homeService.getDataProduct_type());
		return _mvShase;
	}
	
	@RequestMapping(value = {"/admin/product_type/editor"}, method = RequestMethod.GET)
	public ModelAndView addProductType() {
		_mvShase.setViewName("admin/editorProductType");
		_mvShase.addObject("product_type", new product_type());
		return _mvShase;
	}
	@RequestMapping(value = {"/admin/product_type/editor"}, method = RequestMethod.POST)
	public ModelAndView CreateProductType(@ModelAttribute("product_type") product_type productType) {
		int count = _homeService.addProductType(productType);
		if(count >0) {
			_mvShase.addObject("status", "Thêm Sản Phẩm Thành Công!!");
			_mvShase.setViewName("admin/editorProductType");
		}else {
			_mvShase.addObject("status", "Thêm Sản Phẩm Thất Bại!!");
			_mvShase.setViewName("admin/editorProductType");
		}
		return _mvShase;
	}
}
