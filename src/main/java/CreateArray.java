import java.util.Arrays;

public class CreateArray {

    /* 1. Написать метод createIntArray(), который принимает на вход 5 целых
     * чисел,  и возвращает массив из этих же чисел.
     */
    public int[] createIntArray(int a, int b, int c, int d, int e) {

        int[] array = new int[]{a, b, c, d, e};
        return array;

    }

    /* 2. Написать метод createDoubleArray(), который принимает на вход 5 чисел
     * типа double, и возвращает массив из этих же чисел
     */

    public double[] createDoubleArray(double a, double b, double c, double d, double e) {

        double[] array = new double[]{a, b, c, d, e};
        return array;

    }

    /* 3. Написать метод createStringArray(), который принимает на вход 5 слов,
     * и возвращает массив из этих слов
     */

    public String[] createStringArray(String a, String b, String c, String d, String e) {

        String[] array = new String[]{a, b, c, d, e};
        return array;

    }

    /* 4. Написать метод createArrayFromText(), который принимает на вход
     * предложение из нескольких слов и возвращает массив из этих слов.
     */

    public String[] createArrayFromText(String a) {

        String[] array = a.split(" ");
        return array;

    }

    /* 1. В классе CreateArray написать метод createIntArrayFromText(), который
     * принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”) и возвращает
     *  массив типа int[] из этих чисел. (можно использовать split() или
     * toCharArray())
     */
    public int[] createIntArrayFromText(String number) {
        String[] str = number.split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Double.parseDouble(str[i]));
        }
        return array;

    }

    /* 5. Написать метод multiplesOf(), который принимает на вход целое
     * положительное число number в пределах от 1 включительно до 10 включительно,
     * и возвращает таблицу умножения на это число в виде массива
     */

    public int[] multiplesOf(int number) {
        if (number > 0 && number < 11) {
            int[] array = new int[11];
            for (int i = 0; i < array.length; i++) {
                array[i] = number * i;
            }
            return array;

        }
        int[] array = new int[0];
        return array;

    }
}
