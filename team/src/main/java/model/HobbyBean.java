package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOBBY")
public class HobbyBean {
@Id
private Integer hobbyId;
private String hobbyName;
@Override
public String toString() {
	return "hobbyBean [hobbyId=" + hobbyId + ", hobbyName=" + hobbyName + "]";
}
public Integer getHobbyId() {
	return hobbyId;
}
public void setHobbyId(Integer hobbyId) {
	this.hobbyId = hobbyId;
}
public String getHobbyName() {
	return hobbyName;
}
public void setHobbyName(String hobbyName) {
	this.hobbyName = hobbyName;
}	
	
	
	
	
	
	
}
