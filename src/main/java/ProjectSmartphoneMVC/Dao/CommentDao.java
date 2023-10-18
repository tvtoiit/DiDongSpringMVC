package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Dto.CommentDto;
import ProjectSmartphoneMVC.Dto.CommentReplyDto;
import ProjectSmartphoneMVC.Dto.MapperCommentDto;
import ProjectSmartphoneMVC.Entity.Comment;

@Repository
public class CommentDao extends BaseDao{

	public List<CommentDto> getAllComments(String id){
		List<CommentDto> list = new ArrayList<CommentDto>();
		String sql = "SELECT c.id, c.parent_id, c.user_id, u.fullname, c.product_id, c.content_comment, c.number_stars, c.time_comment "
				+ "FROM comment c LEFT JOIN user u ON c.user_id = u.id "
				+ "WHERE c.product_id = '"+id+"' AND c.parent_id = 0 ORDER BY c.id DESC";
		list = _jdbcTemplate.query(sql, new MapperCommentDto());
		return list;
	}
	public List<CommentDto> getAllCommentsReply(String id, int parent_id){
		List<CommentDto> list = new ArrayList<CommentDto>();
		String sql = "SELECT c.id, c.parent_id, c.user_id, u.fullname, c.product_id, c.content_comment, c.number_stars, c.time_comment "
				+ "FROM comment c LEFT JOIN user u ON c.user_id = u.id "
				+ "WHERE c.product_id ='"+id+"' AND c.parent_id ='"+parent_id+"' ORDER BY c.id DESC";
		list = _jdbcTemplate.query(sql, new MapperCommentDto());
		return list;
	}
	public HashMap<Integer, CommentReplyDto> viewCommentReply(HashMap<Integer, CommentReplyDto> commentReply, List<CommentDto> list, String idProduct){
		for(int i=0;i<list.size();i++) {
			List<CommentDto> list2 = getAllCommentsReply(idProduct,list.get(i).getId());
			if(list2.size()>0) {
				for(int j=0;j<list2.size();j++) {
					CommentReplyDto itemComment = new CommentReplyDto();
					itemComment.setParent_id(list2.get(j).getParent_id());
					itemComment.setCommentDto(list2.get(j));
					commentReply.put(list2.get(j).getId(), itemComment);
				}
			}
		}
		return commentReply;
	}
	public int insertComment(Comment comment) {
		String sql = "INSERT INTO comment(parent_id, user_id, product_id, content_comment, number_stars) "
				+ "VALUES ('"+comment.getParent_id()+"','"+comment.getUser_id()+"','"+comment.getProduct_id()+"','"+comment.getContent_comment()+"','"+comment.getNumber_stars()+"')";
		int count = _jdbcTemplate.update(sql);
		return count;
	}
	public int deleteComment(String id) {
		String sql = "DELETE FROM comment WHERE id ='"+id+"'";
		int count = _jdbcTemplate.update(sql);
		return count;
	}
}
