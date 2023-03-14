import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfTwoTest {

    @Test
    public void testSumOfTwo_PositiveNumbers_HappyPath() {
        // arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo_NegativeNumbers_HappyPath() {
        // arrange
        int[] array = {-4, -3, -7, 12, -5, 2, -9, 4, 12};
        int n = -12;
        int[][] expectedResult = {{-3, -9}, {-7, -5}};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo_DuplicatedElements_HappyPath() {
        // arrange
        int[] array = {4, 3, 7, 12, 3, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}, {3, 9}};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo_OnlyTwoElementEqualsToTheSum_HappyPath() {
        // arrange
        int[] array = {6, 6};
        int n = 12;
        int[][] expectedResult = {{6, 6}};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo_NoElementsEqualsToTheSum_HappyPath() {
        // arrange
        int[] array = {4, 3, 7, 12, 3, 5, 2, 9, 4, 12};
        int n = 122;
        int[][] expectedResult = {};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo_TooLessElements_Negative() {
        // arrange
        int[] array = {4};
        int n = 12;
        int[][] expectedResult = {};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo_EmptyArray_Negative() {
        // arrange
        int[] array = {};
        int n = 12;
        int[][] expectedResult = {};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumOfTwo_NullArray_Negative() {
        // arrange
        int[] array = null;
        int n = 12;
        int[][] expectedResult = {};

        //act
        int[][] actualResult = new SumOfTwo().sumOfTwo(array, n);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
