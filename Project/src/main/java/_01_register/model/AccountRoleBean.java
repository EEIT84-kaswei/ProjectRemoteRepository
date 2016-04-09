package _01_register.model;

public class AccountRoleBean {

	private String account;
	private String account_Role;
	
	
	public AccountRoleBean(){
		
	}


	@Override
	public String toString() {
		return "MemberPermissionsBean [account=" + account + ", account_Role=" + account_Role + "]";
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getAccount_Role() {
		return account_Role;
	}


	public void setAccount_Role(String account_Role) {
		this.account_Role = account_Role;
	}

}
