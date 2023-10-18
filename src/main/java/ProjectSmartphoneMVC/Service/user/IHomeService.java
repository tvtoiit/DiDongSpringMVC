package ProjectSmartphoneMVC.Service.user;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjectSmartphoneMVC.Dto.CommentDto;
import ProjectSmartphoneMVC.Dto.CommentReplyDto;
import ProjectSmartphoneMVC.Dto.ProductHomeDto;
import ProjectSmartphoneMVC.Dto.ProductManageDto;
import ProjectSmartphoneMVC.Dto.ProductsOrdersManageDto;
import ProjectSmartphoneMVC.Dto.UsersManageDto;
import ProjectSmartphoneMVC.Dto.chitietsp;
import ProjectSmartphoneMVC.Entity.Comment;
import ProjectSmartphoneMVC.Entity.Order;
import ProjectSmartphoneMVC.Entity.Users;
import ProjectSmartphoneMVC.Entity.product_type;
import ProjectSmartphoneMVC.Entity.products;
@Service
public interface IHomeService {
	@Autowired
	public List<products> getDataProducts();
	@Autowired
	public List<product_type> getDataProduct_type();
	@Autowired
	public List<products> getDataProductsDetail(String id);
	@Autowired
	public List<ProductManageDto> getDataProductSeeMore(String id);
	@Autowired
	public int insert(Users users);
	@Autowired
	public List<UsersManageDto> getDataUsers(String userName, String password);
	@Autowired
	public List<chitietsp> getDataProduct(String id);
	@Autowired
	public List<chitietsp> getDataDiscountText(String id);
	@Autowired
	public List<products> getDataProductType(String id);
	@Autowired
	public List<chitietsp> getDataConfiguration(String id);
	@Autowired
	public List<products> getDataProductPaginate(String id, int start, int limit);
	@Autowired
	public int insertOrder(Order order, String maHD);
	@Autowired
	public List<CommentDto> getAllComments(String id);
	@Autowired
	public List<CommentDto> getAllCommentsReply(String id, int parent_id);
	@Autowired
	public HashMap<Integer, CommentReplyDto> viewCommentReply(HashMap<Integer, CommentReplyDto> commentReply, List<CommentDto> list, String idProduct);
	@Autowired
	public int insertComment(Comment comment);
	@Autowired
	public int deleteComment(String id);
	@Autowired
	public List<chitietsp> GetDatainfomationProduct(String id);
	@Autowired
	public List<products> FindProduct(String name);
	
	@Autowired
	public List<ProductsOrdersManageDto> getOderByUser(String idUser);
	@Autowired
	public List<chitietsp> GetDataThongTinChung(String id);
	@Autowired
	public List<chitietsp> GetDataTienIch(String id);
	@Autowired
	public int UpdatePass(Users users);
	@Autowired
	public List<Users> getDataByUsers(String id, String pass);
}
