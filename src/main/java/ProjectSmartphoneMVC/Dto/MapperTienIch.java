package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperTienIch implements RowMapper<chitietsp> {

	@Override
	public chitietsp mapRow(ResultSet rs, int rowNum) throws SQLException {
		chitietsp tienich = new chitietsp();
		tienich.setBaomatcao(rs.getString("baomatnangcao"));
		tienich.setGhiam(rs.getString("ghiam"));
		return tienich;
	}

}
