package _01_register.model.dao;


import java.util.List;

import misc.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import _01_register.model.AccountRoleBean;
import _01_register.model.AccountRoleDAO;


public class AccountRoleDAOHibernate implements AccountRoleDAO {
	public static void main(String[] args) {
		try {
		Session session =
				HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction trx = session.beginTransaction();
		AccountRoleDAO dao = new AccountRoleDAOHibernate(session);
		//查詢測試
//		accountRoleBean beanss=dao.select("admin");
//		System.out.println(beanss);
		
//		List<accountRoleBean> beanss=dao.select();
//		for(accountRoleBean pbeans:beanss){
//		System.out.println(pbeans);
//		}
		
		//新增測試
//		accountRoleBean bean=new accountRoleBean();
//		bean.setAccount("shiuWei");
//		bean.setAccount_Role("I\'m God");
//		accountRoleBean beans=dao.insert(bean);
//		accountRoleBean beanss=dao.select("shiuWei");
//		System.out.println(beanss);
		
		//修改測試
//		boolean bean=dao.update("shiuWei", "SuperGod");
//		System.out.println(bean);
//		List<accountRoleBean> beanss=dao.select();
//		for(accountRoleBean pbeans:beanss){
//		System.out.println(pbeans);
//		}
		//刪除測試
		boolean bean=dao.delete("shiuWei");
		System.out.println(bean);
		
		
		
		trx.commit();
	} finally {
		HibernateUtil.closeSessionFactory();
	}
	
	}
	private Session session = null;
	public AccountRoleDAOHibernate(Session session) {
		this.session = session;
	}
	/* (non-Javadoc)
	 * @see model.dao.MemberPermissionsDAO#getSession()
	 */
	@Override
	public Session getSession() {
		return session;
	}
	
	/* (non-Javadoc)
	 * @see model.dao.MemberPermissionsDAO#select(int)
	 */
	@Override
	public AccountRoleBean select(String account) {
		return (AccountRoleBean)
				this.getSession().get(AccountRoleBean.class, account);
	}
	
	/* (non-Javadoc)
	 * @see model.dao.MemberPermissionsDAO#select()
	 */
	@Override
	public List<AccountRoleBean> select() {
		Query query =
				this.getSession().createQuery("from accountRoleBean");
		return (List<AccountRoleBean>) query.list();
	}
	
	/* (non-Javadoc)
	 * @see model.dao.MemberPermissionsDAO#insert(model.accountRoleBean)
	 */
	@Override
	public AccountRoleBean insert(AccountRoleBean bean) {
		AccountRoleBean result = (AccountRoleBean)
				this.getSession().get(AccountRoleBean.class, bean.getAccount());
		if(result==null) {
			this.getSession().save(bean);
			return bean;
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see model.dao.MemberPermissionsDAO#update(int, java.lang.String)
	 */
	@Override
	public boolean update(String account,
			String account_Role) {
		AccountRoleBean result = (AccountRoleBean)
				this.getSession().get(AccountRoleBean.class, account);
		if(result!=null) {
			result.setAccount_Role(account_Role);
			return true;
		}
		return false;
	}
	/* (non-Javadoc)
	 * @see model.dao.MemberPermissionsDAO#delete(int)
	 */
	@Override
	public boolean delete(String account) {
		AccountRoleBean bean = (AccountRoleBean) this.getSession().get(AccountRoleBean.class, account);
		if(bean!=null) {
			this.getSession().delete(bean);
			return true;
		}
		return false;
	}
}
