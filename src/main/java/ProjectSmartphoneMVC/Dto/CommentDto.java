package ProjectSmartphoneMVC.Dto;

import java.sql.Date;

public class CommentDto {
	private int id; 
	private int parent_id; 
	private int user_id;
	private String fullname;
	private int product_id;
	private String content_comment;
	private int number_stars; 
	private Date time_comment;
	
	public CommentDto() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getContent_comment() {
		return content_comment;
	}

	public void setContent_comment(String content_comment) {
		this.content_comment = content_comment;
	}

	public int getNumber_stars() {
		return number_stars;
	}

	public void setNumber_stars(int number_stars) {
		this.number_stars = number_stars;
	}

	public Date getTime_comment() {
		return time_comment;
	}

	public void setTime_comment(Date time_comment) {
		this.time_comment = time_comment;
	}
	
	
}
