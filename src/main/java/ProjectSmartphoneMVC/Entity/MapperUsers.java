package ProjectSmartphoneMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUsers implements RowMapper<Users>{

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users users = new Users();
		users.setId(rs.getInt("id"));
		users.setFullname(rs.getString("fullname"));
		users.setEmail(rs.getString("email"));
		users.setPhone_number(rs.getString("phone_number"));
		users.setAddress(rs.getString("address"));
		users.setUserName(rs.getString("userName"));
		users.setPassword(rs.getString("password"));
		users.setRole_id(rs.getInt("role_id"));
		users.setCreated_at(rs.getDate("created_at"));
		return users;
	}

}
