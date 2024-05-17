package web.service;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {

	//Q1 Addition
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdditionBlankNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q1Addition("", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdditionBlankNumber1ValidNumber2() {
		Assert.assertNull(MathQuestionService.q1Addition("", "2"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdditionValidNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q1Addition("3", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdditionInvalidNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q1Addition("a", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdditionBlankNumber1InvalidNumber2() {
		Assert.assertNull(MathQuestionService.q1Addition("", "a"));
	}

	@Test
	public void testAdditionValidPositiveNumber1ValidPositiveNumber2() {
		Assert.assertEquals(MathQuestionService.q1Addition("2", "3"),5,0);
	}
	
	@Test
	public void testAdditionValidNegativeNumber1ValidPositiveNumber2() {
		Assert.assertEquals(MathQuestionService.q1Addition("-2", "3"),1,0);
	}
	
	@Test
	public void testAdditionValidPositiveNumber1ValidNegativeNumber2() {
		Assert.assertEquals(MathQuestionService.q1Addition("2", "-3"),-1,0);
	}
	
	@Test
	public void testAdditionValidNegativeNumber1ValidNegativeNumber2() {
		Assert.assertEquals(MathQuestionService.q1Addition("-2", "-3"),-5,0);
	}
	
	//Q2 Subtraction
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractionBlankNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q2Subtraction("", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractionBlankNumber1ValidNumber2() {
		Assert.assertNull(MathQuestionService.q2Subtraction("", "2"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractionValidNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q2Subtraction("3", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractionInvalidNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q2Subtraction("a", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractionBlankNumber1InvalidNumber2() {
		Assert.assertNull(MathQuestionService.q2Subtraction("", "a"));
	}

	@Test
	public void testSubtractionValidPositiveNumber1ValidPositiveNumber2() {
		Assert.assertEquals(MathQuestionService.q2Subtraction("6", "3"),3,0);
	}
	
	@Test
	public void testSubtractionValidNegativeNumber1ValidPositiveNumber2() {
		Assert.assertEquals(MathQuestionService.q2Subtraction("-6", "3"),-9,0);
	}
	
	@Test
	public void testSubtractionValidPositiveNumber1ValidNegativeNumber2() {
		Assert.assertEquals(MathQuestionService.q2Subtraction("6", "-3"),9,0);
	}
	
	@Test
	public void testSubtractionValidNegativeNumber1ValidNegativeNumber2() {
		Assert.assertEquals(MathQuestionService.q2Subtraction("-6", "-3"),-3,0);
	}
	
	//Q3
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplicationBlankNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q3Multiplication("", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplicationBlankNumber1ValidNumber2() {
		Assert.assertNull(MathQuestionService.q3Multiplication("", "2"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplicationValidNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q3Multiplication("3", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplicationInvalidNumber1BlankNumber2() {
		Assert.assertNull(MathQuestionService.q3Multiplication("a", ""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplicationBlankNumber1InvalidNumber2() {
		Assert.assertNull(MathQuestionService.q3Multiplication("", "a"));
	}

	@Test
	public void testMultiplicationValidPositiveNumber1ValidPositiveNumber2() {
		Assert.assertEquals(MathQuestionService.q3Multiplication("2", "3"),6,0);
	}
	
	@Test
	public void testMultiplicationValidNegativeNumber1ValidPositiveNumber2() {
		Assert.assertEquals(MathQuestionService.q3Multiplication("-2", "3"),-6,0);
	}
	
	@Test
	public void testMultiplicationValidPositiveNumber1ValidNegativeNumber2() {
		Assert.assertEquals(MathQuestionService.q3Multiplication("2", "-3"),-6,0);
	}
	
	@Test
	public void testMultiplicationValidNegativeNumber1ValidNegativeNumber2() {
		Assert.assertEquals(MathQuestionService.q3Multiplication("-2", "-3"),6,0);
	}
	
	
}
