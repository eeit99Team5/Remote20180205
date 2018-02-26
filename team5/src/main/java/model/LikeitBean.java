package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "likeit")
public class LikeitBean {
	/*
	 * create table likeit ( 
	 * likeNum		int				identity		primary key, 
	 * likeId		varchar(30)		NOT NULL, 
	 * postNum		int							references postwall(postNum), 
	 * );
	 */

	@Id
	private Integer likeNum;
	private String likeId;
	private Integer postNum;

	@Override
	public String toString() {
		return "LikeitBean [likeNum=" + likeNum + ", likeId=" + likeId + ", postNum=" + postNum + "]";
	}

	public Integer getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}

	public String getLikeId() {
		return likeId;
	}

	public void setLikeId(String likeId) {
		this.likeId = likeId;
	}

	public Integer getPostNum() {
		return postNum;
	}

	public void setPostNum(Integer postNum) {
		this.postNum = postNum;
	}
}
