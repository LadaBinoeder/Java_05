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
        int[] arr1 = {1, 2, 4, 5, 8, 9};
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
}
