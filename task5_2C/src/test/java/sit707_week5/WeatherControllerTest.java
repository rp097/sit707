package sit707_week5;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WeatherControllerTest {

	private static WeatherController wController;
	private static int nHours;
	private static double hourly_temp[];
	
	//Creating a Before Class to run before all test cases
	//This BeforeClass is meant to initialize the weather controller instance, get the total hours 
	//and assign the randomly generated temperatures per hour.
	//NOTE - This will run just once. 
	@BeforeClass
    public static void initWeatherControllerTestInstance() {
        wController = WeatherController.getInstance();
        nHours = wController.getTotalHours();
        hourly_temp = new double[nHours];
        for (int i=0; i<nHours; i++) {
            hourly_temp[i] = wController.getTemperatureForHour(i + 1);
        }
    }
	
	//This After Class is meant to run after all the test cases run in order to deallocate the resources for the instance
	//NOTE - This function also runs just once
	@AfterClass
    public static void closeWeatherControllerTestInstance() {
        wController.close();
    }
	
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

//	@Test
//	public void testTemperatureMin() {
//		System.out.println("+++ testTemperatureMin +++");
//		double minTemperature = 1000;
//		for (int i=0; i<nHours; i++) {
//			// Hour range: 1 to nHours
//			double temperatureVal = wController.getTemperatureForHour(i+1); 
//			if (minTemperature > temperatureVal) {
//				minTemperature = temperatureVal;
//			}
//		}
//		
//		// Should be equal to the min value that is cached in the controller.
//		Assert.assertTrue(wController.getTemperatureMinFromCache() == minTemperature);
//	}
//	
//	@Test
//	public void testTemperatureMax() {
//		System.out.println("+++ testTemperatureMax +++");
//		double maxTemperature = -1;
//		for (int i=0; i<nHours; i++) {
//			// Hour range: 1 to nHours
//			double temperatureVal = wController.getTemperatureForHour(i+1); 
//			if (maxTemperature < temperatureVal) {
//				maxTemperature = temperatureVal;
//			}
//		}
//		
//		// Should be equal to the min value that is cached in the controller.
//		Assert.assertTrue(wController.getTemperatureMaxFromCache() == maxTemperature);
//		
//	}
//
//	@Test
//	public void testTemperatureAverage() {
//		System.out.println("+++ testTemperatureAverage +++");
//		
//		double sumTemp = 0;
//		for (int i=0; i<nHours; i++) {
//			// Hour range: 1 to nHours
//			double temperatureVal = wController.getTemperatureForHour(i+1); 
//			sumTemp += temperatureVal;
//		}
//		double averageTemp = sumTemp / nHours;
//		
//		// Should be equal to the min value that is cached in the controller.
//		Assert.assertTrue(wController.getTemperatureAverageFromCache() == averageTemp);
//	}
	
	@Test
	public void testTemperaturePersist() {
		System.out.println("+++ testTemperaturePersist +++");
		
		//Arrange
		WeatherController wController = WeatherController.getInstance();
		String now = new SimpleDateFormat("H:m:s").format(new Date());
		
		//Act
		String persistTime = wController.persistTemperature(10, 19.5);
		
		//Assert
		Assert.assertTrue(persistTime.equals(now));
		
		
		System.out.println("Persist time: " + persistTime + ", now: " + now);		
		wController.close();
	}
}
