package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REPORT")
public class ReportBean  {
@Id
private Integer caseNum;
private String reportId;
private java.util.Date reportTime;
private String reportCon;
private String appealid;
private java.util.Date appealTime;
private String appealCon;
private Integer appealSt;

@Override
public String toString() {
	return "reportBean [caseNum=" + caseNum + ", reportId=" + reportId + ", reportTime=" + reportTime + ", reportCon="
			+ reportCon + ", appealid=" + appealid + ", appealTime=" + appealTime + ", appealCon=" + appealCon
			+ ", appealSt=" + appealSt + "]";
}

public Integer getCaseNum() {
	return caseNum;
}


public void setCaseNum(Integer caseNum) {
	this.caseNum = caseNum;
}


public String getReportId() {
	return reportId;
}


public void setReportId(String reportId) {
	this.reportId = reportId;
}


public java.util.Date getReportTime() {
	return reportTime;
}


public void setReportTime(java.util.Date reportTime) {
	this.reportTime = reportTime;
}


public String getReportCon() {
	return reportCon;
}


public void setReportCon(String reportCon) {
	this.reportCon = reportCon;
}


public String getAppealid() {
	return appealid;
}


public void setAppealid(String appealid) {
	this.appealid = appealid;
}


public java.util.Date getAppealTime() {
	return appealTime;
}


public void setAppealTime(java.util.Date appealTime) {
	this.appealTime = appealTime;
}


public String getAppealCon() {
	return appealCon;
}


public void setAppealCon(String appealCon) {
	this.appealCon = appealCon;
}


public Integer getAppealSt() {
	return appealSt;
}


public void setAppealSt(Integer appealSt) {
	this.appealSt = appealSt;
}

}
