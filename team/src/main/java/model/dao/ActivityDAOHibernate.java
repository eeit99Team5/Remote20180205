package model.dao;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.ActivityBean;
import model.ActivityDAO;

@Repository
public class ActivityDAOHibernate implements ActivityDAO {
    @Autowired
	SessionFactory sessionFactory;
    
    public Session getSession() {
    	return sessionFactory.getCurrentSession();
    }
    
    @Override
	public ActivityBean select(Integer eventId) {
    	return this.getSession().get(ActivityBean.class, eventId);
    }
    
    @Override
	public List<ActivityBean>select(){
    	Query query = this.getSession().createQuery("from ActivityBean");
    	return (List<ActivityBean>)query.list();
    }
    
    @Override
	public boolean insert(ActivityBean bean) {
    	ActivityBean temp = (ActivityBean)this.getSession().get(ActivityBean.class, bean.getEventId());
    	if(temp!=null) {
    		this.getSession().save(bean);
    	}
    	return false;
     
    }
    
    @Override
	public boolean update(Integer eventId,String title,java.util.Date hostTime,
    		Integer joinPeo,Blob eventPic,String location,java.util.Date eventDate,
    		String eventCon,String pay,String people,String eventType,Integer budget,
    		Integer eventSt) {
    	ActivityBean result= (ActivityBean)this.getSession().get(ActivityBean.class, eventId);
    	if(result!=null) {
    		result.setEventId(eventId);
    		result.setBudget(budget);
    		result.setEventCon(eventCon);
    		result.setEventDate(eventDate);
            result.setEventPic(eventPic);
    		result.setEventSt(eventSt);
    		result.setEventType(eventType);
    		result.setHostTime(hostTime);
    		result.setJoinPeo(joinPeo);
    		result.setLocation(location);
    		result.setPay(pay);
    		result.setPeople(people);
    		result.setTitle(title);
    		return true;
    	}
    	
    	return false;
	  }
    
    @Override
	public boolean delete(Integer eventId) {
    	ActivityBean bean = (ActivityBean)this.getSession().get(ActivityBean.class, eventId);
    	if(bean != null) {
    		this.getSession().delete(eventId);
    		return true;
    	}
    	return false;
    }
}
