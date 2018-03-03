package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.ActNameBean;
import model.ActNameDAO;

@Repository
public class ActNameDAOHibernate implements ActNameDAO {

	@Autowired
	SessionFactory sessionFctory;
	
	public Session getSession() {
		return sessionFctory.getCurrentSession();
	}
	
	@Override
	public ActNameBean select(Integer actNum) {
		return this.getSession().get(ActNameBean.class, actNum);
	}
	
	@Override
	public List<ActNameBean>select(){
		Query query = this.getSession().createQuery("from ActNameBean");
		return  (List<ActNameBean>)query.list();
	}
	
	@Override
	public boolean insert(ActNameBean bean) {
		ActNameBean temp = (ActNameBean)this.getSession().get(ActNameBean.class, bean.getActNum());
		if(temp!=null) {
			this.getSession().save(bean);
		}
		return false;
	}
	
	@Override
	public boolean update(Integer actNum,Integer eventId,String joinId,Integer joinSt) {
		ActNameBean result = (ActNameBean)this.getSession().get(ActNameBean.class, actNum);
		if(result!=null) {
			result.setActNum(actNum);
			result.setEventId(eventId);
			result.setJoinId(joinId);
			result.setJoinSt(joinSt);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer actNum) {
		ActNameBean bean = (ActNameBean)this.getSession().get(ActNameBean.class, actNum);
		if(bean !=null) {
			this.getSession().delete(actNum);
		}
		return false;
	}
}
