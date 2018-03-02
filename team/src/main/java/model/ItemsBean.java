package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class ItemsBean {
@Id
private Integer giftNum;
private String giveId;
private java.util.Date giveTime;
private String getId;
private Integer giftCount;
private Integer price;
@Override
public String toString() {
	return "itemsBean [giftNum=" + giftNum + ", giveId=" + giveId + ", giveTime=" + giveTime + ", getId=" + getId
			+ ", giftCount=" + giftCount + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}
public Integer getGiftNum() {
	return giftNum;
}
public void setGiftNum(Integer giftNum) {
	this.giftNum = giftNum;
}
public String getGiveId() {
	return giveId;
}
public void setGiveId(String giveId) {
	this.giveId = giveId;
}
public java.util.Date getGiveTime() {
	return giveTime;
}
public void setGiveTime(java.util.Date giveTime) {
	this.giveTime = giveTime;
}
public String getGetId() {
	return getId;
}
public void setGetId(String getId) {
	this.getId = getId;
}
public Integer getGiftCount() {
	return giftCount;
}
public void setGiftCount(Integer giftCount) {
	this.giftCount = giftCount;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price = price;
}


}
