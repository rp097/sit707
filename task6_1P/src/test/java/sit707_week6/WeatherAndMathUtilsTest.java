package sit707_week6;

import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
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
	
	//isEven() test cases
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(5));
	}
	
	@Test
	public void testTrueNumberIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(4));
	}
	
	//isPrime test cases
	
	@Test
	public void testTrueNumberIsPrime() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
	}
	
	@Test
	public void testFalseNumberIsPrime() {
		Assert.assertFalse(WeatherAndMathUtils.isPrime(8));
	}
	
	@Test
	public void testOneNumberIsPrime() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}
	
	//WeatherAdvice test cases
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testIllegalArgumentWindWeatherAdvice() {
    	assertThrows(IllegalArgumentException.class, () -> {
            WeatherAndMathUtils.weatherAdvice(-10.0, 10.0);
        });
    }
    
    @Test
    public void testIllegalArgumentPreciWeatherAdvice() {
    	assertThrows(IllegalArgumentException.class, () -> {
            WeatherAndMathUtils.weatherAdvice(10.0, -10.0);
        });
    }
    
    @Test
    public void testCancelDangerousRainfallWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(32.0, 6.1));
    }
    
    @Test
    public void testCancelDangerousWindSpeedDangerousRainfallWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 6.1));
    }
    
    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 1.0));
    }
    
    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 2.0));
    }
    
    //Test sumOfNNumbers() 
    @Test
    public void testSumOfNNumbers() {
        Assert.assertEquals(6, SumNCheck.sumOfNNumbers(3));
    }
    
    @Test
    public void testZeroSumOfNNumbers() {
        Assert.assertEquals(0, SumNCheck.sumOfNNumbers(0));
    }
    
    @Test
    public void testTrueCheckPositive() {
        Assert.assertTrue(SumNCheck.checkPositive(3));
    }
    
    @Test
    public void testFalseCheckPositive() {
        Assert.assertFalse(SumNCheck.checkPositive(-5));
    }
    
    @Test
    public void testZeroCheckPositive() {
        Assert.assertTrue(SumNCheck.checkPositive(0));
    }


    
}
