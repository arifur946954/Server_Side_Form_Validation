package Form.Entity;

public class LoginData {
	private String userName;
	private String mailAddress;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", mailAddress=" + mailAddress + "]";
	}
	
	

}
