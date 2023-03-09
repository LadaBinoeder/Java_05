import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArray_PositiveNumbers_HappyPath() {
        // arrange
        int[] arr = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        // act
        int[] actualResult = new ReverseArray().reverseArray(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReverseArray_NegativeNumbersAndZero_HappyPath() {
        // arrange
        int[] arr = {-2, -7, -3, -10, 0};
        int[] expectedResult = {0, -10, -3, -7, -2};

        // act
        int[] actualResult = new ReverseArray().reverseArray(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testReverseArray_EmptyArray_HappyPath() {
        // arrange
        int[] arr = {};
        int[] expectedResult = {};

        // act
        int[] actualResult = new ReverseArray().reverseArray(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
