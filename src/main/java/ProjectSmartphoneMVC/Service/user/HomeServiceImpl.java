package ProjectSmartphoneMVC.Service.user;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ProjectSmartphoneMVC.Dao.CommentDao;
import ProjectSmartphoneMVC.Dao.Product_typeDao;
import ProjectSmartphoneMVC.Dao.ProductsDao;
import ProjectSmartphoneMVC.Dao.ProductsOrdersManageDao;
import ProjectSmartphoneMVC.Dao.UsersManageDao;
import ProjectSmartphoneMVC.Dto.CommentDto;
import ProjectSmartphoneMVC.Dto.CommentReplyDto;
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
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private ProductsDao productsDao;
	@Autowired
	private Product_typeDao product_typeDao;
	@Autowired
	private UsersManageDao usersManageDao;
	@Autowired
	private ProductsOrdersManageDao ordersManageDao;
	@Autowired
	private CommentDao commentDao;
	
	@Override
	public List<products> getDataProducts() {
		return productsDao.getDataProducts();
	}
	@Override
	public List<product_type> getDataProduct_type() {
		return product_typeDao.getDataProduct_type();
	}
	@Override
	public List<products> getDataProductsDetail(String id) {
		return productsDao.getDataProductsDetail(id);
	}
	@Override
	public List<ProductManageDto> getDataProductSeeMore(String id) {
		return productsDao.getDataProductSeeMore(id);
	}
	@Override
	public int insert(Users users) {
		return usersManageDao.insert(users);
	}
	@Override
	public List<UsersManageDto> getDataUsers(String userName, String password) {
		return usersManageDao.getDataUsers(userName, password);
	}
	@Override
	public List<chitietsp> getDataProduct(String id) {
		return productsDao.getDataProduct(id);
	}
	@Override
	public List<chitietsp> getDataDiscountText(String id) {
		return productsDao.getDataDiscountText(id);
	}
	@Override
	public List<chitietsp> getDataConfiguration(String id) {
		return productsDao.getDataConfiguration(id);
	}
	@Override
	public List<products> getDataProductType(String id) {
		return productsDao.getDataProductType(id);
	}
	@Override
	public List<products> getDataProductPaginate(String id, int start, int limit) {
		return productsDao.getDataProductPaginate(id, start, limit);
	}
	@Override
	public int insertOrder(Order order, String maHD) {
		return ordersManageDao.insert(order, maHD);
	}
	@Override
	public List<CommentDto> getAllComments(String id) {
		return commentDao.getAllComments(id);
	}
	@Override
	public List<CommentDto> getAllCommentsReply(String id, int parent_id) {
		return commentDao.getAllCommentsReply(id, parent_id);
	}
	@Override
	public HashMap<Integer, CommentReplyDto> viewCommentReply(HashMap<Integer, CommentReplyDto> commentReply,
			List<CommentDto> list, String idProduct) {
		return commentDao.viewCommentReply(commentReply, list, idProduct);
	}
	@Override
	public int insertComment(Comment comment) {
		return commentDao.insertComment(comment);
	}
	@Override
	public int deleteComment(String id) {
		return commentDao.deleteComment(id);
	}
	@Override

	public List<chitietsp> GetDatainfomationProduct(String id) {
		return productsDao.GetDatainfomationProduct(id);
	}
	@Override
	public List<products> FindProduct(String name) {
		return productsDao.FindProduct(name);
	}
	public List<ProductsOrdersManageDto> getOderByUser(String idUser) {
		return ordersManageDao.getOderByUser(idUser);
	}
	@Override
	public List<chitietsp> GetDataThongTinChung(String id) {
		return productsDao.GetDataThongTinChung(id);
	}
	@Override
	public List<chitietsp> GetDataTienIch(String id) {
		return productsDao.GetDataTienIch(id);
	}
	@Override
	public int UpdatePass(Users users) {
		return usersManageDao.UpdatePass(users);
	}
	@Override
	public List<Users> getDataByUsers(String id, String pass) {
		return usersManageDao.getDataByUsers(id, pass);
	}

	
}
