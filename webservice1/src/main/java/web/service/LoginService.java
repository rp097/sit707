package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {
		// Match a fixed user name and password.
		//
		String u = username;
		String p = password;
		String d = dob;
		
		if ("rahul".equals(u) && "rahul_pass".equals(p) && "1997-07-12".equals(d)){
			return true;
		}
		return false;
	}
	
	
}
