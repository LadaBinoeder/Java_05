import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    @Test
    public void testCountEvenValuesInArray_HappyPath() {
        // arrange
        int[] array = {12, 23, 35, 46, 224, 865, 557};
        int expectedResult = 3;

        // act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountEvenValuesInArray_NoEvenValues_HappyPath() {
        // arrange
        int[] array = {11, 23, 35, 47, 225, 865, 557};
        int expectedResult = 0;

        // act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountEvenValuesInArray_EmptyArray_HappyPath() {
        // arrange
        int[] array = {};
        int expectedResult = 0;

        // act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddValuesInArray_HappyPath() {
        // arrange
        int[] array = {12, 23, 35, 46, 224, 865, 557};
        int expectedResult = 4;

        // act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddValuesInArray_NoOddValues_HappyPath() {
        // arrange
        int[] array = {12, 22, 36, 46, 224, 866, 558};
        int expectedResult = 0;

        // act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddValuesInArray_EmptyArray_HappyPath() {
        // arrange
        int[] array = {};
        int expectedResult = 0;

        // act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddEvenValuesInArray_OddAndEvenNumber_HappyPath() {
        // arrange
        int[] array = {2, 4, 6, 7, 8, 3, 7, 4, 2, 8};
        int[] expectedResult = {7, 3};

        // act
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddEvenValuesInArray_OnlyOddNumbers_HappyPath() {
        // arrange
        int[] array = {2, 4, 6, 8, 8, 70, 76, 4, 2, 8};
        int[] expectedResult = {10, 0};

        // act
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddEvenValuesInArray_OnlyEvenNumbers_HappyPath() {
        // arrange
        int[] array = {21, 43, 65, 87, 89, 7, 7, 45, 27, 89};
        int[] expectedResult = {0, 10};

        // act
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddEvenValuesInArray_EmptyArray_HappyPath() {
        // arrange
        int[] array = {};
        int[] expectedResult = {0, 0};

        // act
        int[] actualResult = new OddEvenValuesInArray().countOddEvenValuesInArray(array);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
