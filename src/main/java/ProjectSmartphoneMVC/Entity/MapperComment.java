package ProjectSmartphoneMVC.Entity;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperComment implements RowMapper<Comment>{

	@Override
	public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Comment comment = new Comment();
		comment.setId(rs.getInt("id"));               
		comment.setParent_id(rs.getInt("parent_id"));
		comment.setUser_id(rs.getInt("user_id"));
		comment.setProduct_id(rs.getInt("product_id"));       
		comment.setContent_comment(rs.getString("content_comment"));
		comment.setNumber_stars(rs.getInt("number_stars"));
		comment.setTime_comment(rs.getDate("time_comment"));
		return comment;
	}

}
