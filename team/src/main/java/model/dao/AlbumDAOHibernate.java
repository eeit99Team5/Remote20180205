package model.dao;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.AlbumBean;
import model.AlbumDAO;

@Repository
public class AlbumDAOHibernate implements AlbumDAO {
    @Autowired
	SessionFactory sessionFactory;
    
    public Session getSession() {
    	return sessionFactory.getCurrentSession();
    }
    
    @Override
	public AlbumBean select(String albId) {
    	return this.getSession().get(AlbumBean.class, albId);
    }
    
    @Override
	public List<AlbumBean>select(){
    	Query query = this.getSession().createQuery("from AlbumBean");
    	 return (List<AlbumBean>)query.list();
    	
    }
    
    @Override
	public boolean insert(AlbumBean bean) {
    	AlbumBean temp = this.getSession().get(AlbumBean.class, bean.getAlbId());
    	if(temp!=null) {
    		this.getSession().save(bean);
    		return true;
    	}
    	return false;
    }
    
    @Override
	public boolean update(String albId,Blob photo,Blob resizePic) {
    	AlbumBean result = this.getSession().get(AlbumBean.class, albId);
    	if(result!=null) {
    		result.setAlbId(albId);
    		result.setPhoto(photo);
    		result.setResizePic(resizePic);
    		return true;
    	}
    	return false;
    }
    
    @Override
	public boolean delete(String albId) {
    	AlbumBean bean = this.getSession().get(AlbumBean.class, albId);
    	if(bean!=null) {
    		this.getSession().delete(albId);
    		return true;
    	}
    	return false;
    }
}
