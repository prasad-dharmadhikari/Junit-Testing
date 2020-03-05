
import org.junit.Assert;
import org.junit.Test;

public class DataTester
{
    UserValidator validator = new UserValidator();
    // Test case for validating first name
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.validateFirstName("Prasad");
        Assert.assertEquals(true,result);
    }
    // Test case for validating first name
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.validateLastName("Dharmadhikari");
        Assert.assertEquals(true,result);
    }
}
