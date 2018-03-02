package model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHAT")
public class ChatBean {
@Id
private Integer chatNum;
private String sendId;
private java.util.Date sendTime;	
private String receiveId;	
private java.util.Date receiveTime;	
private Integer chatPid;
private String chatCon; 
private Integer chatSt;
private Blob chatPic;
@Override
public String toString() {
	return "ChatBean [chatNum=" + chatNum + ", sendId=" + sendId + ", sendTime=" + sendTime + ", receiveId=" + receiveId
			+ ", receiveTime=" + receiveTime + ", chatPid=" + chatPid + ", chatCon=" + chatCon + ", chatSt=" + chatSt
			+ ", chatPic=" + chatPic + "]";
}
public Integer getChatNum() {
	return chatNum;
}
public void setChatNum(Integer chatNum) {
	this.chatNum = chatNum;
}
public String getSendId() {
	return sendId;
}
public void setSendId(String sendId) {
	this.sendId = sendId;
}
public java.util.Date getSendTime() {
	return sendTime;
}
public void setSendTime(java.util.Date sendTime) {
	this.sendTime = sendTime;
}
public String getReceiveId() {
	return receiveId;
}
public void setReceiveId(String receiveId) {
	this.receiveId = receiveId;
}
public java.util.Date getReceiveTime() {
	return receiveTime;
}
public void setReceiveTime(java.util.Date receiveTime) {
	this.receiveTime = receiveTime;
}
public Integer getChatPid() {
	return chatPid;
}
public void setChatPid(Integer chatPid) {
	this.chatPid = chatPid;
}
public String getChatCon() {
	return chatCon;
}
public void setChatCon(String chatCon) {
	this.chatCon = chatCon;
}
public Integer getChatSt() {
	return chatSt;
}
public void setChatSt(Integer chatSt) {
	this.chatSt = chatSt;
}
public Blob getChatPic() {
	return chatPic;
}
public void setChatPic(Blob chatPic) {
	this.chatPic = chatPic;
}


}
