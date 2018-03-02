package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.PostWallDAO;
import model.PostwallBean;

@Repository
public class PostWallDAOHibernate implements PostWallDAO {
    @Autowired
	SessionFactory sessionFactory;
	
public Session getSession() {
	return sessionFactory.getCurrentSession();
}

@Override
public PostwallBean select(Integer postNum) {
	return this.getSession().get(PostwallBean.class,postNum);
}

@Override
public List<PostwallBean> select(){
	Query query = this.getSession().createQuery("from PostwallBean");
	return (List<PostwallBean>)query.list();
}

@Override
public boolean insert(PostwallBean bean) {
	PostwallBean temp = (PostwallBean)this.getSession().get(PostwallBean.class, bean.getPostNum());
	if(temp!=null) {
		this.getSession().save(bean);
		return true;
	}
	return false;
}
@Override
public boolean update(Integer postNum,String postId,Integer photoId,String postCon,
		java.util.Date postTime,String replyId,String replyCon,java.util.Date replyTime,
		Integer access) {
	PostwallBean result = (PostwallBean)this.getSession().get(PostwallBean.class, postNum);
	if(result!=null) {
		result.setAccess(access);
		result.setPhotoId(photoId);
		result.setPostCon(postCon);
		result.setPostId(postId);
		result.setPostNum(postNum);
		result.setPostTime(postTime);
		result.setReplyCon(replyCon);
		result.setReplyId(replyId);
		result.setReplyTime(replyTime);
		return true;
	}
    return false;
}
@Override
public boolean delete(Integer postNum) {
	PostwallBean bean = (PostwallBean)this.getSession().get(PostwallBean.class, postNum);
	if(bean!=null) {
		this.getSession().delete(postNum);
		return true;
	}
	return false;
}


}
