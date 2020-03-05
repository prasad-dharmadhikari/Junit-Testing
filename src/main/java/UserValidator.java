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
    // Method for validating first name using Regex
    public boolean validateLastName(String lastName)
    {
        String patternForLastName="^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternForLastName);
        Matcher matcher = p.matcher(lastName);
        return matcher.matches();
    }
}
