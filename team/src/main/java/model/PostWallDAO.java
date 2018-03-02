package model;

import java.util.List;

public interface PostWallDAO {

	PostwallBean select(Integer postNum);

	List<PostwallBean> select();

	boolean insert(PostwallBean bean);

	boolean update(Integer postNum, String postId, Integer photoId, String postCon, java.util.Date postTime,
			String replyId, String replyCon, java.util.Date replyTime, Integer access);

	boolean delete(Integer postNum);

}