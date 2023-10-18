package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUserManage implements RowMapper<UsersManageDto>{

	@Override
	public UsersManageDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsersManageDto usersManageDto = new UsersManageDto();
		usersManageDto.setId(rs.getInt("id"));
		usersManageDto.setFullname(rs.getString("fullname"));
		usersManageDto.setEmail(rs.getString("email"));
		usersManageDto.setPhone_number(rs.getString("phone_number"));
		usersManageDto.setAddress(rs.getString("address"));
		usersManageDto.setUserName(rs.getString("userName"));
		usersManageDto.setPassword(rs.getString("password"));
		usersManageDto.setRole_id(rs.getInt("role_id"));
		usersManageDto.setRole_name(rs.getString("role_name"));
		usersManageDto.setCreated_at(rs.getDate("created_at"));
		return usersManageDto;
	}

}
