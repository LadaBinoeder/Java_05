import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayPositive_HappyPath() {
        // arrange
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        // act
        int actualResult = new SumArray().sumArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArrayNegative_HappyPath() {
        // arrange
        int[] array = {-7, -3};
        int expectedResult = -10;

        // act
        int actualResult = new SumArray().sumArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
        //ДОБАВИТЬ ТЕСТ ПРИ ПУСТОМ МАССИВЕ!!!!!!!!!!!!
    @Test
    public void testSumArray_EmptyArray_Negative() {
        // arrange
        int[] array = {};
        int expectedResult = 0;

        // act
        int actualResult = 0;

        // assert
        Assert.assertEquals(actualResult, expectedResult);
        }
    }

