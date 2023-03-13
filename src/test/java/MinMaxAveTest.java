import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve_AGreaterThanB_HappyPath() {
        // arrange
        int[] array = {1, 2, 15, 45, 3445, -22, 0, 223};
        int a = 2;
        int b = 5;
        int[] expectedResult = {-22, 3445, 870};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_BGreaterThanA_HappyPath() {
        // arrange
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 6;
        int b = 2;
        int[] expectedResult = {3, 7, 5};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_AEqualsB_HappyPath() {
        // arrange
        int[] array = {0, 88, 233, 9283, 3939, 192, 293, 88};
        int a = 7;
        int b = 7;
        int[] expectedResult = {88, 88, 88};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_AOutOfBounds_Negative() {
        // arrange
        int[] array = {0, 88, 233, 9283, 3939, 192, 293, 88};
        int a = 9;
        int b = 7;
        int[] expectedResult = {};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_BOutOfBounds_Negative() {
        // arrange
        int[] array = {0, 88, 233, 9283, 3939, 192, 293, 88};
        int a = 2;
        int b = 10;
        int[] expectedResult = {};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_ABelowZero_Negative() {
        // arrange
        int[] array = {0, 88, 233, 9283, 3939, 192, 293, 88};
        int a = -10;
        int b = 2;
        int[] expectedResult = {};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_BBelowZero_Negative() {
        // arrange
        int[] array = {0, 88, 233, 9283, 3939, 192, 293, 88};
        int a = 2;
        int b = -10;
        int[] expectedResult = {};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_EmptyArray_Negative() {
        // arrange
        int[] array = {};
        int a = 9;
        int b = 6;
        int[] expectedResult = {};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMinMaxAve_NullArray_Negative() {
        // arrange
        int[] array = null;
        int a = 9;
        int b = 6;
        int[] expectedResult = {};

        // act
        int[] actualResult = new MinMaxAve().minMaxAve(array, a, b);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
