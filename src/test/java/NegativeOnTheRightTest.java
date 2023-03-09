import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeOnTheRight_HappyPath() {
        // arrange
        int[] arr = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult =  {4, 7, 5, 9, 4, 12, -3, -12, -2};

        // act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeOnTheRight_NoNegative_HappyPath() {
        // arrange
        int[] arr = {4, 0, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {4, 0, 7, 12, 5, 2, 9, 4, 12};

        // act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeOnTheRight_AllNegative_HappyPath() {
        // arrange
        int[] arr = {-4, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = {-4, -7, -12, -5, -2, -9, -4, -12};

        // act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeOnTheRight_EmptyArray_HappyPath() {
        // arrange
        int[] arr = {};
        int[] expectedResult = {};

        // act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
