import org.testng.Assert;
import org.testng.annotations.Test;

public class SortArrayTest {

    @Test
    public void testSortArray_PositiveNumbers_HappyPath() {
        // arrange
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        // act
        int[] actualResult = new SortArray().sortArray(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testSortArray_NegativeNumbers_HappyPath() {
        // arrange
        int[] arr = {-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = {-12, -12, -9, -7, -5, -4, -4, -3, -2};

        // act
        int[] actualResult = new SortArray().sortArray(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSortArray_EmptyArray_HappyPath() {
        // arrange
        int[] arr = {};
        int[] expectedResult = {};

        // act
        int[] actualResult = new SortArray().sortArray(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
