package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Entity.MapperProduct_type;
import ProjectSmartphoneMVC.Entity.product_type;

@Repository
public class Product_typeDao extends BaseDao{
	
	public List<product_type> getDataProduct_type(){
		List<product_type> list = new ArrayList<product_type>();
		String sql = "SELECT pType.* FROM product_type pType INNER JOIN product p ON pType.id = p.product_type GROUP BY id";
		list = _jdbcTemplate.query(sql, new MapperProduct_type());
		return list;
	}
}
