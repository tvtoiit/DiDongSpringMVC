package ProjectSmartphoneMVC.Entity;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProductsSale implements RowMapper<productsSale>{

	@Override
	public productsSale mapRow(ResultSet rs, int rowNum) throws SQLException {
		productsSale productsSale = new productsSale();
		productsSale.setId(rs.getInt("id"));
		productsSale.setId_product_sale(rs.getInt("id_product_sale"));      
		productsSale.setDiscount_product_sale(rs.getInt("discount_product_sale"));
		productsSale.setNumber_sale(rs.getInt("number_sale"));          
		productsSale.setNum_buy(rs.getInt("num_buy"));              
		productsSale.setStatus_sale(rs.getInt("status_sale"));          
		productsSale.setTime_sale(rs.getString("time_sale"));   
		productsSale.setTime_salestop(rs.getString("time_salestop"));
		return productsSale;
	}

}
