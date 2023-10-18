package ProjectSmartphoneMVC.Dto;

public class CommentReplyDto {
	private int parent_id;
	private CommentDto commentDto;
	
	public CommentReplyDto() {
	}
	
	public CommentReplyDto(int parent_id, CommentDto commentDto) {
		this.parent_id = parent_id;
		this.commentDto = commentDto;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public CommentDto getCommentDto() {
		return commentDto;
	}

	public void setCommentDto(CommentDto commentDto) {
		this.commentDto = commentDto;
	}
	
}
