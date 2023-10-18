package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperThongTinChung implements RowMapper<chitietsp> {

	@Override
	public chitietsp mapRow(ResultSet rs, int rowNum) throws SQLException {
		chitietsp thongtinchung = new chitietsp();
		thongtinchung.setThoidiemramat(rs.getString("thoidiemramat"));
		return thongtinchung;
	}

}
