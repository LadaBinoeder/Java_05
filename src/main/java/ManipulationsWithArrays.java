import java.util.Arrays;

public class ManipulationsWithArrays {

    /* 5. Написать метод multipleArrayByNumber(), который принимает на вход
     * массив целых чисел и число int number. Метод возвращает массив тех же
     * чисел, умноженных на number
     */

    public int[] multipleArrayByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * number;
        }

        return array;
    }

    /* 6. Написать метод toDoubleArray(), который принимает на вход массив целых
     * чисел, и возвращает массив типа double[] из тех же чисел
     */

    public double[] toDoubleArray(int[] array) {
        double[] resultArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];
        }
        return resultArray;

    }

    /* 7. Написать метод toIntArray(), который принимает на вход массив типа
     * double[],  и возвращает массив типа int[] из тех же чисел
     */

    public int[] toIntArray(double[] array) {
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = (int) (array[i]);
        }
        return resultArray;

    }

    /* 8. Написать метод toStringArray(), который принимает на вход массив целых
     * чисел,  и возвращает массив типа String[] из тех же чисел (желательно не
     * использовать метод .toString(), нужно переводить вручную)
     */

    public String[] toStringArray(int[] array) {
        String[] resultArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i] + "";
        }
        return resultArray;

    }

    /* 9. Перегрузить метод toStringArray() параметром double[]. Этот метод
     * должен возвращать массив типа String[] (желательно не использовать метод
     * .toString(), нужно переводить вручную)
     */

    public String[] toStringArray(double[] array) {
        String[] resultArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i] + "";
        }
        return resultArray;

    }

    /* 12. Написать метод areValuesGreaterThanNumber(), который принимает на
     * вход массив целых чисел и число number. Метод возвращает значение true,
     * если все элементы массива больше number, иначе возвращает false
     */

    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        int count = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= number) {
                    count++;
                }
            }
            if (count == 0) {
                return true;

            }
        }
        return false;

    }

    /* 4. В классе ManipulationsWithArrays написать метод getTheGreaterHalf(),
     * который принимает массив целых чисел,  и возвращает  массив из суммарно
     * бОльшей первой или второй половины входящего массива
     */

    public int[] getTheGreaterHalf(int[] array) {
        int[] leftArray;
        int[] rightArray;

        // count arrays' length
        if (array.length % 2 == 0) {
            leftArray = new int[array.length / 2];
        } else {
            leftArray = new int[(array.length + 1) / 2];
        }

        rightArray = new int[array.length - leftArray.length];

        // fill the first array
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                leftArray[i] = array[i];
            }
        } else {
            for (int i = 0; i < (array.length + 1) / 2; i++) {
                leftArray[i] = array[i];
            }
        }

        // fill the second array
        int index = 0;
        if (array.length % 2 == 0) {
            for (int i = array.length / 2; i < array.length; i++) {
                rightArray[index] = array[i];
                index++;
            }
        } else {
            for (int i = (array.length / 2) + 1; i < array.length; i++) {
                rightArray[index] = array[i];
                index++;
            }
        }

        // count the sum of arrays' elements
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < leftArray.length; i++) {
            count1 += leftArray[i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            count2 += rightArray[i];
        }

        // compare the sum of elements
        if (count1 >= count2) {
            return leftArray;

        } else {
            return rightArray;

        }
    }
}
