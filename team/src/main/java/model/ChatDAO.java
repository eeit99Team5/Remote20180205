package model;

import java.sql.Blob;
import java.util.List;

public interface ChatDAO {

	ChatBean select(Integer chatNum);

	List<ChatBean> select();

	boolean insert(ChatBean bean);

	boolean update(Integer chatNum, String sendId, java.util.Date sendTime, String receiveId,
			java.util.Date receiveTime, Integer chatPid, String chatCon, Integer chatSt, Blob chatPic);

	boolean delete(Integer chatNum);

}