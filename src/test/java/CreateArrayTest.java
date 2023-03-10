import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    public void testCreateIntArray_PositiveNumbers_HappyPath() {
        // arrange
        int a = 10;
        int b = 20;
        int c = 22;
        int d = 2;
        int e = 12;
        int[] expectedResult = {10, 20, 22, 2, 12};

        // act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArray_NegativeNumbers_HappyPath() {
        // arrange
        int a = -10;
        int b = -20;
        int c = -22;
        int d = -2;
        int e = -12;
        int[] expectedResult = {-10, -20, -22, -2, -12};

        // act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArray_Zeros_HappyPath() {
        // arrange
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int[] expectedResult = {0, 0, 0, 0, 0};

        // act
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateDoubleArray_PositiveNumbers_HappyPath() {
        // arrange
        double a = 10.33;
        double b = 20.23;
        double c = 22.00;
        double d = 2.78;
        double e = 12.0877;
        double[] expectedResult = {10.33, 20.23, 22.00, 2.78, 12.0877};

        // act
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateDoubleArray_NegativeNumbers_HappyPath() {
        // arrange
        double a = -10.33;
        double b = -20.23;
        double c = -22.00;
        double d = -2.78;
        double e = -12.0877;
        double[] expectedResult = {-10.33, -20.23, -22.00, -2.78, -12.0877};

        // act
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateDoubleArray_Zeros_HappyPath() {
        // arrange
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double[] expectedResult = {0.0, 0.0, 0.0, 0.0, 0.0};

        // act
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateStringArray_HappyPath() {
        // arrange
       String a = "Hund";
       String b = "Katze";
       String c = "Pferd";
       String d = "Ziege";
       String e = "Affe";
       String[] expectedResult = {"Hund", "Katze", "Pferd", "Ziege", "Affe"};

        // act
        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateStringArray_EmptyStrings_HappyPath() {
        // arrange
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String[] expectedResult = {"", "", "", "", ""};

        // act
        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromText_HappyPath() {
        // arrange
        String a = "Ich liebe Java";
        String[] expectedResult = {"Ich", "liebe", "Java"};

        // act
        String[] actualResult = new CreateArray().createArrayFromText(a);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromText_RegexFirst_HappyPath() {
        // arrange
        String a = " Ich liebe Java";
        String[] expectedResult = {"", "Ich", "liebe", "Java"};

        // act
        String[] actualResult = new CreateArray().createArrayFromText(a);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromText_RegexLast_HappyPath() {
        // arrange
        String a = "Ich liebe Java ";
        String[] expectedResult = {"Ich", "liebe", "Java"};

        // act
        String[] actualResult = new CreateArray().createArrayFromText(a);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromText_EmptyString_Negative() {
        // arrange
        String a = "";
        String[] expectedResult = {""};

        // act
        String[] actualResult = new CreateArray().createArrayFromText(a);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromText_OnlyRegex_Negative() {
        // arrange
        String a = " ";
        String[] expectedResult = {};

        // act
        String[] actualResult = new CreateArray().createArrayFromText(a);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromText_OnlyIntInString_HappyPath() {
        // arrange
        String number = "3 1 4 6 8 2 7";
        int[] expectedResult = {3, 1, 4, 6, 8, 2, 7};

        // act
        int[] actualResult = new CreateArray().createIntArrayFromText(number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateIntArrayFromText_IntAndDoubleInString_HappyPath() {
        // arrange
        String number = "3 1.2 4 6 8.32 2 7";
        int[] expectedResult = {3, 1, 4, 6, 8, 2, 7};

        // act
        int[] actualResult = new CreateArray().createIntArrayFromText(number);

        // assert
        Assert.assertEquals(actualResult, expectedResult);
    }

//    @Test
//    public void testCreateIntArrayFromText_NotNumbersInString_Negative() {
//        // arrange
//        String number = "katze hund kuh";
//        int[] expectedResult = {};
//
//        // act
//        int[] actualResult = new CreateArray().createIntArrayFromText(number);
//
//        // assert
//        Assert.assertEquals(actualResult, expectedResult);
//    }
//
//    @Test
//    public void testCreateIntArrayFromText_EmptyString_HappyPath() {
//        // arrange
//        String number = "";
//        int[] expectedResult = {};
//
//        // act
//        int[] actualResult = new CreateArray().createIntArrayFromText(number);
//
//        // assert
//        Assert.assertEquals(actualResult, expectedResult);
//    }
}
