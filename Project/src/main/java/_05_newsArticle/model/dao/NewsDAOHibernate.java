package _05_newsArticle.model.dao;
/* 陳姵吟 Carley Chen, 01-04-2016 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import _05_newsArticle.model.NewsBean;
import _05_newsArticle.model.NewsDAO;
import misc.HibernateUtil;

public class NewsDAOHibernate implements NewsDAO {
	private Session session;

	public NewsDAOHibernate(Session session) {
		this.session = session;
	}

	public Session getSession() {
		return session;
	}

	public static void main(String[] args) {
		try {
			Session session = HibernateUtil.getSessionFactory()
					.getCurrentSession();
			session.beginTransaction();

			NewsDAOHibernate dao = new NewsDAOHibernate(session);
//			List<NewsBean> bean = dao.select();
//			NewsBean bean = dao.select(6);
//			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//			java.util.Date ntime = dateFormat.parse("2016-03-29");
//			List<NewsBean> bean = dao.selectByDate(ntime);
			
			NewsBean result = new NewsBean();
//			result.setNno(10);
			result.setNtime(new Date());
			result.setNtitle("ABC");
			result.setNcontext("123456789");
			NewsBean bean = dao.insert(result);
//			NewsBean bean = dao.update(result);
//			boolean bean = dao.delete(11);
			System.out.println(bean);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.getSessionFactory().close();
		}
	}

	@Override
	public List<NewsBean> select() {
		Query query = getSession().createQuery("from NewsBean");
		return (List<NewsBean>) query.list();
	}

	@Override
	public NewsBean select(int nno) {
		return getSession().get(NewsBean.class, nno);
	}

	@Override
	public List<NewsBean> selectByDate(java.util.Date ntime) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = dateFormat.format(ntime);
		Query query = getSession().createQuery("from NewsBean where ntime = ?");
		query.setParameter(0, java.sql.Date.valueOf(date));
		return (List<NewsBean>) query.list();
	}

	@Override
	public NewsBean insert(NewsBean bean) {	
		if(bean != null){
			getSession().save(bean);
			return bean;			
		}
		return null;
	}

	@Override
	public NewsBean update(NewsBean bean) {
		if(select(bean.getNno()) != null){
			NewsBean result = select(bean.getNno());
			result.setNtime(bean.getNtime());
			result.setNtitle(bean.getNtitle());
			result.setNcontext(bean.getNcontext());
			return result;
		}
		return null;
	}

	@Override
	public boolean delete(int nno) {
		if(select(nno) != null){
			getSession().delete(select(nno));
			return true;
		}
		return false;
	}

}
