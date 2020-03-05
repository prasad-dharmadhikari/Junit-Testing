import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator
{
    // Method for validating first name using Regex
    public boolean validateFirstName(String firstName)
    {
        String patternForFirstName="^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternForFirstName);
        Matcher matcher = p.matcher(firstName);
        return matcher.matches();
    }
    // Method for validating last name using Regex
    public boolean validateLastName(String lastName)
    {
        String patternForLastName="^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternForLastName);
        Matcher matcher = p.matcher(lastName);
        return matcher.matches();
    }
    // Method for validating email ID using Regex
    public boolean validateEmailId(String emailId)
    {
        String patternForEmailId="^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$";
        Pattern p = Pattern.compile(patternForEmailId);
        Matcher matcher = p.matcher(emailId);
        return matcher.matches();
    }
}