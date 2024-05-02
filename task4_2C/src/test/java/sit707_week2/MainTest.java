package sit707_week2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Ahsan Habib
 */
public class MainTest {
	
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
	
	@Test
	public void testLoginFailedIncorrectEmailIncorrectPw() {		
		String u = SeleniumOperations.bunnings_login_page("rp@gmail.com","rp123");
		Assert.assertEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}
	
	@Test
	public void testLoginSuccessCorrectEmailCorrectPw() {
		String u = SeleniumOperations.bunnings_login_page("rahulprem90@gmail.com","DeakinTest123#");
		Assert.assertNotEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}
	
	@Test
	public void testLoginFailedBlankEmailBlankPw() {
		String u = SeleniumOperations.bunnings_login_page("","");
		Assert.assertEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}
	
	@Test
	public void testLoginFailedBlankEmailIncorrectPw() {
		String u = SeleniumOperations.bunnings_login_page("","rp123");
		Assert.assertEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}
	
	@Test
	public void testLoginFailedBlankEmailCorrectPw() {
		String u = SeleniumOperations.bunnings_login_page("","DeakinTest123#");
		Assert.assertEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}
	
	@Test
	public void testLoginFailedIncorrectEmailBlankPw() {
		String u = SeleniumOperations.bunnings_login_page("test@gmail","");
		Assert.assertEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}
	
	@Test
	public void testLoginFailedCorrectEmailBlankPw() {
		String u = SeleniumOperations.bunnings_login_page("rahulprem90@gmail.com","");
		Assert.assertEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}
	
	@Test
	public void testLoginFailedIncorrectEmailCorrectPw() {
		String u = SeleniumOperations.bunnings_login_page("rahul@gmail.com","DeakinTest123#");
		Assert.assertEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}
	
	@Test
	public void testLoginFailedCorrectEmailIncorrectPw() {
		String u = SeleniumOperations.bunnings_login_page("rahulprem90@gmail.com","Test123#");
		Assert.assertEquals(u, "https://www.bunnings.com.au/login?redirectUri=https%3A%2F%2Flogin.bunnings.com.au%2Foauth2%2Fv1%2Fauthorize%2Fredirect%3Fokta_key%3DwryEGhWj8LARPnzpbDXSsRcBxa3JJKt1dMM8IPO4IKk");
	}


}
