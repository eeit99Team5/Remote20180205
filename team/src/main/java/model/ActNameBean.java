package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACTNAME")
public class ActNameBean {
@Id
private Integer actNum;
private Integer eventId;	
private String joinId;	
private Integer joinSt;
@Override
public String toString() {
	return "actNameBean [actNum=" + actNum + ", eventId=" + eventId + ", joinId=" + joinId + ", joinSt=" + joinSt + "]";
}
public Integer getActNum() {
	return actNum;
}
public void setActNum(Integer actNum) {
	this.actNum = actNum;
}
public Integer getEventId() {
	return eventId;
}
public void setEventId(Integer eventId) {
	this.eventId = eventId;
}
public String getJoinId() {
	return joinId;
}
public void setJoinId(String joinId) {
	this.joinId = joinId;
}
public Integer getJoinSt() {
	return joinSt;
}
public void setJoinSt(Integer joinSt) {
	this.joinSt = joinSt;
}	
	
	
}
