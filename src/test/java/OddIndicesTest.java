import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndices_ArrayLengthMoreThanOne_HappyPath() {
        // arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        // act
        int[] actualResult = new OddIndices().oddIndices(array);

        // assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndices_ArrayLengthOne_HappyPath() {
        // arrange
        int[] array = {-45};
        int[] expectedResult = {};

        // act
        int[] actualResult = new OddIndices().oddIndices(array);

        // assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndices_HappyPath() {
        // arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        // act
        int[] actualResult = new OddIndices().oddIndices(array);

        // assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndices_NullArray_Negative() {
        // arrange
        int[] array = null;
        int[] expectedResult = {};

        // act
        int[] actualResult = new OddIndices().oddIndices(array);

        // assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndices_EmptyArray_Negative() {
        // arrange
        int[] array = {};
        int[] expectedResult = {};

        // act
        int[] actualResult = new OddIndices().oddIndices(array);

        // assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
