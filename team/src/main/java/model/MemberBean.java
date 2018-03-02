package model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MEMBER")
public class MemberBean{
@Id
private String id;
private String name;
private String nickName;
private java.util.Date bdate;
private Integer sex;	
private Integer height;	
private Integer kg;	
private String relation;
private String hobby;
private String intro;
private Blob pic;
private String pwd;
private String addr;
private Integer block;
private java.util.Date logtime;

@Override
public String toString() {
	return "memberBean [id=" + id + ", name=" + name + ", nickName=" + nickName + ", bdate=" + bdate + ", sex=" + sex
			+ ", height=" + height + ", kg=" + kg + ", relation=" + relation + ", hobby=" + hobby + ", intro=" + intro
			+ ", pic=" + pic + ", pwd=" + pwd + ", addr=" + addr + ", block=" + block + ", logtime=" + logtime + "]";
}



public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getNickName() {
	return nickName;
}

public void setNickName(String nickName) {
	this.nickName = nickName;
}

public java.util.Date getBdate() {
	return bdate;
}

public void setBdate(java.util.Date bdate) {
	this.bdate = bdate;
}

public Integer getSex() {
	return sex;
}

public void setSex(Integer sex) {
	this.sex = sex;
}

public Integer getHeight() {
	return height;
}

public void setHeight(Integer height) {
	this.height = height;
}

public Integer getKg() {
	return kg;
}

public void setKg(Integer kg) {
	this.kg = kg;
}

public String getRelation() {
	return relation;
}

public void setRelation(String relation) {
	this.relation = relation;
}

public String getHobby() {
	return hobby;
}

public void setHobby(String hobby) {
	this.hobby = hobby;
}

public String getIntro() {
	return intro;
}

public void setIntro(String intro) {
	this.intro = intro;
}

public Blob getPic() {
	return pic;
}

public void setPic(Blob pic) {
	this.pic = pic;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getAddr() {
	return addr;
}

public void setAddr(String addr) {
	this.addr = addr;
}

public Integer getBlock() {
	return block;
}

public void setBlock(Integer block) {
	this.block = block;
}

public java.util.Date getLogtime() {
	return logtime;
}

public void setLogtime(java.util.Date logtime) {
	this.logtime = logtime;
}

}
