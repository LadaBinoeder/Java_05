import project_utils.Utils;

import java.util.Arrays;

public class OddEvenValuesInArray {

    /* 10. Написать метод countEvenValuesInArray(), который принимает на вход
     * массив целых чисел,  и возвращает количество четных чисел в этом массиве
     */

    public int countEvenValuesInArray(int[] array) {
        int count = 0;
        if (Utils.checkNullArrayInt(array) && Utils.checkEmptyArrayInt(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count++;
                }
            }
            return count;

        }
        return -1;

    }

    /* 11. Написать метод countOddValuesInArray(), который принимает на вход
     * массив целых чисел,  и возвращает количество нечетных чисел в этом массиве
     */

    public int countOddValuesInArray(int[] array) {
        int count = 0;
        if (Utils.checkNullArrayInt(array) && Utils.checkEmptyArrayInt(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    count++;
                }
            }
            return count;

        }
        return -1;

    }

    /* 2. В классе OddEvenElementsInArray написать метод
     * countOddEvenValuesInArray(), который принимает на вход массив целых чисел
     * и возвращает массив int[2], который содержит количество четных и нечетных
     * элементов входящего массива
     */

    public int[] countOddEvenValuesInArray(int[] array) {
        int countOdd = 0;
        int countEven = 0;
        if (Utils.checkNullArrayInt(array) && Utils.checkEmptyArrayInt(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
            int[] resultArray = new int[]{countEven, countOdd};
            return resultArray;

        }
        return new int[0];

    }

    /* 3. В классе OddEvenElementsInArray написать метод createOddEvenArray(),
     * который принимает массив целых случайных чисел, и возвращает двумерный
     * массив (массив четных и массив нечетных чисел)
     */

    public int[][] createOddEvenArray(int[] array) {
        if (Utils.checkNullArrayInt(array) && Utils.checkEmptyArrayInt(array)) {
            // counting the length of even and odd arrays
            int countEven = 0;
            int countOdd = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }

            // creating arrays with even and odd numbers
            int[] arrayEven = new int[countEven];
            int[] arrayOdd = new int[countOdd];

            // filling in arrays with even and odd numbers
            int indexEven = 0;
            int indexOdd = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrayEven[indexEven] = array[i];
                    indexEven++;
                } else {
                    arrayOdd[indexOdd] = array[i];
                    indexOdd++;
                }
            }
            int[][] resultArray = new int[][]{arrayEven, arrayOdd};
            return resultArray;

        }
        return new int[0][0];

    }
}


