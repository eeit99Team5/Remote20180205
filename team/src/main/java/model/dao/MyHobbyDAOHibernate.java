package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.MyHobbyBean;
import model.MyHobbyDAO;
@Repository
public class MyHobbyDAOHibernate implements MyHobbyDAO {
	
@Autowired	
SessionFactory sessionFactory;
	
public Session getSession() {
	return sessionFactory.getCurrentSession();
}	

@Override
public MyHobbyBean select(Integer myhobNum) {
	return this.getSession().get(MyHobbyBean.class,myhobNum);
}
@Override
public List<MyHobbyBean>select(){
	Query query = this.getSession().createQuery("from MyHobbyBean");
	return (List<MyHobbyBean>)query.list();
}


@Override
public boolean insert(MyHobbyBean bean) {
	MyHobbyBean temp = (MyHobbyBean)this.getSession().get(MyHobbyBean.class, bean.getMyhobNum()); 
	if(temp!=null) {
		this.getSession().save(bean);
		return true;
	}
	return false;
}

@Override
public boolean update(Integer myhobNum,String myhobId,Integer hobbyId) {
	MyHobbyBean result = (MyHobbyBean)this.getSession().get(MyHobbyBean.class, myhobNum);
	if(result!= null) {
		result.setHobbyId(hobbyId);
		result.setMyhobId(myhobId);
		result.setMyhobNum(myhobNum);
		return true;
	}
	return false;
	
}

@Override
public boolean delete(Integer myhobNum) {
	MyHobbyBean bean = (MyHobbyBean)this.getSession().get(MyHobbyBean.class, myhobNum);
	if(bean!=null) {
		this.getSession().delete(myhobNum);
		return true;
	}
	
	return false;
}

}
