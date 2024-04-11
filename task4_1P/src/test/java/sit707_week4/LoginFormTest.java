package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "222606849";
		Assert.assertNotNull("Student ID is", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Rahul Prem";
		Assert.assertNotNull("Student name is", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("[Empty username, empty password] >> " + status);
    }
	
	/*
	 * Write more test functions below.
	 */
	
	@Test
    public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, "pass123");
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("[Empty username, wrong password] >> " + status);
    }
	
	@Test
    public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, "rahul_pass");
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("[Empty username, correct password] >> " + status);
    }
	
	@Test
    public void testFailWrongUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("rahul prem", null);
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("[Wrong username, empty password] >> " + status);
    }
	
	@Test
    public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("rahul prem", "pass234");
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("[Wrong username, wrong password] >> " + status);
    }	
	
	@Test
    public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("rahul prem", "rahul_pass");
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("[Wrong username, correct password] >> " + status);
    }	
	
	@Test
    public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("rahul", null);
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("[Correct username, empty password] >> " + status);
    }	
	
	@Test
    public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login("rahul", "pass456");
		Assert.assertTrue( status.isLoginSuccess() == false );
		System.out.println("[Correct username, wrong password] >> " + status);
    }	
	
	@Test
    public void testFailCorrectUsernameAndCorrectPasswordAndEmptyValCode()
    {
		LoginStatus status = LoginForm.login("rahul", "rahul_pass");
		Assert.assertTrue( status.isLoginSuccess() == true && LoginForm.validateCode(null) == false);
		System.out.println("[Correct username, correct password] >> " + status);
		System.out.println("\tEmpty code >> " + LoginForm.validateCode(null));
    }	
	
	@Test
    public void testFailCorrectUsernameAndCorrectPasswordAndWrongValCode()
    {
		LoginStatus status = LoginForm.login("rahul", "rahul_pass");
		Assert.assertTrue( status.isLoginSuccess() == true && LoginForm.validateCode("123") == false);
		System.out.println("[Correct username, correct password] >> " + status);
		System.out.println("\tWrong code >> " + LoginForm.validateCode("123"));
    }	
	
	@Test
    public void testFailCorrectUsernameAndCorrectPasswordAndCorrectValCode()
    {
		LoginStatus status = LoginForm.login("rahul", "rahul_pass");
		Assert.assertTrue( status.isLoginSuccess() == true && LoginForm.validateCode("1997") == true);
		System.out.println("[Correct username, correct password] >> " + status);
		System.out.println("\tCorrect code >> " + LoginForm.validateCode("1997"));
    }	
	
}
