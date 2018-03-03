package model;

import java.sql.Blob;
import java.util.List;

public interface ActivityDAO {

	ActivityBean select(Integer eventId);

	List<ActivityBean> select();

	boolean insert(ActivityBean bean);

	boolean update(Integer eventId, String title, java.util.Date hostTime, Integer joinPeo, Blob eventPic,
			String location, java.util.Date eventDate, String eventCon, String pay, String people, String eventType,
			Integer budget, Integer eventSt);

	boolean delete(Integer eventId);

}