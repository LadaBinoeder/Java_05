import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValue_AGreaterThanB_HappyPath() {
        // arrange
        int a = 9999;
        int b = 3333;
        int expectedResult = 9999;

        // act
        int actualResult = new BiggerValue().biggerValue(a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBiggerValue_BGreaterThanA_HappyPath() {
        // arrange
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        // act
        int actualResult = new BiggerValue().biggerValue(a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testBiggerValue_AEqualsB_HappyPath() {
        // arrange
        int a = 3333;
        int b = 3333;
        int expectedResult = 3333;

        // act
        int actualResult = new BiggerValue().biggerValue(a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
