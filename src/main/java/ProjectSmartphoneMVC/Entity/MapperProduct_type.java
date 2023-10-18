package ProjectSmartphoneMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProduct_type implements RowMapper<product_type>{

	@Override
	public product_type mapRow(ResultSet rs, int rowNum) throws SQLException {
		product_type product_type = new product_type();
		product_type.setId(rs.getInt("id"));
		product_type.setName(rs.getString("name"));
		return product_type;
	}
}
