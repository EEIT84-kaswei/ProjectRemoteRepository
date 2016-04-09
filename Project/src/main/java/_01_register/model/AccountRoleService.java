package _01_register.model;

import java.util.ArrayList;
import java.util.List;

import misc.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import _01_register.model.dao.AccountRoleDAOHibernate;


public class AccountRoleService {
	private AccountRoleDAO accountRoleDAO;
	public void setaccountRoleDAO(AccountRoleDAO accountRoleDAO) {
		this.accountRoleDAO = accountRoleDAO;
	}
	public static void main(String[] args) {
		try {
			Session session =
					HibernateUtil.getSessionFactory().getCurrentSession();
			Transaction transaction = session.beginTransaction();

			AccountRoleService service = new AccountRoleService();
			service.setaccountRoleDAO(new AccountRoleDAOHibernate(session));
			List<AccountRoleBean> beans = service.select(null);
			System.out.println("beans="+beans);
			
			transaction.commit();
		} finally {
			HibernateUtil.closeSessionFactory();
		}
	}
	public List<AccountRoleBean> select(AccountRoleBean bean) {
		List<AccountRoleBean> result = null;
		if(bean!=null && bean.getAccount().trim().length()!=0) {
			AccountRoleBean temp = accountRoleDAO.select(bean.getAccount());
			if(temp!=null) {
				result = new ArrayList<AccountRoleBean>();
				result.add(temp);
			}
		} else {
			result = accountRoleDAO.select(); 
		}
		return result;
	}
	public AccountRoleBean insert(AccountRoleBean bean) {
		AccountRoleBean result = null;
		if(bean!=null) {
			result = accountRoleDAO.insert(bean);
		}
		return result;
	}
	public boolean update(AccountRoleBean bean) {
		boolean result = false;
		if(bean!=null) {
			result = accountRoleDAO.update(bean.getAccount(), bean.getAccount_Role());
		}
		return result;
	}
	public boolean delete(AccountRoleBean bean) {
		boolean result = false;
		if(bean!=null) {
			result = accountRoleDAO.delete(bean.getAccount());
		}
		return result;
	}

}
