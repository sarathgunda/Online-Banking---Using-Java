package amigo_bank;

public abstract class User {
	public User() {
		
	}
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getLogin_status() {
		return Login_status;
	}
	public void setLogin_status(String login_status) {
		Login_status = login_status;
	}
	public User(String user_id, String password, String login_status) {
		User_id = user_id;
		Password = password;
		Login_status = login_status;
	}
	public String toString() {
		return "User [\nUser_id=" + User_id + " \nPassword=" + Password + " \nLogin_status=" + Login_status + "]";
	}
	String User_id;
	String Password;
	String Login_status;
	abstract Customer login(); 

}
