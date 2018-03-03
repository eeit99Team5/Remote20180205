package model;

import java.util.List;

public interface FriendsDAO {

	FriendsBean select(Integer friendNum);

	List<FriendsBean> select();

	boolean insert(FriendsBean bean);

	boolean update(Integer friendNum, String friendId, Integer friendSt);

	boolean delete(Integer friendNum);

}