package model;

import java.util.List;

public interface ActNameDAO {

	ActNameBean select(Integer actNum);

	List<ActNameBean> select();

	boolean insert(ActNameBean bean);

	boolean update(Integer actNum, Integer eventId, String joinId, Integer joinSt);

	boolean delete(Integer actNum);

}