package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.AttentionBean;
import model.AttentionDAO;

@Repository
public class AttentionDAOHibernate implements AttentionDAO {
    @Autowired
	SessionFactory sessionFactory;
    
    public Session getSession() {
    	return sessionFactory.getCurrentSession();
    }
    
    @Override
	public AttentionBean select(Integer attNum) {
    	return this.getSession().get(AttentionBean.class, attNum);
    }
    
    @Override
	public List<AttentionBean>select(){
    	Query query = this.getSession().createQuery("from AttentionBean");
    	return  (List<AttentionBean>)query.list();
    }
    
    @Override
	public boolean insert(AttentionBean bean) {
    	AttentionBean temp = (AttentionBean)this.getSession().get(AttentionBean.class, bean.getAttNum());
    	if(temp!=null) {
    		this.getSession().save(bean);
    		return true;
    	}
    	return false;
    }
    
    @Override
	public boolean update(Integer attNum,String attid) {
    	AttentionBean result = (AttentionBean)this.getSession().get(AttentionBean.class, attNum);
    	if(result!=null) {
    		result.setAttid(attid);
    		result.setAttNum(attNum);
    		return true;
    	}
    	return false;
    }
    
    @Override
	public boolean delete(Integer attNum) {
    	AttentionBean bean = (AttentionBean)this.getSession().get(AttentionBean.class, attNum);
    	if(bean != null) {
    		this.getSession().delete(attNum);
    		return true;
    	}
    	return false;
    }
}
