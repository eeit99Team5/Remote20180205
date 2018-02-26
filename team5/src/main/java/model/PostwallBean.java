package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "postwall")
public class PostwallBean {
	/*
	 * create table postwall ( 
	 * postNum		int				identity		primary key, 
	 * postId		varchar(30)					references member(id), 
	 * photoId		int							references album(photoId), 
	 * postCon		varchar(100)		NOT NULL, 
	 * postTime		datetime 		NOT NULL, 
	 * replyId		varchar(30)					references member(id), 
	 * replyCon		varchar(100)		NOT NULL, 
	 * replyTime		datetime			NOT NULL, 
	 * limit			int				NOT NULL, 
	 * );
	 */

	@Id
	private Integer postNum;
	private String postId;
	private Integer photoId;
	private String postCon;
	private java.util.Date postTime;
	private String replyId;
	private String replyCon;
	private java.util.Date replyTime;
	private Integer limit;

	@Override
	public String toString() {
		return "PostwallBean [postNum=" + postNum + ", postId=" + postId + ", photoId=" + photoId + ", postCon="
				+ postCon + ", postTime=" + postTime + ", replyId=" + replyId + ", replyCon=" + replyCon
				+ ", replyTime=" + replyTime + ", limit=" + limit + "]";
	}

	public Integer getPostNum() {
		return postNum;
	}

	public void setPostNum(Integer postNum) {
		this.postNum = postNum;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public Integer getPhotoId() {
		return photoId;
	}

	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}

	public String getPostCon() {
		return postCon;
	}

	public void setPostCon(String postCon) {
		this.postCon = postCon;
	}

	public java.util.Date getPostTime() {
		return postTime;
	}

	public void setPostTime(java.util.Date postTime) {
		this.postTime = postTime;
	}

	public String getReplyId() {
		return replyId;
	}

	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}

	public String getReplyCon() {
		return replyCon;
	}

	public void setReplyCon(String replyCon) {
		this.replyCon = replyCon;
	}

	public java.util.Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(java.util.Date replyTime) {
		this.replyTime = replyTime;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
}
