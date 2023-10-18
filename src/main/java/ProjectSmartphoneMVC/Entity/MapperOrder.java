package ProjectSmartphoneMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperOrder implements RowMapper<Order>{

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setId(rs.getInt("id"));
		order.setMaHD(rs.getString("maHD"));
		order.setUser_id(rs.getInt("user_id")); 
		order.setUser_name(rs.getString("user_name"));
		order.setGender(rs.getString("gender"));
		order.setPhone_number(rs.getString("phone_number"));
		order.setTinh_tp(rs.getString("tinh_tp"));
		order.setQuan_huyen(rs.getString("quan_huyen"));
		order.setXa_phuong(rs.getString("xa_phuong"));
		order.setProduct(rs.getString("product"));
		order.setNum(rs.getInt("num")); 
		order.setMoney(rs.getDouble("money"));
		order.setNote(rs.getString("note"));
		order.setCreated_at(rs.getString("created_at"));
		order.setStatus(rs.getString("status")); 
		return order;
	}

}
