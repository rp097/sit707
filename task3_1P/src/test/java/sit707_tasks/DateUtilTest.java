package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "222606849";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Rahul Prem";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// January min boundary area: min+1
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("january1ShouldIncrementToJanuary2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// January min boundary area: min-1
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("january1ShouldDecrementToDecember31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(31, date.getDay());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	
	//Extra tests for February to show leap year test cases
	
	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {
		// February max boundary area: max+1
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("february29ShouldIncrementToMarch1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxFebruary29ShouldDecrementToFebruary28() {
		// February max boundary area: max-1
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
	}
	
	
	@Test
	public void testMinFebruary28LeapDuringYearShouldIncrementToFebruary29() {
	    // February min boundary area with leap year: min+1
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("february28DuringLeapYearShouldIncrementToFebruary29 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay()); //Checking the leap year condition
	    Assert.assertEquals(2, date.getMonth());
	}

	@Test
	public void testMinFebruary28DuringLeapYearShouldDecrementToFebruary27() {
	    // February min boundary area with leap year: min-1
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("february28DuringLeapYearShouldDecrementToFebruary27 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(27, date.getDay()); //Checking the leap year condition
	    Assert.assertEquals(2, date.getMonth());
	}
	
	
	@Test
	public void testNominalFebruary() {
		int rand_day_1_to_29 = 1 + new Random().nextInt(29);
        DateUtil date = new DateUtil(rand_day_1_to_29, 2, 2024);
        System.out.println("testFebruaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	
	@Test
	public void testMinFebruary1ShouldIncrementToFebruary2() {
		// February min boundary area: min+1
		DateUtil date = new DateUtil(1, 2, 2024);
		System.out.println("february1ShouldIncrementToFebruary2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(2, date.getDay());
	}
	
	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {
		// February min boundary area: min-1
		DateUtil date = new DateUtil(1, 2, 2024);
		System.out.println("february1ShouldDecrementToJanuary31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(31, date.getDay());
	}

	
	//Filling in the test cases for Expected previous
	
	@Test
	public void testMaxJune1ShouldDecrementToMay31() {
	    //1A
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("june1ShouldDecrementToMay31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testMinJune2ShouldDecrementToJune1() {
	    //2A
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("june2ShouldDecrementToJune1 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNominalJune15ShouldDecrementToJune14() {
	    //3A
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("june15ShouldDecrementToJune14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
	    //4A
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("june30ShouldDecrementToJune29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testMaxJune31ShouldDecrementToJune30() {
	    //5A - this test should fail
	    DateUtil date = new DateUtil(31, 6, 1994);
	    System.out.println("minJune31ShouldDecrementToJune30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNominalJanuary15ShouldDecrementToJanuary14() {
	    //6A
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("minJanuary15ShouldDecrementToJanuary14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMinFebruary15ShouldDecrementToFebruary14() {
	    // Test case ID: 7A
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("minFebruary15ShouldDecrementToFebruary14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testMaxNovember15ShouldDecrementToNovember14() {
	    // Test case ID: 8A
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("minNovember15ShouldDecrementToNovember14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMaxDecember15ShouldDecrementToDecember14() {
	    // Test case ID: 9A
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("minDecember15ShouldDecrementToDecember14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testMinJune15ShouldDecrementToJune14Year1700() {
	    // Test case ID: 10A
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("minJune15ShouldDecrementToJune14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void testMinJune15ShouldDecrementToJune14Yea1701() {
	    // Test case ID: 11A
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("minJune15ShouldDecrementToJune14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void testMaxJune15ShouldDecrementToJune14Year2023() {
	    //12A
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("minJune15ShouldDecrementToJune14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testMaxJune15ShouldDecrementToJune14Year2024() {
	    //13A
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("minJune15ShouldDecrementToJune14 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(14, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	//Test cases for Expected Next 
	
	@Test
	public void testMinJune1ShouldIncrementToJune2() {
	    //1A
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("june1ShouldIncrementToJune2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testMinJune2ShouldIncrementToJune3() {
	    //2A
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("june2ShouldIncrementToJune3 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testMinJune15ShouldIncrementToJune16() {
	    //3A
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testMinJune30ShouldIncrementToJuly1() {
	    //4A
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMinJune31IncrementShouldBeInvalid() {
	    //5A
	    DateUtil date = new DateUtil(31, 6, 1994);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMinJanuary15ShouldIncrementToJanuary16() {
	    //6A
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMinFebruary15ShouldIncrementToFebruary16() {
	    //7A
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMaxNovember15ShouldIncrementToNovember16() {
	    //8A
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMaxDecember15ShouldIncrementToDecember16() {
	    //9A
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testMinJune15ShouldIncrementToJune16Year1700() {
	    //10A
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}
	
	@Test
	public void testMinJune15ShouldIncrementToJune16Year1701() {
	    //11A
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}
	
	@Test
	public void testMaxJune15ShouldIncrementToJune16Year2023() {
	    //12A
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void testMaxJune15ShouldIncrementToJune16Year2024() {
	    //13A
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
}
