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
	    //1B
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
	    //2B
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
	    //3B
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
	    //4B
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
	    //5B
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
	    //6B
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
	    //7B
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
	    //8B
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
	    //9B
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
	    //10B
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
	    //11B
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
	    //12B
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
	    //13B
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("june15ShouldIncrementToJune16 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	//March Test Cases
	
		@Test
		public void testMaxMarch31ShouldIncrementToApril1() {
		    // March max boundary area: max+1
		    DateUtil date = new DateUtil(31, 3, 2024);
		    System.out.println("march31ShouldIncrementToApril1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(4, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxMarch31ShouldDecrementToMarch30() {
		    // March max boundary area: max-1
		    DateUtil date = new DateUtil(31, 3, 2024);
		    System.out.println("march31ShouldDecrementToMarch30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(3, date.getMonth());
		}

		@Test
		public void testNominalMarch() {
		    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		    DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
		    System.out.println("testMarchNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		
		@Test
		public void testMinMarch1ShouldIncrementToMarch2() {
		    // March min boundary area: min+1
		    DateUtil date = new DateUtil(1, 3, 2024);
		    System.out.println("march1ShouldIncrementToMarch2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(3, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinMarch1ShouldDecrementToFebruary29() {
		    // March min boundary area: min-1
		    DateUtil date = new DateUtil(1, 3, 2024);
		    System.out.println("march1ShouldDecrementToFebruary29 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(29, date.getDay());
		    Assert.assertEquals(2, date.getMonth());
		}
		
		//April Test cases

		@Test
		public void testMaxApril30ShouldIncrementToMay1() {
		    // April max boundary area: max+1
		    DateUtil date = new DateUtil(30, 4, 2024);
		    System.out.println("april30ShouldIncrementToMay1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(5, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxApril30ShouldDecrementToApril29() {
		    // April max boundary area: max-1
		    DateUtil date = new DateUtil(30, 4, 2024);
		    System.out.println("april30ShouldDecrementToApril29 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(29, date.getDay());
		    Assert.assertEquals(4, date.getMonth());
		}

		@Test
		public void testNominalApril() {
		    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		    DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
		    System.out.println("testAprilNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		@Test
		public void testMinApril1ShouldIncrementToApril2() {
		    // April min boundary area: min+1
		    DateUtil date = new DateUtil(1, 4, 2024);
		    System.out.println("april1ShouldIncrementToApril2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(4, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinApril1ShouldDecrementToMarch31() {
		    // April min boundary area: min-1
		    DateUtil date = new DateUtil(1, 4, 2024);
		    System.out.println("april1ShouldDecrementToMarch31 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(31, date.getDay());
		    Assert.assertEquals(3, date.getMonth());
		}
		
		
		//May Test cases
		
		@Test
		public void testMaxMay31ShouldIncrementToJune1() {
		    // May max boundary area: max+1
		    DateUtil date = new DateUtil(31, 5, 2024);
		    System.out.println("may31ShouldIncrementToJune1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(6, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxMay31ShouldDecrementToMay30() {
		    // May max boundary area: max-1
		    DateUtil date = new DateUtil(31, 5, 2024);
		    System.out.println("may31ShouldDecrementToMay30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(5, date.getMonth());
		}

		@Test
		public void testNominalMay() {
		    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		    DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
		    System.out.println("testMayNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		

		@Test
		public void testMinMay1ShouldIncrementToMay2() {
		    // May min boundary area: min+1
		    DateUtil date = new DateUtil(1, 5, 2024);
		    System.out.println("may1ShouldIncrementToMay2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(5, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinMay1ShouldDecrementToApril30() {
		    // May min boundary area: min-1
		    DateUtil date = new DateUtil(1, 5, 2024);
		    System.out.println("may1ShouldDecrementToApril30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(4, date.getMonth());
		}

		
		//June Test Cases
		
		@Test
		public void testMaxJune30ShouldIncrementToJuly1() {
		    // June max boundary area: max+1
		    DateUtil date = new DateUtil(30, 6, 2024);
		    System.out.println("june30ShouldIncrementToJuly1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(7, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxJune30ShouldDecrementToJune29_2024() {
		    // June max boundary area: max-1
		    DateUtil date = new DateUtil(30, 6, 2024);
		    System.out.println("june30ShouldDecrementToJune29 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(29, date.getDay());
		    Assert.assertEquals(6, date.getMonth());
		}

		@Test
		public void testNominalJune() {
		    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		    DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
		    System.out.println("testJuneNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		@Test
		public void testMinJune1ShouldIncrementToJune2_2024() {
		    // June min boundary area: min+1
		    DateUtil date = new DateUtil(1, 6, 2024);
		    System.out.println("june1ShouldIncrementToJune2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(6, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinJune1ShouldDecrementToMay31() {
		    // June min boundary area: min-1
		    DateUtil date = new DateUtil(1, 6, 2024);
		    System.out.println("june1ShouldDecrementToMay31 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(31, date.getDay());
		    Assert.assertEquals(5, date.getMonth());
		}
		
		// July test cases
		
		@Test
		public void testMaxJuly31ShouldIncrementToAugust1() {
		    // July max boundary area: max+1
		    DateUtil date = new DateUtil(31, 7, 2024);
		    System.out.println("july31ShouldIncrementToAugust1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(8, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxJuly31ShouldDecrementToJuly30() {
		    // July max boundary area: max-1
		    DateUtil date = new DateUtil(31, 7, 2024);
		    System.out.println("july31ShouldDecrementToJuly30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(7, date.getMonth());
		}

		@Test
		public void testNominalJuly() {
		    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		    DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
		    System.out.println("testJulyNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		

		@Test
		public void testMinJuly1ShouldIncrementToJuly2() {
		    // July min boundary area: min+1
		    DateUtil date = new DateUtil(1, 7, 2024);
		    System.out.println("july1ShouldIncrementToJuly2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(7, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinJuly1ShouldDecrementToJune30() {
		    // July min boundary area: min-1
		    DateUtil date = new DateUtil(1, 7, 2024);
		    System.out.println("july1ShouldDecrementToJune30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(6, date.getMonth());
		}

		
		//August test cases
		
		@Test
		public void testMaxAugust31ShouldIncrementToSeptember1() {
		    // August max boundary area: max+1
		    DateUtil date = new DateUtil(31, 8, 2024);
		    System.out.println("august31ShouldIncrementToSeptember1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(9, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxAugust31ShouldDecrementToAugust30() {
		    // August max boundary area: max-1
		    DateUtil date = new DateUtil(31, 8, 2024);
		    System.out.println("august31ShouldDecrementToAugust30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(8, date.getMonth());
		}

		@Test
		public void testNominalAugust() {
		    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		    DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
		    System.out.println("testAugustNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		@Test
		public void testMinAugust1ShouldIncrementToAugust2() {
		    // August min boundary area: min+1
		    DateUtil date = new DateUtil(1, 8, 2024);
		    System.out.println("august1ShouldIncrementToAugust2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(8, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinAugust1ShouldDecrementToJuly31() {
		    // August min boundary area: min-1
		    DateUtil date = new DateUtil(1, 8, 2024);
		    System.out.println("august1ShouldDecrementToJuly31 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(31, date.getDay());
		    Assert.assertEquals(7, date.getMonth());
		}
		
		
		//September Test Cases
		
		@Test
		public void testMaxSeptember30ShouldIncrementToOctober1() {
		    // September max boundary area: max+1
		    DateUtil date = new DateUtil(30, 9, 2024);
		    System.out.println("september30ShouldIncrementToOctober1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(10, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxSeptember30ShouldDecrementToSeptember29() {
		    // September max boundary area: max-1
		    DateUtil date = new DateUtil(30, 9, 2024);
		    System.out.println("september30ShouldDecrementToSeptember29 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(29, date.getDay());
		    Assert.assertEquals(9, date.getMonth());
		}

		@Test
		public void testNominalSeptember() {
		    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		    DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
		    System.out.println("testSeptemberNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		@Test
		public void testMinSeptember1ShouldIncrementToSeptember2() {
		    // September min boundary area: min+1
		    DateUtil date = new DateUtil(1, 9, 2024);
		    System.out.println("september1ShouldIncrementToSeptember2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(9, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinSeptember1ShouldDecrementToAugust31() {
		    // September min boundary area: min-1
		    DateUtil date = new DateUtil(1, 9, 2024);
		    System.out.println("september1ShouldDecrementToAugust31 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(31, date.getDay());
		    Assert.assertEquals(8, date.getMonth());
		}
		
		//October Test Cases

		@Test
		public void testMaxOctober31ShouldIncrementToNovember1() {
		    // October max boundary area: max+1
		    DateUtil date = new DateUtil(31, 10, 2024);
		    System.out.println("october31ShouldIncrementToNovember1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(11, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxOctober31ShouldDecrementToOctober30() {
		    // October max boundary area: max-1
		    DateUtil date = new DateUtil(31, 10, 2024);
		    System.out.println("october31ShouldDecrementToOctober30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(10, date.getMonth());
		}

		@Test
		public void testNominalOctober() {
		    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		    DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
		    System.out.println("testOctoberNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		@Test
		public void testMinOctober1ShouldIncrementToOctober2() {
		    // October min boundary area: min+1
		    DateUtil date = new DateUtil(1, 10, 2024);
		    System.out.println("october1ShouldIncrementToOctober2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(10, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinOctober1ShouldDecrementToSeptember30() {
		    // October min boundary area: min-1
		    DateUtil date = new DateUtil(1, 10, 2024);
		    System.out.println("october1ShouldDecrementToSeptember30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(9, date.getMonth());
		}
		
		//November Test Cases

		@Test
		public void testMaxNovember30ShouldIncrementToDecember1() {
		    // November max boundary area: max+1
		    DateUtil date = new DateUtil(30, 11, 2024);
		    System.out.println("november30ShouldIncrementToDecember1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(12, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		}

		@Test
		public void testMaxNovember30ShouldDecrementToNovember29() {
		    // November max boundary area: max-1
		    DateUtil date = new DateUtil(30, 11, 2024);
		    System.out.println("november30ShouldDecrementToNovember29 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(29, date.getDay());
		    Assert.assertEquals(11, date.getMonth());
		}

		@Test
		public void testNominalNovember() {
		    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		    DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
		    System.out.println("testNovemberNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		@Test
		public void testMinNovember1ShouldIncrementToNovember2() {
		    // November min boundary area: min+1
		    DateUtil date = new DateUtil(1, 11, 2024);
		    System.out.println("november1ShouldIncrementToNovember2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(11, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinNovember1ShouldDecrementToOctober31() {
		    // November min boundary area: min-1
		    DateUtil date = new DateUtil(1, 11, 2024);
		    System.out.println("november1ShouldDecrementToOctober31 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(31, date.getDay());
		    Assert.assertEquals(10, date.getMonth());
		}

		//December Test Cases
		
		@Test
		public void testMaxDecember31ShouldIncrementToJanuary1() {
		    // December max boundary area: max+1
		    DateUtil date = new DateUtil(31, 12, 2024);
		    System.out.println("december31ShouldIncrementToJanuary1 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(1, date.getMonth());
		    Assert.assertEquals(1, date.getDay());
		    Assert.assertEquals(2025, date.getYear()); //Check new year condition
		}

		@Test
		public void testMaxDecember31ShouldDecrementToDecember30() {
		    // December max boundary area: max-1
		    DateUtil date = new DateUtil(31, 12, 2024);
		    System.out.println("december31ShouldDecrementToDecember30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(12, date.getMonth());
		}

		@Test
		public void testNominalDecember() {
		    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		    DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
		    System.out.println("testDecemberNominal > " + date);
		    date.increment();
		    System.out.println(date);
		}

		@Test
		public void testMinDecember1ShouldIncrementToDecember2() {
		    // December min boundary area: min+1
		    DateUtil date = new DateUtil(1, 12, 2024);
		    System.out.println("december1ShouldIncrementToDecember2 > " + date);
		    date.increment();
		    System.out.println(date);
		    Assert.assertEquals(12, date.getMonth());
		    Assert.assertEquals(2, date.getDay());
		}

		@Test
		public void testMinDecember1ShouldDecrementToNovember30() {
		    // December min boundary area: min-1
		    DateUtil date = new DateUtil(1, 12, 2024);
		    System.out.println("december1ShouldDecrementToNovember30 > " + date);
		    date.decrement();
		    System.out.println(date);
		    Assert.assertEquals(30, date.getDay());
		    Assert.assertEquals(11, date.getMonth());
		}
	
}
