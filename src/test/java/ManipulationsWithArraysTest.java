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
    public void testMultipleArrayByNumber_EmptyArray_Negative() {
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
    public void testMultipleArrayByNumber_NullArray_Negative() {
        // arrange
        int[] array = null;
        int number = 3;
        int[] expectedResult = {};

        // act
        int[] actualResult = new ManipulationsWithArrays().multipleArrayByNumber(array, number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_PositiveNumbers_HappyPath() {
        // arrange
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        // act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_NegativeNumbers_HappyPath() {
        // arrange
        int[] array = {-1, -2, -3, -4, -5};
        double[] expectedResult = {-1.0, -2.0, -3.0, -4.0, -5.0};

        // act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_Zeros_HappyPath() {
        // arrange
        int[] array = {0, 0};
        double[] expectedResult = {0.0, 0.0};

        // act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_MinAndMaxValues_HappyPath() {
        // arrange
        int[] array = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        double[] expectedResult = {2147483647.0, -2147483648.0};

        // act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_EmptyArray_Negative() {
        // arrange
        int[] array = {};
        double[] expectedResult = {};

        // act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_NullArray_Negative() {
        // arrange
        int[] array = null;
        double[] expectedResult = {};

        // act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_PositiveNumbers_HappyPath() {
        // arrange
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        int[] expectedResult = {1, 2, 3, 4, 5};

        // act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_NegativeNumbers_HappyPath() {
        // arrange
        double[] array = {-1.0, -2.0, -3.0, -4.0, -5.0};
        int[] expectedResult = {-1, -2, -3, -4, -5};

        // act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_Zeros_HappyPath() {
        // arrange
        double[] array = {0.0, 0.0};
        int[] expectedResult = {0, 0};

        // act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_MinAndMaxValues_HappyPath() {
        // arrange
        double[] array = {Double.MIN_VALUE, Double.MAX_VALUE, -Double.MAX_VALUE};
        int[] expectedResult = {0, Integer.MAX_VALUE, Integer.MIN_VALUE};

        // act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_EmptyArray_Negative() {
        // arrange
        double[] array = {};
        int[] expectedResult = {};

        // act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_NullArray_Negative() {
        // arrange
        double[] array = null;
        int[] expectedResult = {};

        // act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Int_PositiveNumbers_HappyPath() {
        // arrange
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Int_NegativeNumbers_HappyPath() {
        // arrange
        int[] array = {-11, -222, -3, 4, 5};
        String[] expectedResult = {"-11", "-222", "-3", "4", "5"};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Int_Zeros_HappyPath() {
        // arrange
        int[] array = {0, 0};
        String[] expectedResult = {"0", "0"};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Int_EmptyArray_Negative() {
        // arrange
        int[] array = {};
        String[] expectedResult = {};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Int_NullArray_Negative() {
        // arrange
        int[] array = null;
        String[] expectedResult = {};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Double_PositiveNumbers_HappyPath() {
        // arrange
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Double_NegativeNumbers_HappyPath() {
        // arrange
        double[] array = {-1.1, -2.5, -3.7, -4.0, -5.5};
        String[] expectedResult = {"-1.1", "-2.5", "-3.7", "-4.0", "-5.5"};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Double_Zeros_HappyPath() {
        // arrange
        double[] array = {0.0, 0.0};
        String[] expectedResult = {"0.0", "0.0"};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Double_EmptyArray_Negative() {
        // arrange
        double[] array = {};
        String[] expectedResult = {};

        // act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Double_NullArray_Negative() {
        // arrange
        double[] array = null;
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
    public void testAreValuesGreaterThanNumber_NullArray_Negative() {
        // arrange
        int[] array = null;
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
