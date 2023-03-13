import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {

    @Test
    public void testKthLargest_PositiveNumbers_HappyPath() {
        // arrange
        int[] arr = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        // act
        int actualResult = new KthLargest().kthLargest(arr, k);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthLargest_NegativeNumbers_HappyPath() {
        // arrange
        int[] arr = {-4, -3, -7, -13, -5, -2, -9, -4, -12};
        int k = 5;
        int expectedResult = -7;

        // act
        int actualResult = new KthLargest().kthLargest(arr, k);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthLargest_DuplicateNumbers_HappyPath() {
        // arrange
        int[] arr = {13, 12, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        // act
        int actualResult = new KthLargest().kthLargest(arr, k);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthLargest_EmptyArray_Negative() {
        // arrange
        int[] arr = {};
        int k = 3;
        int expectedResult = -1;

        // act
        int actualResult = new KthLargest().kthLargest(arr, k);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthLargest_AllNumbersAreEquals_Negative() {
        // arrange
        int[] arr = {12, 12, 12, 12, 12, 12, 12, 12, 12};
        int k = 3;
        int expectedResult = -1;

        // act
        int actualResult = new KthLargest().kthLargest(arr, k);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testKthLargest_NullArray_Negative() {
        // arrange
        int[] arr = null;
        int k = 9;
        int expectedResult = -1;

        // act
        int actualResult = new KthLargest().kthLargest(arr, k);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
