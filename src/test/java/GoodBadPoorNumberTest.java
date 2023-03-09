import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodBadPoorNumberTest {

    @Test
    public void testGoodBadPoorNumber_SevenAndNineNotEleven_HappyPath() {
        // arrange
        int m = 252;
        String expectedResult = "Good Number";

        // act
        String actualResult = new GoodBadPoorNumber().goodPoorBadNumber(m);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGoodBadPoorNumber_NineNotSevenAndEleven_HappyPath() {
        // arrange
        int m = 90;
        String expectedResult = "Bad Number";

        // act
        String actualResult = new GoodBadPoorNumber().goodPoorBadNumber(m);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGoodBadPoorNumber_ElevenNotSevenAndNine_HappyPath() {
        // arrange
        int m = 22;
        String expectedResult = "Poor Number";

        // act
        String actualResult = new GoodBadPoorNumber().goodPoorBadNumber(m);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGoodBadPoorNumber_DoesNotSatisfyAnyCondition_HappyPath() {
        // arrange
        int m = 2;
        String expectedResult = "-1";

        // act
        String actualResult = new GoodBadPoorNumber().goodPoorBadNumber(m);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGoodBadPoorNumber_MultipleOfSevenNiveAndEleven_Negative() {
        // arrange
        int m = 693;
        String expectedResult = "-1";

        // act
        String actualResult = new GoodBadPoorNumber().goodPoorBadNumber(m);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
