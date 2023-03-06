import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testEven_HappyPath() {
        // arrange
        int a = 222222;
        String expectedResult = "Even";

        // act
        String actualResult = new OddEven().oddEven(a);

        // assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOdd_HappyPath() {
        // arrange
        int a = 345;
        String expectedResult = "Odd";

        // act
        String actualResult = new OddEven().oddEven(a);

        // assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZero_HappyPath() {
        // arrange
        int a = 0;
        String expectedResult = "Even";

        // act
        String actualResult = new OddEven().oddEven(a);

        // assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
