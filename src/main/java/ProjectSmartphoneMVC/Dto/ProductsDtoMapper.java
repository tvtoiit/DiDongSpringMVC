package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsDtoMapper implements RowMapper<chitietsp>{

	@Override
	public chitietsp mapRow(ResultSet rs, int rowNum) throws SQLException {
		chitietsp chitietsp = new chitietsp();
		
		chitietsp.setId(rs.getInt("id"));
		chitietsp.setProduct_type(rs.getInt("product_type"));
		chitietsp.setTitle(rs.getString("title"));
		chitietsp.setPrice(rs.getDouble("price"));
		chitietsp.setDiscount(rs.getInt("discount"));
		chitietsp.setNum(rs.getInt("num"));
		chitietsp.setThumnail(rs.getString("thumnail"));
		chitietsp.setDescription(rs.getString("description"));
		chitietsp.setDescription2(rs.getString("description2"));
		chitietsp.setCreated_at(rs.getDate("created_at"));
		
		
		return chitietsp;
	}
	
}
