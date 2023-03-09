import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Test
    public void testPeakElement_PositiveNumbers_HappyPath() {
        // arrange
        int[] arr = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        // act
        int[] actualResult = new PeakElement().peakElement(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElement_NegativeNumbers_HappyPath() {
        // arrange
        int[] arr = {-3, -2, -7, -5, -1, -9, -23, -1};
        int[] expectedResult = {-2, -1, -1};

        // act
        int[] actualResult = new PeakElement().peakElement(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElement_AllElementsAreEqual_HappyPath() {
        // arrange
        int[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int[] expectedResult = {};

        // act
        int[] actualResult = new PeakElement().peakElement(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPeakElement_EmptyArray_Negative() {
        // arrange
        int[] arr = {};
        int[] expectedResult = {-1};

        // act
        int[] actualResult = new PeakElement().peakElement(arr);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
