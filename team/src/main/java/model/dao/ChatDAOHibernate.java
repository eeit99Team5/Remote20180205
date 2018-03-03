package model.dao;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.ChatBean;
import model.ChatDAO;

@Repository
public class ChatDAOHibernate implements ChatDAO {
    @Autowired
	SessionFactory sessionFactory; 
	
    
    public Session getSession() {
    	return sessionFactory.getCurrentSession();
    }
    
    @Override
	public ChatBean select(Integer chatNum) {
    	return this.getSession().get(ChatBean.class, chatNum);
    }
    
    @Override
	public List<ChatBean>select(){
    	Query query = this.getSession().createQuery("from ChatBean");
    	return (List<ChatBean>)query.list();
    }
    
    @Override
	public boolean insert(ChatBean bean) {
    	ChatBean temp = (ChatBean)this.getSession().get(ChatBean.class, bean.getChatNum());
    	if(temp!=null) {
    		this.getSession().save(bean);
    		return true;
    	}
    	return false;
    }
    
    @Override
	public boolean update(Integer chatNum,String sendId,java.util.Date sendTime,
    		String receiveId,java.util.Date receiveTime,Integer chatPid,
    		String chatCon,Integer chatSt,Blob chatPic) {
    	ChatBean result = (ChatBean)this.getSession().get(ChatBean.class, chatNum);
    	if(result!=null) {
    		result.setChatCon(chatCon);
    		result.setChatNum(chatNum);
    		result.setChatPic(chatPic);
    		result.setChatPid(chatPid);
    		result.setChatSt(chatSt);
    		result.setReceiveId(receiveId);
    		result.setReceiveTime(receiveTime);
    		result.setSendId(sendId);
    		result.setSendTime(sendTime);
    		return true;
    	}
    	return false;
    }
    
    @Override
	public boolean delete(Integer chatNum) {
    	ChatBean bean = (ChatBean)this.getSession().get(ChatBean.class, chatNum);
    	if(bean !=null) {
    		this.getSession().delete(chatNum);
    		return true;
    	}
    	return false;
    }
}
