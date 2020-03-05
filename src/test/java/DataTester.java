
import org.junit.Assert;
import org.junit.Test;

public class DataTester
{
    UserValidator validator = new UserValidator();
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
        result = validator.validateEmailId("abc@yahoo.com");
        Assert.assertEquals(true,result);
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
}