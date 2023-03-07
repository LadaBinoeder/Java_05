import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqual_AEqualsB_HappyPath() {
        // arrange
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        // act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreNumbersEqual_ALessThanB_HappyPath() {
        // arrange
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        // act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreNumbersEqual_AGreaterThanB_HappyPath() {
        // arrange
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        // act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
