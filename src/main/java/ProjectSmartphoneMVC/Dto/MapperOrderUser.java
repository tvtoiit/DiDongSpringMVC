package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperOrderUser implements RowMapper<ProductsOrdersManageDto>{

	@Override
	public ProductsOrdersManageDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsOrdersManageDto ordersManage = new ProductsOrdersManageDto();
		ordersManage.setId(rs.getInt("id"));
		ordersManage.setMaHD(rs.getString("maHD"));
		ordersManage.setTitle(rs.getString("title"));
		ordersManage.setThumnail(rs.getString("thumnail"));
		ordersManage.setUser_name(rs.getString("user_name"));
		ordersManage.setGender(rs.getString("gender"));
		ordersManage.setPhone_number(rs.getString("phone_number"));
		ordersManage.setNote(rs.getString("note"));
		ordersManage.setNum(rs.getInt("num"));
		ordersManage.setMoney(rs.getDouble("money"));
		ordersManage.setCreated_at(rs.getDate("created_at"));
		ordersManage.setName_status(rs.getString("name_status"));
		return ordersManage;
	}

}
