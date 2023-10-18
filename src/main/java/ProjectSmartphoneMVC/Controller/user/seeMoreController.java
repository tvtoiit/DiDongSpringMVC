package ProjectSmartphoneMVC.Controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ProjectSmartphoneMVC.Dto.PaginatesDto;
import ProjectSmartphoneMVC.Dto.ProductManageDto;
import ProjectSmartphoneMVC.Entity.products;
import ProjectSmartphoneMVC.Service.user.PaginateServiceImplement;

@Controller
public class seeMoreController extends BaseController{
	@Autowired
	private PaginateServiceImplement paginateService;
	
	@RequestMapping(value = "/product/seemore" , method = RequestMethod.GET)
	public ModelAndView ProductSeeMore(@RequestParam("id") String id, @RequestParam("page")String page) {
		List<products> listProduct = _homeService.getDataProductType(id);
		if(listProduct.size() < 1) {
			String url = "redirect:/trang-chu/";
			_mvShase.setViewName(url);
			return _mvShase;
		}
		List<ProductManageDto> list = _homeService.getDataProductSeeMore(id);
		int limit = 3; // số lượng sản phẩm trên 1 trang..
		PaginatesDto listpaginate = paginateService.GetInfoPaginates(listProduct.size(), limit, Integer.parseInt(page));
		_mvShase.addObject("productPage", _homeService.getDataProductPaginate(id, listpaginate.getStart(), limit));
		_mvShase.setViewName("user/seeMore");
		_mvShase.addObject("nameType", list.get(0).getName());
		_mvShase.addObject("productpaginate", listpaginate);
		_mvShase.addObject("idCategory", id);
		_mvShase.addObject("getPage", page);
		int page1 = Integer.parseInt(page);
		int prev_page = page1 -1;
		int next_page = page1+1;
		_mvShase.addObject("prev_page", prev_page);
		_mvShase.addObject("next_page", next_page);
		
		return _mvShase;
	}
}
