
import org.junit.Assert;
import org.junit.Test;

public class DataTester
{
    UserValidator validator = new UserValidator();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        boolean result = validator.validateFirstName("Prasad");
        Assert.assertEquals(true,result);
    }
}
