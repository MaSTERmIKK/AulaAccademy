package menù_package;

import java.util.ArrayList;

public class utente {

	String username;
	String password;
	boolean admin;
	

	public utente(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
