package sit707_week7;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class BodyTemperatureMonitorTest {

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
	public void testReadTemperatureNegative() {
        TemperatureSensor temperatureSensor = Mockito.mock(TemperatureSensor.class); //mock TemperatureSensor
        Mockito.when(temperatureSensor.readTemperatureValue()).thenReturn(-1.0); //stub the mock
        
        BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(temperatureSensor, null, null);
        Assert.assertTrue(bodyTemperatureMonitor.readTemperature() < 0);
	}
	
	@Test
	public void testReadTemperatureZero() {
        TemperatureSensor temperatureSensor = Mockito.mock(TemperatureSensor.class); //mock TemperatureSensor
        Mockito.when(temperatureSensor.readTemperatureValue()).thenReturn(0.0); //stub the mock
        
        BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(temperatureSensor, null, null);
        Assert.assertTrue(bodyTemperatureMonitor.readTemperature() == 0);
	}
	
	@Test
	public void testReadTemperatureNormal() {
        TemperatureSensor temperatureSensor = Mockito.mock(TemperatureSensor.class); //mock TemperatureSensor
        Mockito.when(temperatureSensor.readTemperatureValue()).thenReturn(36.0); //stub the mock
        
        BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(temperatureSensor, null, null);
        Assert.assertTrue(bodyTemperatureMonitor.readTemperature() >= 35.0 || bodyTemperatureMonitor.readTemperature() <= 37.0);
	}

	@Test
	public void testReadTemperatureAbnormallyHigh() {
        TemperatureSensor temperatureSensor = Mockito.mock(TemperatureSensor.class); //mock TemperatureSensor
        Mockito.when(temperatureSensor.readTemperatureValue()).thenReturn(1064.0); //stub the mock
        
        BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(temperatureSensor, null, null);
        Assert.assertTrue(bodyTemperatureMonitor.readTemperature() > 100.0);
	}

	/*
	 * CREDIT or above level students, Remove comments. 
	 */
	@Test
	public void testReportTemperatureReadingToCloud() {
		// Mock reportTemperatureReadingToCloud() calls cloudService.sendTemperatureToCloud()
        CloudService cloudServiceMock = Mockito.mock(CloudService.class);
        TemperatureReading temperatureReading = new TemperatureReading();


        BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(null, cloudServiceMock, null);
        bodyTemperatureMonitor.reportTemperatureReadingToCloud(temperatureReading);

        Mockito.verify(cloudServiceMock, Mockito.times(1)).sendTemperatureToCloud(temperatureReading);
	}
	
	
	
	/*
	 * CREDIT or above level students, Remove comments. 
	 */
	@Test
	public void testInquireBodyStatusNormalNotification() {
        CloudService cloudService = Mockito.mock(CloudService.class);
        NotificationSender notificationSender = Mockito.mock(NotificationSender.class);

        Mockito.when(cloudService.queryCustomerBodyStatus(Mockito.any(Customer.class))).thenReturn("NORMAL");


        BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(Mockito.mock(TemperatureSensor.class),cloudService,notificationSender);


        bodyTemperatureMonitor.inquireBodyStatus();
        Mockito.verify(notificationSender).sendEmailNotification(Mockito.any(Customer.class), Mockito.anyString());
	}
	
	
	/*
	 * CREDIT or above level students, Remove comments. 
	 */
	@Test
	public void testInquireBodyStatusAbnormalNotification() {
        CloudService cloudService = Mockito.mock(CloudService.class);
        NotificationSender notificationSender = Mockito.mock(NotificationSender.class);

        Mockito.when(cloudService.queryCustomerBodyStatus(Mockito.any(Customer.class))).thenReturn("ABNORMAL");


        BodyTemperatureMonitor bodyTemperatureMonitor = new BodyTemperatureMonitor(Mockito.mock(TemperatureSensor.class),cloudService,notificationSender);


        bodyTemperatureMonitor.inquireBodyStatus();
        Mockito.verify(notificationSender).sendEmailNotification(Mockito.any(FamilyDoctor.class), Mockito.anyString());
	}
}
