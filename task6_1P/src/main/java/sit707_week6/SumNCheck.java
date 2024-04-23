package sit707_week6;

public class SumNCheck {
	
	public static int sumOfNNumbers(int n) {
        int s = 0;
        int s1=0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        s1 = s;
        return s;
    }
    
    public static boolean checkPositive(int num) {
        if(num > 0)
        	return true;
        else if(num == 0)
        	return true;
        else
        	return false;
    }
	
}
