package _01_register.model;

import java.util.List;

import org.hibernate.Session;

public interface AccountRoleDAO {

	Session getSession();

	AccountRoleBean select(String account);

	List<AccountRoleBean> select();

	AccountRoleBean insert(AccountRoleBean bean);

	boolean update(String account, String account_Role);

	boolean delete(String account);

}