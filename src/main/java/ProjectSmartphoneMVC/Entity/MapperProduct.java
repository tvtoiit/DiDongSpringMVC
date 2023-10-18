//class này có nhiệm vụ là hứng dữ liệu từ database
package ProjectSmartphoneMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProduct implements RowMapper<products>{

	@Override
	public products mapRow(ResultSet rs, int rowNum) throws SQLException {
		products product = new products();
		product.setId(rs.getInt("id"));
		product.setProduct_type(rs.getInt("product_type"));
		product.setTitle(rs.getString("title"));
		product.setPrice(rs.getDouble("price"));
		product.setDiscount(rs.getInt("discount"));
		product.setNum(rs.getInt("num"));
		product.setThumnail(rs.getString("thumnail"));
		product.setDescription(rs.getString("description"));
		product.setDescription2(rs.getString("description2"));
		product.setCreated_at(rs.getDate("created_at"));
		
		
		return product;
	}
	
}
