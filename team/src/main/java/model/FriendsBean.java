package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FRIENDS")
public class FriendsBean {
@Id
private Integer friendNum;
private String friendId;
private Integer friendSt;
@Override
public String toString() {
	return "friendsBean [friendNum=" + friendNum + ", friendId=" + friendId + ", friendSt=" + friendSt + "]";
}
public Integer getFriendNum() {
	return friendNum;
}
public void setFriendNum(Integer friendNum) {
	this.friendNum = friendNum;
}
public String getFriendId() {
	return friendId;
}
public void setFriendId(String friendId) {
	this.friendId = friendId;
}
public Integer getFriendSt() {
	return friendSt;
}
public void setFriendSt(Integer friendSt) {
	this.friendSt = friendSt;
}

}
