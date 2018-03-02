package model.dao;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.ProductBean;
import model.ProductDAO;

@Repository
public class ProductDAOHibernate implements ProductDAO {
@Autowired
SessionFactory sessionFactory;

public Session getSession() {
	return sessionFactory.getCurrentSession();
	
}

@Override
public ProductBean select(Integer prodId) {
	return this.getSession().get(ProductBean.class, prodId);
}

@Override
public List<ProductBean>select(){
	Query query = this.getSession().createQuery("from ProductBean");
	return (List<ProductBean>)query.list();
}

@Override
public boolean insert(ProductBean bean) {
	ProductBean temp = (ProductBean)this.getSession().get(ProductBean.class,bean.getProdId());
	if(temp!=null) {
		this.getSession().save(bean);
	}
	return false;
}

@Override
public boolean update(Integer prodId,String prodName,String prodCon,Blob prodPic,
		Integer price) {
	ProductBean result = (ProductBean)this.getSession().get(ProductBean.class, prodId);
	if(result!=null) {
		result.setPrice(price);
		result.setProdCon(prodCon);
		result.setProdId(prodId);
		result.setProdName(prodName);
		result.setProdPic(prodPic);
		return true;
	}
	
	return false;
}

@Override
public boolean delete(Integer prodId) {
	ProductBean bean = (ProductBean)this.getSession().get(ProductBean.class, prodId);
	if(bean!=null) {
		this.getSession().delete(prodId);
		return true;
	}
	return false;
}

}
