package model.dao;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import model.MemberBean;
import model.MemberDAO;

@Repository
public class MemberDAOHibernate implements MemberDAO{

@Autowired
private SessionFactory sessionFatory;


public Session getSession(){
	return sessionFatory.getCurrentSession();
}

@Override
public MemberBean select(String id) {
	return this.getSession().get(MemberBean.class, id);
}

@Override
public List<MemberBean> select(){
	Query query = this.getSession().createQuery("from MemberBean");
    return (List<MemberBean>)query.list();
}

@Override
public boolean insert(MemberBean bean) {
	MemberBean temp = (MemberBean)this.getSession().get(MemberBean.class, bean.getId());
	if(temp!=null) {
		this.getSession().save(bean);
		return true;
	}
	return false;
}




@Override
public boolean update(String id,String name,String nickName,java.util.Date bdate,Integer sex,Integer height,
		Integer kg,String relation,String hobby,String intro,Blob pic,
		String pwd,String addr,Integer block,java.util.Date logtime) {
		MemberBean result=(MemberBean)this.getSession().get(MemberBean.class,id);
		if(result!=null) {
			result.setAddr(addr);
			result.setBdate(bdate);
			result.setBlock(block);
			result.setHeight(height);
			result.setHobby(hobby);
			result.setId(id);
			result.setIntro(intro);
			result.setKg(kg);
			result.setLogtime(logtime);
			result.setNickName(nickName);
			result.setPic(pic);
			result.setPwd(pwd);
			result.setRelation(relation);
			result.setSex(sex);
			return true;
		}
	return false;	
}

@Override
public boolean delete(String id) {
	MemberBean bean = (MemberBean)this.getSession().get(MemberBean.class, id);
	if(bean!=null) {
		this.getSession().delete(id);
		return true;
	}

	return false;
}





	
}
