package web.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginUnitTests {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222606849";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Rahul Prem";
		Assert.assertNotNull("Student name is ", studentName);
	}
	
	//Test case for login failure - all three invalid fields
	@Test
	public void testLoginFailedIncorrectUsernameIncorrectPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("rp", "rahul_pw", "1998-07-13"), false);
	}
	
	//Test case for login success - all three valid fields
	@Test
	public void testLoginSuccessCorrectUsernameCorrectPwCorrectDob() {			
		Assert.assertEquals(LoginService.login("rahul", "rahul_pass", "1997-07-12"), true);
	}
	
	//Other test cases from the Decision Table
	@Test
	public void testLoginFailedBlankUsernameBlankPwBlankDob() {			
		Assert.assertEquals(LoginService.login("", "", ""), false);
	}
	
	@Test
	public void testLoginFailedBlankUsernameBlankPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("", "", "1997-03-04"), false);
	}
	
	@Test
	public void testLoginFailedBlankUsernameBlankPwCorrectdDob() {			
		Assert.assertEquals(LoginService.login("", "", "1997-07-12"), false);
	}
	
	@Test
	public void testLoginFailedBlankUsernameCorrectPwBlankDob() {			
		Assert.assertEquals(LoginService.login("", "rahul_pass", ""), false);
	}
	
	@Test
	public void testLoginFailedBlankUsernameCorrectPwCorrectDob() {			
		Assert.assertEquals(LoginService.login("", "rahul_pass", "1997-07-12"), false);
	}
	
	@Test
	public void testLoginFailedBlankUsernameCorrectPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("", "rahul_pass", "1997-08-08"), false);
	}
	
	@Test
	public void testLoginFailedBlankUsernameIncorrectPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("", "rahul_pass1", "1997-08-08"), false);
	}
	
	@Test
	public void testLoginFailedBlankUsernameIncorrectPwCorrectDob() {			
		Assert.assertEquals(LoginService.login("", "rahul_pass1", "1997-07-12"), false);
	}
	
	@Test
	public void testLoginFailedBlankUsernameIncorrectPwBlankDob() {			
		Assert.assertEquals(LoginService.login("", "rahul_pass1", ""), false);
	}

	//Correct Username test cases
	
	@Test
	public void testLoginFailedCorrectUsernameBlankPwBlankDob() {			
		Assert.assertEquals(LoginService.login("rahul", "", ""), false);
	}
	
	@Test
	public void testLoginFailedCorrectUsernameBlankPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("rahul", "", "1997-03-04"), false);
	}
	
	@Test
	public void testLoginFailedCorrectUsernameBlankPwCorrectdDob() {			
		Assert.assertEquals(LoginService.login("rahul", "", "1997-07-12"), false);
	}
	
	@Test
	public void testLoginFailedCorrectUsernameCorrectPwBlankDob() {			
		Assert.assertEquals(LoginService.login("rahul", "rahul_pass", ""), false);
	}
	
	
	@Test
	public void testLoginFailedCorrectUsernameCorrectPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("rahul", "rahul_pass", "1997-08-08"), false);
	}
	
	@Test
	public void testLoginFailedCorrectUsernameIncorrectPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("rahul", "rahul_pass1", "1997-08-08"), false);
	}
	
	@Test
	public void testLoginFailedCorrectUsernameIncorrectPwCorrectDob() {			
		Assert.assertEquals(LoginService.login("rahul", "rahul_pass1", "1997-07-12"), false);
	}
	
	@Test
	public void testLoginFailedCorrectUsernameIncorrectPwBlankDob() {			
		Assert.assertEquals(LoginService.login("rahul", "rahul_pass1", ""), false);
	}
	
	//Test cases with Incorrect Username
	
	@Test
	public void testLoginFailedIncorrectUsernameBlankPwBlankDob() {			
		Assert.assertEquals(LoginService.login("rp", "", ""), false);
	}
	
	@Test
	public void testLoginFailedIncorrectUsernameBlankPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("rp", "", "1997-03-04"), false);
	}
	
	@Test
	public void testLoginFailedIncorrectUsernameBlankPwCorrectdDob() {			
		Assert.assertEquals(LoginService.login("rp", "", "1997-07-12"), false);
	}
	
	@Test
	public void testLoginFailedIncorrectUsernameCorrectPwBlankDob() {			
		Assert.assertEquals(LoginService.login("rp", "rahul_pass", ""), false);
	}
	
	
	@Test
	public void testLoginFailedIncorrectUsernameCorrectPwIncorrectDob() {			
		Assert.assertEquals(LoginService.login("rp", "rahul_pass", "1997-08-08"), false);
	}
	
	@Test
	public void testLoginFailedIncorrectUsernameIncorrectPwCorrectDob() {			
		Assert.assertEquals(LoginService.login("rp", "rahul_pass1", "1997-07-12"), false);
	}
	
	@Test
	public void testLoginFailedIncorrectUsernameIncorrectPwBlankDob() {			
		Assert.assertEquals(LoginService.login("rp", "rahul_pass1", ""), false);
	}
	
}
