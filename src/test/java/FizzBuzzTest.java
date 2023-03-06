import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Positive testing Happy path
    // if (start <= end)
    // return array
    // start < end

    @Test
    public void testStartLessThanEnd_HappyPath() {
    ///arrange
    int start = 1;
    int end = 20;
    String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
    "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz",
    "19", "Buzz"};

    //act
    //FizzBuzz fizzBuzz = new FizzBuzz(); // т.к. мы не может в этом классе вызвать
    // метод класса FizzBuzz с названием fizzBuzz(т.к. он не Static), создаем
    // новый объект класс FizzBuzz через конструктор по умолчанию
    // String[] actualResult = fizzBuzz.fizzBuzz();

    //либо можно без добавления дополнительной переменной:
    String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

    //assert
    Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. start == end

    @Test
    public void testStartEqualsEnd_HappyPath() {
        ///arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 3. start < end, start and end are negative
    @Test
    public void testStartLessThanEnd_StartAndEndAreNegativeHappyPath() {
        ///arrange
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz",
        "-14", "-13", "Fizz", "-11", "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz",
        "-4", "Fizz", "-2", "-1"};

        //act
        //FizzBuzz fizzBuzz = new FizzBuzz(); // т.к. мы не может в этом классе вызвать
        // метод класса FizzBuzz с названием fizzBuzz(т.к. он не Static), создаем
        // новый объект класс FizzBuzz через конструктор по умолчанию
        // String[] actualResult = fizzBuzz.fizzBuzz();

        //либо можно без добавления дополнительной переменной:
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 4. Negative testing
    // if (start > end)
    // return new String[0];
    @Test
    public void testStartGreaterThanEnd_Negative() {
        ///arrange
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
