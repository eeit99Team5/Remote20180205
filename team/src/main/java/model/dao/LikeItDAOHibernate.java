package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.LikeItBean;
import model.LikeItDAO;

@Repository
public class LikeItDAOHibernate implements LikeItDAO {
    @Autowired
	SessionFactory sessionFactory;
	
    public Session getSession() {
    	return sessionFactory.getCurrentSession();
    }
    
    @Override
	public LikeItBean select(Integer likeNum) {
    	return this.getSession().get(LikeItBean.class, likeNum);
    }
    @Override
	public List<LikeItBean>select(){
    		Query query = this.getSession().createQuery("from LikeItBean");
    		return (List<LikeItBean>) query.list();
    	}
    
    @Override
	public boolean insert(LikeItBean bean) {
    	LikeItBean temp = (LikeItBean)this.getSession().get(LikeItBean.class, bean.getLikeNum());
    	if(temp!=null) {
    		this.getSession().save(bean);
    		return true;
    	}
    	return false;
    }
    
    @Override
	public boolean update(Integer likeNum,String  likeId,Integer postNum) {
    	LikeItBean result = (LikeItBean)this.getSession().get(LikeItBean.class, likeNum);
    	if(result!=null) {
    		result.setLikeId(likeId);
    		result.setLikeNum(likeNum);
    		result.setPostNum(postNum);
    		return true;
    	}
    	return false;
    }
    
    @Override
	public boolean delete(Integer likeNum) {
    	LikeItBean bean = (LikeItBean)this.getSession().get(LikeItBean.class, likeNum);
    	if(bean != null) {
    		this.getSession().delete(likeNum);
    		return true;
    	}
    	return false;
    }
    }

