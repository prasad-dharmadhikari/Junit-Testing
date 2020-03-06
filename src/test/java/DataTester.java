
import org.junit.Assert;
import org.junit.Test;

public class DataTester
{
    UserValidator validator = new UserValidator();
    String validEmails[]={"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
    String invalidEmails[]= {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com ","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
    boolean result=true;
    // Test case for validating first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        result = validator.validateFirstName("Prasad");
        Assert.assertEquals(true,result);
    }
    // Test case for validating last name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        result = validator.validateLastName("Dharmadhikari");
        Assert.assertEquals(true,result);
    }
    // Test case for validating email ID
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue()
    {
        for (String email : validEmails)
        {
            result = validator.validateEmailId(email);
            Assert.assertEquals(true, result);
        }
    }
    @Test
    public void givenEmailId_WhenImProper_ShouldReturnFalse()
    {
        for (String email : invalidEmails)
        {
            result = validator.validateEmailId(email);
            Assert.assertEquals(false, result);
        }
    }
    // Test case for validating mobile number
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        result = validator.validateMobileNumber("91 9823808498");
        Assert.assertEquals(true,result);
    }
    // Test case for validating password of minimum 8 characters
    @Test
    public void givenPassword_WhenHaveMinimumLengthOf8Characters_ShouldReturnTrue()
    {
        result = validator.isPasswordOfMinimum8Characters("3344fdsgyug");
        Assert.assertEquals(true,result);
    }
    // Test case for validating password of at least 1 uppercase character
    @Test
    public void givenPassword_WhenHaveAtLeastOneUpperCaseCharacter_ShouldReturnTrue()
    {
        result = validator.isPasswordOfMinimumUpperCaseCharacter("Prajdfghkgf");
        Assert.assertEquals(true,result);
    }
    // Test case for validating password of at least 1 numeric character
    @Test
    public void givenPassword_WhenHaveAtLeastOneNumericCharacter_ShouldReturnTrue()
    {
        result = validator.isPasswordOfMinimumOneNumericCharacter("Prajd5fghkgf");
        Assert.assertEquals(true,result);
    }
    // Test case for validating password of exactly one special character
    @Test
    public void givenPassword_WhenHaveExactlyOneSpecialCharacter_ShouldReturnTrue()
    {
        result = validator.isPasswordOfExactlyOneSpecialCharacter("Prasad97&P");
        Assert.assertEquals(true,result);
    }
    // Test case for validating password by combining all rules
    @Test
    public void givenPassword_WhenFollowsAllRules_ShouldReturnTrue()
    {
        result = validator.combineAllRulesForPassword("Prasad97&P");
        Assert.assertEquals(true,result);
    }
}