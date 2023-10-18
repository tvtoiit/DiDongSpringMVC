package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Dto.MapperProductManage;
import ProjectSmartphoneMVC.Dto.ProductManageDto;
import ProjectSmartphoneMVC.Entity.products;
import ProjectSmartphoneMVC.Entity.product_type;

@Repository
public class ProductsManageDao extends BaseDao{
	
	public List<ProductManageDto> getDataManageDtos(){
		List<ProductManageDto> list = new ArrayList<ProductManageDto>();
		String sql = "SELECT p.*,pType.name FROM product p INNER JOIN product_type pType ON p.product_type = pType.id ORDER BY p.created_at DESC";
		list = _jdbcTemplate.query(sql, new MapperProductManage());
		return list;
	}
	public List<ProductManageDto> getDataManageDtos(String idProduct){
		List<ProductManageDto> list = new ArrayList<ProductManageDto>();
		String sql = "SELECT p.*,pType.name FROM product p INNER JOIN product_type pType ON p.product_type = pType.id WHERE p.id="+idProduct;
		list = _jdbcTemplate.query(sql, new MapperProductManage());
		return list;
	}
	
	public int addProduct(products product) {
		
		String sql = "INSERT INTO product(product_type, title, price, discount, num, thumnail, description)"
				+ " VALUES ('"+product.getProduct_type()+"','"+product.getTitle()+"','"+product.getPrice()+"','"+product.getDiscount()+"','"+product.getNum()+"','"+product.getThumnail()+"','"+product.getDescription()+"')";
		
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}
	public int Update(products product) {
			
		String sql = "UPDATE product SET product_type='"+product.getProduct_type()+"', title='"+product.getTitle()+"', "
				+ "price='"+product.getPrice()+"', discount='"+product.getDiscount()+"', num='"+product.getPrice()+"', thumnail='"+product.getThumnail()+"', description='"+product.getDescription()+"'"
				+ " WHERE id ="+product.getId();
		
		int update = _jdbcTemplate.update(sql);
		return update;
	}
	
	public int addProductType(product_type product_type) {
		
		String sql = "INSERT INTO product_type(name)"
				+ " VALUES ('"+product_type.getName()+"')";
		
		int insert = _jdbcTemplate.update(sql);
		return insert;
	}
}

