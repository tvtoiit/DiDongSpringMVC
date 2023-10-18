package ProjectSmartphoneMVC.Controller.user;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.protobuf.Value;

import ProjectSmartphoneMVC.Dto.CommentDto;
import ProjectSmartphoneMVC.Dto.CommentReplyDto;
import ProjectSmartphoneMVC.Entity.Comment;

@Controller
public class productDetailsController extends BaseController{
	@RequestMapping(value = "/product" , method = RequestMethod.GET)
	public ModelAndView ProductDetails(@RequestParam String id, @RequestParam String sale) {
		_mvShase.addObject("insertCom", new Comment());
		_mvShase.setViewName("user/productDetails");
		_mvShase.addObject("product_Details", _homeService.getDataProductsDetail(id));
		_mvShase.addObject("product_discounttext",_homeService.getDataDiscountText(id));
		_mvShase.addObject("product_configuration",_homeService.getDataConfiguration(id));
		_mvShase.addObject("InfomationProduct",_homeService.GetDatainfomationProduct(id));
		_mvShase.addObject("thongtinchung",_homeService.GetDataThongTinChung(id));
		_mvShase.addObject("tienich",_homeService.GetDataTienIch(id));
		_mvShase.addObject("comment", _homeService.getAllComments(id));
		_mvShase.addObject("sale", sale);
		List<CommentDto> list = _homeService.getAllComments(id);
		HashMap<Integer, CommentReplyDto> viewCommentReply = new HashMap<Integer, CommentReplyDto>();
		viewCommentReply = _homeService.viewCommentReply(viewCommentReply, list, id);
		_mvShase.addObject("commentReply", viewCommentReply);
		if(list.size() > 0) {
			int sumStars = 0;
			for(int i=0;i<list.size();i++) {
				sumStars +=list.get(i).getNumber_stars();
			}
			double stars = sumStars/list.size();
			_mvShase.addObject("stars", Math.round(stars*100.0)/100.0);
		}
		else {
			_mvShase.addObject("stars", 0);
		}
		return _mvShase;
	}
	
	@RequestMapping(value = "/insertComment/{id}", method = RequestMethod.POST)
	public ModelAndView insertComment(@ModelAttribute("insertCom") Comment comment, @PathVariable String id, HttpSession session) {
		if(comment.getNumber_stars() == 0) {
			comment.setNumber_stars(5);
		}
		comment.setProduct_id(Integer.parseInt(id));
		int userID =Integer.parseInt(session.getAttribute("idUser").toString());
		comment.setUser_id(userID);
		_homeService.insertComment(comment);
		_mvShase.setViewName("redirect:/product?id="+id);
		return _mvShase;
	}
	@RequestMapping(value= "/deleteComment/{idComment}/{id}", method = RequestMethod.GET)
	public ModelAndView deleteComment(@PathVariable String idComment, @PathVariable String id) {
		_homeService.deleteComment(idComment);
		_mvShase.setViewName("redirect:/product?id="+id);
		return _mvShase;
	}
}
