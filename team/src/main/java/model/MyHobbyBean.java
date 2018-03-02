package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MYHOBBY")
public class MyHobbyBean {
@Id
private Integer myhobNum;
private String myhobId;	
private Integer hobbyId;
@Override
public String toString() {
	return "myhobbyBean [myhobNum=" + myhobNum + ", myhobId=" + myhobId + ", hobbyId=" + hobbyId + "]";
}
public Integer getMyhobNum() {
	return myhobNum;
}
public void setMyhobNum(Integer myhobNum) {
	this.myhobNum = myhobNum;
}
public String getMyhobId() {
	return myhobId;
}
public void setMyhobId(String myhobId) {
	this.myhobId = myhobId;
}
public Integer getHobbyId() {
	return hobbyId;
}
public void setHobbyId(Integer hobbyId) {
	this.hobbyId = hobbyId;
}	
	
	
	
	
}
