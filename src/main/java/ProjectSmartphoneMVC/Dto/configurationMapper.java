package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class configurationMapper implements RowMapper<chitietsp> {

	@Override
	public chitietsp mapRow(ResultSet rs, int rowNum) throws SQLException {
		chitietsp configuration = new chitietsp();
		configuration.setScreen(rs.getString("screen"));
		configuration.setOperating_system(rs.getString("operating_system"));
		configuration.setFront_camera(rs.getString("front_camera"));
		configuration.setRear_camera(rs.getString("rear_camera"));
		configuration.setChip(rs.getString("chip"));
		configuration.setRam(rs.getString("ram"));
		configuration.setSim(rs.getString("sim"));
		configuration.setPin(rs.getString("pin"));
		return configuration;
	}
	
}
