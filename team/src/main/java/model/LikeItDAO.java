package model;

import java.util.List;

public interface LikeItDAO {

	LikeItBean select(Integer likeNum);

	List<LikeItBean> select();

	boolean insert(LikeItBean bean);

	boolean update(Integer likeNum, String likeId, Integer postNum);

	boolean delete(Integer likeNum);

}