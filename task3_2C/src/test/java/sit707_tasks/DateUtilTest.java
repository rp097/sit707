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
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Rahul Prem";
		Assert.assertNotNull("Student name is ", studentName);
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
	
	/*
	 * Equivalence Class Test cases below
	 */
	
	/*
	 * D1: Day 1 to Day 28
	 */
	
	//Expected Previous
	
	@Test
	public void test2024June14ShouldDecrementToJune13() {
		DateUtil date = new DateUtil(14, 6, 2024);
        System.out.println("June14ShouldDecrementToJune13, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(13, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024July14ShouldDecrementToJuly13() {
		DateUtil date = new DateUtil(14, 7, 2024);
        System.out.println("July14ShouldDecrementToJuly13, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(13, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024Feb14ShouldDecrementToFeb13() {
		DateUtil date = new DateUtil(14, 2, 2024);
        System.out.println("Feb14ShouldDecrementToFeb13, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(13, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2023June14ShouldDecrementToJune13() {
		DateUtil date = new DateUtil(14, 6, 2023);
        System.out.println("June14ShouldDecrementToJune13, 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(13, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023July14ShouldDecrementToJuly13() {
		DateUtil date = new DateUtil(14, 7, 2023);
        System.out.println("July14ShouldDecrementToJuly13, 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(13, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023Feb14ShouldDecrementToFeb13() {
		DateUtil date = new DateUtil(14, 2, 2023);
        System.out.println("Feb14ShouldDecrementToFeb13, 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(13, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	//Expected Next
	
	@Test
	public void test2024June14ShouldIncrementToJune15() {
		DateUtil date = new DateUtil(14, 6, 2024);
        System.out.println("June14ShouldIncrementToJune15, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024July14ShouldIncrementToJuly15() {
		DateUtil date = new DateUtil(14, 7, 2024);
        System.out.println("July14ShouldIncrementToJuly15, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024Feb14ShouldIncrementToFeb15() {
		DateUtil date = new DateUtil(14, 2, 2024);
        System.out.println("Feb14ShouldIncrementToFeb15, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2023June14ShouldIncrementToJune15() {
		DateUtil date = new DateUtil(14, 6, 2023);
        System.out.println("June14ShouldIncrementToJune15, 2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023July14ShouldIncrementToJuly15() {
		DateUtil date = new DateUtil(14, 7, 2023);
        System.out.println("July14ShouldIncrementToJuly15, 2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023Feb14ShouldIncrementToFeb15() {
		DateUtil date = new DateUtil(14, 2, 2023);
        System.out.println("Feb14ShouldIncrementToFeb15, 2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(15, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
		
	
	/*
	 * D2: Day 29
	 */
	
	//Expected Previous
	
	@Test
	public void test2024June29ShouldDecrementToJune28() {
		DateUtil date = new DateUtil(29, 6, 2024);
        System.out.println("June29ShouldDecrementToJune28, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024July29ShouldDecrementToJuly28() {
		DateUtil date = new DateUtil(29, 7, 2024);
        System.out.println("July29ShouldDecrementToJuly28, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024Feb29ShouldDecrementToFeb28() {
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("Feb29ShouldDecrementToFeb28, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2023June29ShouldDecrementToJune28() {
		DateUtil date = new DateUtil(29, 6, 2023);
        System.out.println("June29ShouldDecrementToJune28, 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023July29ShouldDecrementToJuly28() {
		DateUtil date = new DateUtil(29, 7, 2023);
        System.out.println("July29ShouldDecrementToJuly28, 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023Feb29DecrementShouldBeInvalid() {
		DateUtil date = new DateUtil(29, 2, 2023);
        System.out.println("Feb29ShouldBeInvlaid > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertNotEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	//Expected Next
	
	@Test
	public void test2024June29ShouldIncrementToJune30() {
		DateUtil date = new DateUtil(29, 6, 2024);
        System.out.println("June29ShouldIncrementToJune30, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024July29ShouldIncrementToJuly30() {
		DateUtil date = new DateUtil(29, 7, 2024);
        System.out.println("July29ShouldIncrementToJuly30, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024Feb29ShouldIncrementToMar1() {
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("Feb29ShouldDecrementToMar1, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2023June29ShouldIncrementToJune30() {
		DateUtil date = new DateUtil(29, 6, 2023);
        System.out.println("June29ShouldIncrementToJune30, 2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023July29ShouldIncrementToJuly30() {
		DateUtil date = new DateUtil(29, 7, 2023);
        System.out.println("July29ShouldIncrementToJuly30, 2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023Feb29IncrementShouldBeInvalid() {
		DateUtil date = new DateUtil(29, 2, 2023);
        System.out.println("Feb29ShouldBeInvalid >" + date);
        date.increment();
        System.out.println(date);
        Assert.assertNotEquals(1, date.getDay());
        Assert.assertNotEquals(3, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
		
	
	/*
	 * D3: Day 30
	 */

	//Expected Previous
	
	@Test
	public void test2024June30ShouldDecrementToJune29() {
		DateUtil date = new DateUtil(30, 6, 2024);
        System.out.println("June30ShouldDecrementToJune29, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024July30ShouldDecrementToJuly29() {
		DateUtil date = new DateUtil(30, 7, 2024);
        System.out.println("July30ShouldDecrementToJuly29, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024Feb30DecrementShouldBeInvalid() {
		DateUtil date = new DateUtil(30, 2, 2024);
        System.out.println("Feb30ShouldBeInvalid > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertNotEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2023June30ShouldDecrementToJune29() {
		DateUtil date = new DateUtil(30, 6, 2023);
        System.out.println("June30ShouldDecrementToJune29, 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023July30ShouldDecrementToJuly29() {
		DateUtil date = new DateUtil(30, 7, 2023);
        System.out.println("July30ShouldDecrementToJuly29, 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023Feb30DecrementShouldBeInvalid() {
		DateUtil date = new DateUtil(30, 2, 2023);
        System.out.println("Feb29ShouldBeInvlaid > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertNotEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	//Expected Next
	
	@Test
	public void test2024June30ShouldIncrementToJuly1() {
		DateUtil date = new DateUtil(30, 6, 2024);
        System.out.println("June30ShouldIncrementToJuly1, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024July30ShouldIncrementToJuly31() {
		DateUtil date = new DateUtil(30, 7, 2024);
        System.out.println("July30ShouldIncrementToJuly31, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024Feb30IncrementShouldBeInvalid() {
		DateUtil date = new DateUtil(30, 2, 2024);
        System.out.println("Feb30ShouldBeInvalid > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertNotEquals(1, date.getDay());
        Assert.assertNotEquals(3, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2023June30ShouldIncrementToJuly1() {
		DateUtil date = new DateUtil(30, 6, 2023);
        System.out.println("June30ShouldIncrementToJuly1, 2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023July30ShouldIncrementToJuly31() {
		DateUtil date = new DateUtil(30, 7, 2023);
        System.out.println("July30ShouldIncrementToJuly31, 2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023Feb30IncrementShouldBeInvalid() {
		DateUtil date = new DateUtil(30, 2, 2023);
        System.out.println("Feb30ShouldBeInvalid >" + date);
        date.increment();
        System.out.println(date);
        Assert.assertNotEquals(1, date.getDay());
        Assert.assertNotEquals(3, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
		
	
	/*
	 * D4: Day 31
	 */

	@Test
	public void test2024June31DecrementShouldBeInvalid() {
		DateUtil date = new DateUtil(31, 6, 2024);
        System.out.println("June30ShouldDecrementShouldBeInvalid > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertNotEquals(30, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024July31ShouldDecrementToJuly30() {
		DateUtil date = new DateUtil(31, 7, 2024);
        System.out.println("July31ShouldDecrementToJuly30, 2024 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024Feb31DecrementShouldBeInvalid() {
		DateUtil date = new DateUtil(31, 2, 2024);
        System.out.println("Feb31ShouldBeInvalid > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertNotEquals(30, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2023DecrementJune31ShouldBeInvalid() {
		DateUtil date = new DateUtil(31, 6, 2023);
        System.out.println("June31ShouldBeInvalid > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertNotEquals(30, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023July31ShouldDecrementToJuly30() {
		DateUtil date = new DateUtil(31, 7, 2023);
        System.out.println("July31ShouldDecrementToJuly30, 2023 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023Feb31DecrementShouldBeInvalid() {
		DateUtil date = new DateUtil(31, 2, 2023);
        System.out.println("Feb29ShouldBeInvlaid > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertNotEquals(30, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	//Expected Next
	
	@Test
	public void test2024June31IncrementShouldBeInvalid() {
		DateUtil date = new DateUtil(31, 6, 2024);
        System.out.println("June30ShouldIncrementToJuly1, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024July31ShouldIncrementToAug1() {
		DateUtil date = new DateUtil(31, 7, 2024);
        System.out.println("July31ShouldIncrementToAug1, 2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2024Feb31IncrementShouldBeInvalid() {
		DateUtil date = new DateUtil(31, 2, 2024);
        System.out.println("Feb31ShouldBeInvalid > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertNotEquals(1, date.getDay());
        Assert.assertNotEquals(3, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void test2023June31IncrementShouldBeInvalid() {
		DateUtil date = new DateUtil(31, 6, 2023);
        System.out.println("June31ShouldBeInvalid > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertNotEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023July31ShouldIncrementToAug1() {
		DateUtil date = new DateUtil(31, 7, 2023);
        System.out.println("July31ShouldIncrementToAug1, 2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
	
	@Test
	public void test2023Feb31IncrementShouldBeInvalid() {
		DateUtil date = new DateUtil(31, 2, 2023);
        System.out.println("Feb31ShouldBeInvalid >" + date);
        date.increment();
        System.out.println(date);
        Assert.assertNotEquals(1, date.getDay());
        Assert.assertNotEquals(3, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
	}
		
	
	
}
