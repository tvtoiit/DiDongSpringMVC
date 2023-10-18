package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Dto.Discount_TextDtoMapper;
import ProjectSmartphoneMVC.Dto.InfomationProduct;
import ProjectSmartphoneMVC.Dto.MapperProductManage;
import ProjectSmartphoneMVC.Dto.MapperThongTinChung;
import ProjectSmartphoneMVC.Dto.MapperTienIch;
import ProjectSmartphoneMVC.Dto.ProductManageDto;
import ProjectSmartphoneMVC.Dto.ProductsDtoMapper;
import ProjectSmartphoneMVC.Dto.chitietsp;
import ProjectSmartphoneMVC.Dto.configurationMapper;
import ProjectSmartphoneMVC.Entity.MapperProduct;
import ProjectSmartphoneMVC.Entity.products;

@Repository
public class ProductsDao extends BaseDao{
	@Autowired
	Product_typeDao product_typeDao = new Product_typeDao();
	public List<products> getDataProducts(){
		List<products> list = new ArrayList<products>();
		String sql = "SELECT * FROM product ORDER BY created_at DESC";
		list = _jdbcTemplate.query(sql, new MapperProduct());
		return list;
	}
	
	public List<products> getDataProductsDetail(String id){
		List<products> list = new ArrayList<products>();
		String sql = "SELECT * FROM product Where id="+id;
		list = _jdbcTemplate.query(sql, new MapperProduct());
		return list;
	}
	public products FindProductsByID(String id){
		String sql = "SELECT * FROM product Where id="+id;
		products product  = _jdbcTemplate.queryForObject(sql, new MapperProduct());
		return product;
	}
	public List<ProductManageDto> getDataProductSeeMore(String id){
		List<ProductManageDto> list = new ArrayList<ProductManageDto>();
		String sql = "SELECT p.*,pType.name FROM product p INNER JOIN product_type pType ON p.product_type = pType.id Where product_type ='"+id+"' ORDER BY p.created_at DESC ";
		list = _jdbcTemplate.query(sql, new MapperProductManage());
		return list;
	}
	public List<chitietsp> getDataProduct(String id){
		List<chitietsp> list = new ArrayList<chitietsp>();
		String sql = "select * from product WHERE id = "+ id;
		list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}
	
	public List<products> getDataProductType(String id){
		List<products> list = new ArrayList<products>();
		String sql = "SELECT * FROM product WHERE product_type ="+id;
		
		list = _jdbcTemplate.query(sql, new MapperProduct());
		return list;
	} 
	
	public List<chitietsp> getDataDiscountText(String id){
		List<chitietsp> list = new ArrayList<chitietsp>();
		String sql = "select * from discount where product_id = "+ id;
		list = _jdbcTemplate.query(sql, new Discount_TextDtoMapper());
		return list;
	}
	
	public List<chitietsp> getDataConfiguration(String id){
		List<chitietsp> list = new ArrayList<chitietsp>();
		String sql = "select * from configuration where product_id = "+ id;
		list = _jdbcTemplate.query(sql, new configurationMapper());
		return list;
	}
	
	public List<chitietsp> GetDatainfomationProduct(String id){
		List<chitietsp> list = new ArrayList<chitietsp>();
		String sql = "SELECT * FROM thongtinsp WHERE product_id ="+id;
		list = _jdbcTemplate.query(sql, new InfomationProduct());
		return list;
	}
	
	public List<chitietsp> GetDataThongTinChung(String id){
		List<chitietsp> list = new ArrayList<chitietsp>();
		String sql = "SELECT * FROM thongtinchung WHERE product_id ="+id;
		list = _jdbcTemplate.query(sql, new MapperThongTinChung());
		return list;
	}
	
	public List<chitietsp> GetDataTienIch(String id){
		List<chitietsp> list = new ArrayList<chitietsp>();
		String sql = "SELECT * FROM tienich WHERE product_id ="+id;
		list = _jdbcTemplate.query(sql, new MapperTienIch());
		return list;
	}
	
	public List<products> FindProduct(String name){
		List<products> list = new ArrayList<products>();
		String sql = "SELECT * FROM product WHERE title LIKE '%"+name+"%' or price like '%"+name+"%'";
		list = _jdbcTemplate.query(sql, new MapperProduct());
		return list;
	}
	
	public products FindDataProductType(long id){
		String sql = "SELECT * FROM product WHERE product_type ="+id;
		products product = _jdbcTemplate.queryForObject(sql, new MapperProduct());
		return product;
	} 
	
	
	
	//lấy sản phẩm theo loại với số lượng trên 1 page.
	public List<products> getDataProductPaginate(String id, int start, int limit){
		List<products> list = new ArrayList<products>();
		String sql = "SELECT * FROM product WHERE product_type ="+id+" limit "+start+","+limit;
		list = _jdbcTemplate.query(sql, new MapperProduct());
		return list;
	}
	
}
