package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.FriendsBean;
import model.FriendsDAO;

@Repository
public class FriendsDAOHibernate implements FriendsDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public FriendsBean select(Integer friendNum) {
		return  this.getSession().get(FriendsBean.class, friendNum);
		
	}
	
	@Override
	public List<FriendsBean>select(){
		Query query = this.getSession().createQuery("from FriendsBean");
		return (List<FriendsBean>)query.list();
	}
	
	@Override
	public boolean insert(FriendsBean bean) {
		FriendsBean temp = (FriendsBean)this.getSession().get(FriendsBean.class, bean.getFriendNum());
		if(temp!=null) {
			this.getSession().save(bean);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean update(Integer friendNum,String friendId,Integer friendSt){
		FriendsBean result = (FriendsBean)this.getSession().get(FriendsBean.class, friendNum);
		if(result!=null) {
			result.setFriendId(friendId);
			result.setFriendNum(friendNum);
			result.setFriendSt(friendSt);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean delete(Integer friendNum){
		FriendsBean bean = (FriendsBean)this.getSession().get(FriendsBean.class, friendNum);
		if(bean !=null) {
			this.getSession().delete(friendNum);
		}
		return false;
	}
}
