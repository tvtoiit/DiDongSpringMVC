package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Discount_TextDtoMapper implements RowMapper<chitietsp> {

	@Override
	public chitietsp mapRow(ResultSet rs, int rowNum) throws SQLException {
		chitietsp discountchitiet = new chitietsp();
		discountchitiet.setDiscount_text(rs.getString("discount_text"));
		return discountchitiet;
	}
	
}
