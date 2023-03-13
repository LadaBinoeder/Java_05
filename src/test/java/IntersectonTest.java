import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectonTest {

    @Test
    public void testIntersection_PositiveNumbers_HappyPath() {
        // arrange
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        // act
        int[] actualResult = new Intersection().intersection(arr1, arr2);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_NegativeNumbers_HappyPath() {
        // arrange
        int[] arr1 = {1, 2, 4, 5, 8, 9, 2};
        int[] arr2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        // act
        int[] actualResult = new Intersection().intersection(arr1, arr2);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_NoIntersectingNumbers_HappyPath() {
        // arrange
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};
        int[] expectedResult = {};

        // act
        int[] actualResult = new Intersection().intersection(arr1, arr2);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_MoreThanOneIntersection_HappyPath() {
        // arrange
        int[] arr1 = {5, 1, 2, 4, 5, 89, 5, 4};
        int[] arr2 = {8, 9, 4, 5};
        int[] expectedResult = {5, 4};

        // act
        int[] actualResult = new Intersection().intersection(arr1, arr2);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_FirstEmptyArray_Negative() {
        // arrange
        int[] arr1 = {};
        int[] arr2 = {8, 9, 4, 5};
        int[] expectedResult = {};

        // act
        int[] actualResult = new Intersection().intersection(arr1, arr2);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_FirstNullArray_Negative() {
        // arrange
        int[] arr1 = null;
        int[] arr2 = {8, 9, 4, 5};
        int[] expectedResult = {};

        // act
        int[] actualResult = new Intersection().intersection(arr1, arr2);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_SecondEmptyArray_Negative() {
        // arrange
        int[] arr1 = {8, 9, 4, 5};
        int[] arr2 = {};
        int[] expectedResult = {};

        // act
        int[] actualResult = new Intersection().intersection(arr1, arr2);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIntersection_SecondNullArray_Negative() {
        // arrange
        int[] arr1 = {8, 9, 4, 5};
        int[] arr2 = null;
        int[] expectedResult = {};

        // act
        int[] actualResult = new Intersection().intersection(arr1, arr2);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
