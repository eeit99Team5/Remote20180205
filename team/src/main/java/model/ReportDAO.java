package model;

import java.util.List;

public interface ReportDAO {

	ReportBean select(Integer caseNum);

	List<ReportBean> select();

	boolean insert(ReportBean bean);

	boolean update(Integer caseNum, String reportId, java.util.Date reportTime, String reportCon, String appealid,
			java.util.Date appealTime, String appealCon, Integer appealSt);

	boolean delete(Integer caseNum);

}