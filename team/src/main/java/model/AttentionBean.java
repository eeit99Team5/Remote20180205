package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ATTENTION")
public class AttentionBean {
@Id
private Integer attNum;
private String attid;
@Override
public String toString() {
	return "AttentionBean [attNum=" + attNum + ", attid=" + attid + "]";
}
public Integer getAttNum() {
	return attNum;
}
public void setAttNum(Integer attNum) {
	this.attNum = attNum;
}
public String getAttid() {
	return attid;
}
public void setAttid(String attid) {
	this.attid = attid;
}





}
