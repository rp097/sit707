package sit707_week2;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args ) throws Exception
    {
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
        SeleniumOperations.bunnings_registration_page("https://www.bunnings.com.au/register");
    }
}
