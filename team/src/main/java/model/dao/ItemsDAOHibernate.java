package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.ItemsBean;
import model.ItemsDAO;
@Repository
public class ItemsDAOHibernate implements ItemsDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public ItemsBean select(Integer giftNum) {
		return this.getSession().get(ItemsBean.class, giftNum);
	}
	
	@Override
	public List<ItemsBean>select(){
		Query query = this.getSession().createQuery("from ItemsBean");
		return (List<ItemsBean>)query.list();
	}
	
	@Override
	public boolean insert(ItemsBean bean) {
		ItemsBean temp = this.getSession().get(ItemsBean.class, bean.getGiftNum());
		if(temp!=null) {
			this.getSession().save(bean);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean update(Integer giftNum,String giveId,java.util.Date giveTime,
			String getId,Integer giftCount,Integer price) {
		ItemsBean result = this.getSession().get(ItemsBean.class, giftNum);
		if(result!=null) {
			result.setGetId(getId);
			result.setGiftCount(giftCount);
			result.setGiftNum(giftNum);
			result.setGiveId(giveId);
			result.setGiveTime(giveTime);
			result.setPrice(price);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean delete(Integer giftNum) {
		ItemsBean bean = this.getSession().get(ItemsBean.class, giftNum);
		if(bean != null) {
			this.getSession().delete(giftNum);
			return true;
		}
		return false;
	}
}
