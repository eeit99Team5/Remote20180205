package model;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;

public interface MemberDAO {
    MemberBean select(String id);

	List<MemberBean> select();

	boolean insert(MemberBean bean);

	boolean update(String id, String name, String nickName, java.util.Date bdate, Integer sex, Integer height,
			Integer kg, String relation, String hobby, String intro, Blob pic, String pwd, String addr, Integer block,
			java.util.Date logtime);

	boolean delete(String id);

}