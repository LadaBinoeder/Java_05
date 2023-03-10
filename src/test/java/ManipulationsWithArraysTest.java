import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    public void testMultipleArrayByNumber_HappyPath() {
        // arrange
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

        // act
        int[] actualResult = new ManipulationsWithArrays().multipleArrayByNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultipleArrayByNumber_NumberIsZero_HappyPath() {
        // arrange
        int[] array = {1, 2, 3, 4, 5};
        int number = 0;
        int[] expectedResult = {0, 0, 0, 0, 0};

        // act
        int[] actualResult = new ManipulationsWithArrays().multipleArrayByNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultipleArrayByNumber_EmptyArray_HappyPath() {
        // arrange
        int[] array = {};
        int number = 3;
        int[] expectedResult = {};

        // act
        int[] actualResult = new ManipulationsWithArrays().multipleArrayByNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_HappyPath() {
        // arrange
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        // act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_EmptyArray_HappyPath() {
        // arrange
        int[] array = {};
        double[] expectedResult = {};

        // act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_HappyPath() {
        // arrange
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        int[] expectedResult = {1, 2, 3, 4, 5};

        // act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_EmptyArray_HappyPath() {
        // arrange
        double[] array = {};
        int[] expectedResult = {};

        // act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Int_HappyPath() {
        // arrange
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Int_EmptyArray_HappyPath() {
        // arrange
        int[] array = {};
        String[] expectedResult = {};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Double_HappyPath() {
        // arrange
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Double_EmptyArray_HappyPath() {
        // arrange
        double[] array = {};
        String[] expectedResult = {};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber_ValuesGreater_HappyPath() {
        // arrange
        int[] array = {10, 20, 30, 40, 50, 66, 77};
        int number = 2;
        boolean expectedResult = true;

        // act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber_ValuesSmaller_HappyPath() {
        // arrange
        int[] array = {1, 1, 0, -1, -2, 1, -22};
        int number = 2;
        boolean expectedResult = false;

        // act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber_OneValueSmaller_HappyPath() {
        // arrange
        int[] array = {10, 10, 50, -1, 25, 19, 22};
        int number = 2;
        boolean expectedResult = false;

        // act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber_ValuesEqualNumber_HappyPath() {
        // arrange
        int[] array = {2, 2, 2, 2, 2};
        int number = 2;
        boolean expectedResult = false;

        // act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber_EmptyArray_Negative() {
        // arrange
        int[] array = {};
        int number = 2;
        boolean expectedResult = false;

        // act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_EvenNumberOfElements_LeftPartGreater_HappyPath() {
        // arrange
        int[] array = {20, 100, 3, 6, 2, 1, 1, 2, 1, 1};
        int[] expectedResult = {20, 100, 3, 6, 2};

        // act
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_EvenNumberOfElements_RightPartGreater_HappyPath() {
        // arrange
        int[] array = {20, 100, 3, 6, 2, 100, 100, 200, 100, 100};
        int[] expectedResult = {100, 100, 200, 100, 100};

        // act
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_EvenNumberOfElements_RightAndLeftPartEqual_HappyPath() {
        // arrange
        int[] array = {99, 101, 199, 102, 99, 100, 100, 200, 100, 100};
        int[] expectedResult = {99, 101, 199, 102, 99};

        // act
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_OddNumberOfElements_LeftPartGreater_HappyPath() {
        // arrange
        int[] array = {20, 100, 3, 6, 10, 2, 1, 1, 2, 1, 1};
        int[] expectedResult = {20, 100, 3, 6, 10, 2};

        // act
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_OddNumberOfElements_RightPartGreater_HappyPath() {
        // arrange
        int[] array = {20, 100, 3, 6, 2, 100, 100, 200, 100, 100, 888};
        int[] expectedResult = {100, 200, 100, 100, 888};

        // act
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_OddNumberOfElements_RightAndLeftPartEqual_HappyPath() {
        // arrange
        int[] array = {99, 101, 199, 102, 99, 100, 100, 200, 100, 100, 0};
        int[] expectedResult = {99, 101, 199, 102, 99, 100};

        // act
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTheGreaterHalf_EmptyArray_HappyPath() {
        // arrange
        int[] array = {};
        int[] expectedResult = {};

        // act
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
