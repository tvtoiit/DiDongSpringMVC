package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InfomationProduct implements RowMapper<chitietsp> {

	@Override
	public chitietsp mapRow(ResultSet rs, int rowNum) throws SQLException {
		chitietsp InfomationProduct = new chitietsp();
		InfomationProduct.setThuonghieu(rs.getString("thuonghieu"));
		return InfomationProduct;
	}
	
	
}
