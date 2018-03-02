package model;

import java.util.List;

public interface MyHobbyDAO {

	MyHobbyBean select(Integer myhobNum);

	List<MyHobbyBean> select();

	boolean insert(MyHobbyBean bean);

	boolean update(Integer myhobNum, String myhobId, Integer hobbyId);

	boolean delete(Integer myhobNum);

}