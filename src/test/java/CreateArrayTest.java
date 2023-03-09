import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    public void testCreateIntArray_PositiveNumbers_HappyPath() {
        // arrange
        int a = 10;
        int b = 20;
        int c = 22;
        int d = 2;
        int e = 12;
        int[] expectedResult = {10, 20, 22, 2, 12};

        // act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArray_NegativeNumbers_HappyPath() {
        // arrange
        int a = -10;
        int b = -20;
        int c = -22;
        int d = -2;
        int e = -12;
        int[] expectedResult = {-10, -20, -22, -2, -12};

        // act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArray_Zeros_HappyPath() {
        // arrange
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int[] expectedResult = {0, 0, 0, 0, 0};

        // act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
