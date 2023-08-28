package Form.Entity;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {
	
    @NotBlank(message = "user name must be contain some character")
    @Size(min = 3, max = 12, message = "user nanme contain 3 to 12 character")

	private String userName;
    @Email(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$",
    		message = "Invalid email")
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
