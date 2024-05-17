package web.service;

public class MathQuestionService {

	/**
	 * Calculate Q1 result.
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static double q1Addition(String number1, String number2) {
//	    if (number1.isEmpty() || number2.isEmpty()) {
//	        return (Double) null; 
//	    }
		boolean isValid = validateNumbers(number1, number2);
	    if (isValid == false || number1 == null || number1.isEmpty() || number2 == null || number2.isEmpty()) {
	        throw new IllegalArgumentException("Input numbers cannot be empty, null or non-numeric values");
	    }
		double result = Double.valueOf(number1) + Double.valueOf(number2);
		return result;
	}
	
	/**
	 * Calculate Q2 result.
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static double q2Subtraction(String number1, String number2) {
//	    if (number1.isEmpty() || number2.isEmpty()) {
//	        return (Double) null; 
//	    }
		
		boolean isValid = validateNumbers(number1, number2);
	    if (isValid == false || number1 == null || number1.isEmpty() || number2 == null || number2.isEmpty()) {
	        throw new IllegalArgumentException("Input numbers cannot be empty, null or non-numeric values");
	    }
		double result = Double.valueOf(number1) - Double.valueOf(number2);
		return result;
	}
	
	/**
	 * Calculate Q3 result.
	 * @param number1
	 * @param number2
	 * @return
	 */
	public static double q3Multiplication(String number1, String number2) {
//	    if (number1.isEmpty() || number2.isEmpty()) {
//	        return Double.NaN; 
//	    }
		boolean isValid = validateNumbers(number1, number2);
	    if (isValid == false || number1 == null || number1.isEmpty() || number2 == null || number2.isEmpty()) {
	        throw new IllegalArgumentException("Input numbers cannot be empty, null or non-numeric values");
	    }
		double result = Double.valueOf(number1) * Double.valueOf(number2);
		return result;
	}
	
	private static boolean validateNumbers(String n1, String n2) {
		boolean isValid = false;
		try {
			Double.valueOf(n1);
			Double.valueOf(n2);
			isValid = true;
	    } 
		catch (NumberFormatException e) {
	        isValid = false;
	    }
		return isValid;
		
	}
}
