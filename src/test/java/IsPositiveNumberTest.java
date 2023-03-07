import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumber_MoreThanZero_HappyPath() {
        // arrange
        int a = 555;
        boolean expectedResult = true;

        // act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsPositiveNumber_BelowZero_HappyPath() {
        // arrange
        int a = -555;
        boolean expectedResult = false;

        // act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIsPositiveNumber_Zero_HappyPath() {
        // arrange
        int a = 0;
        boolean expectedResult = true;

        // act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
