package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Entity.MapperProductsSale;
import ProjectSmartphoneMVC.Entity.productsSale;

@Repository
public class ProductsSaleManageDao extends BaseDao{
	
	public List<productsSale> getDataProductSale(){
		List<productsSale> list = new ArrayList<productsSale>();
		String sqlString = "SELECT * FROM discount_sale WHERE status_sale = 1 OR DATEDIFF(NOW(),time_salestop) <= 0";
		list = _jdbcTemplate.query(sqlString, new MapperProductsSale());
		return list;
	}
	
	public int insertProductSale(productsSale productSale) {
		String sql = "INSERT INTO discount_sale(id_product_sale, discount_product_sale, number_sale, num_buy, status_sale, time_sale, time_salestop) "
				+ "VALUES ('"+productSale.getId_product_sale()+"','"+productSale.getDiscount_product_sale()+"','"+productSale.getNumber_sale()+"',"
						+ "'"+productSale.getNum_buy()+"','"+productSale.getStatus_sale()+"','"+productSale.getTime_sale()+"','"+productSale.getTime_salestop()+"')";
		int count = _jdbcTemplate.update(sql);
		return count;
	}
}
