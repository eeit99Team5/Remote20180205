package model;

import java.io.Serializable;
import java.sql.Blob;
import java.text.SimpleDateFormat;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import model.MemberBean;

@Entity
@Table(name = "activity")
public class ActivityBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer eventId;
	private String title;
//	private String hostId;
	private java.util.Date hostTime;
	private Integer joinPeo;
	private Blob eventPic;
	private String location;
	private java.util.Date eventDate;
	private String eventCon;
	private String pay;
	private String people;
	private String eventType;
	private Integer budget;
	private Integer eventSt;
	private MemberBean memberBean;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="hostId")
    public MemberBean getMemberBean() {
		return memberBean;
	}

	public void setMemberBean(MemberBean memberBean) {
		this.memberBean = memberBean;
	}
	public ActivityBean(Integer eventId, String title, java.util.Date hostTime, 
			Integer joinPeo, Blob eventPic, String location, java.util.Date eventDate, 
			String eventCon, String pay, String people, String eventType, Integer budget,
			Integer eventSt, MemberBean memberBean) {
		this.eventId = eventId;
		this.title = title;
		this.hostTime = hostTime;
		this.joinPeo = joinPeo;
		this.eventPic = eventPic;
		this.location = location;
		this.eventDate = eventDate;
		this.eventCon = eventCon;
		this.pay = pay;
		this.people = people;
		this.eventType = eventType;
		this.budget = budget;
		this.location = location;
		this.eventSt = eventSt;
		this.memberBean = memberBean;
	}
	
	public ActivityBean() {
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof ActivityBean)) {
			ActivityBean temp = (ActivityBean) obj;
			if(this.eventId == temp.eventId) {
				return true;
			}
		}
		return false;
	}
	
	@Transient
	private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public String toString() {
		return "ActBean [eventId=" + eventId + ", title=" + title + ", hostTime=" + hostTime + ", joinPeo="
				+ joinPeo + ",eventPic=" + eventPic + ", location = " + location + ", eventDate =" + eventDate + ",eventCon=" + eventCon + ",pay="
				+ pay + ", people=" + people + ",eventType=" + eventType + ",budget=" + budget + ",eventSt="+eventSt+"]";
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public java.util.Date getHostTime() {
		return hostTime;
	}

	public void setHostTime(java.util.Date hostTime) {
		this.hostTime = hostTime;
	}

	public Integer getJoinPeo() {
		return joinPeo;
	}

	public void setJoinPeo(Integer joinPeo) {
		this.joinPeo = joinPeo;
	}

	public Blob getEventPic() {
		return eventPic;
	}

	public void setEventPic(Blob eventPic) {
		this.eventPic = eventPic;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public java.util.Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(java.util.Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventCon() {
		return eventCon;
	}

	public void setEventCon(String eventCon) {
		this.eventCon = eventCon;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public Integer getEventSt() {
		return eventSt;
	}

	public void setEventSt(Integer eventSt) {
		this.eventSt = eventSt;
	}
	
}
