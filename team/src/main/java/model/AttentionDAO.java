package model;

import java.util.List;

public interface AttentionDAO {

	AttentionBean select(Integer attNum);

	List<AttentionBean> select();

	boolean insert(AttentionBean bean);

	boolean update(Integer attNum, String attid);

	boolean delete(Integer attNum);

}