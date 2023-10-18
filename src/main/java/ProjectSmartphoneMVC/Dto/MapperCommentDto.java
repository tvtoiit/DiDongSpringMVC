package ProjectSmartphoneMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MapperCommentDto implements RowMapper<CommentDto>{

	@Override
	public CommentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		CommentDto comment = new CommentDto();
		comment.setId(rs.getInt("id"));               
		comment.setParent_id(rs.getInt("parent_id"));
		comment.setUser_id(rs.getInt("user_id"));
		comment.setFullname(rs.getString("fullname"));
		comment.setProduct_id(rs.getInt("product_id"));       
		comment.setContent_comment(rs.getString("content_comment"));
		comment.setNumber_stars(rs.getInt("number_stars"));
		comment.setTime_comment(rs.getDate("time_comment"));
		return comment;
	}
	
}
