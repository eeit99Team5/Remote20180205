package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.ReportBean;
import model.ReportDAO;

@Repository
public class ReportDAOHibernate implements ReportDAO {
 @Autowired	
 SessionFactory sessionFactory;
 
 public Session getSession() {
	 return sessionFactory.getCurrentSession();
 }
 
 @Override
public ReportBean select(Integer caseNum) {
	 return this.getSession().get(ReportBean.class, caseNum);
	 
 }
 @Override
public List<ReportBean>select(){
	 Query query = this.getSession().createQuery("from ReportBean");
	 return (List<ReportBean>)query.list();
 }
 
 @Override
public boolean insert(ReportBean bean) {
	 ReportBean temp = (ReportBean)this.getSession().get(ReportBean.class,bean.getCaseNum());
	 if(temp!=null) {
		 this.getSession().save(bean);
		 return true;
	 }
	 return false;
 }
 
 @Override
public boolean update(Integer caseNum,String reportId,java.util.Date reportTime,String reportCon,
		 String appealid,java.util.Date appealTime,String appealCon,Integer appealSt) {
	 ReportBean result = (ReportBean)this.getSession().get(ReportBean.class, caseNum);
	 if(result!=null) {
		 result.setAppealCon(appealCon);
		 result.setAppealid(appealid);
		 result.setAppealSt(appealSt);
		 result.setAppealTime(appealTime);
		 result.setCaseNum(caseNum);
		 result.setReportCon(reportCon);
		 result.setReportId(reportId);
		 result.setReportTime(reportTime);
		 return true;
	 }
	 return false;
 }
 
 @Override
public boolean delete(Integer caseNum) {
	 ReportBean bean = (ReportBean)this.getSession().get(ReportBean.class, caseNum);
	 if(bean != null) {
		 this.getSession().delete(caseNum);
		 return true;
	 }
	 return false;
 }
 
}
