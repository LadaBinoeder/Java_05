import project_utils.Utils;

public class SumOfTwo {

    /* 14. Написать алгоритм SumOfTwo, который принимает на вход массив целых
     * чисел,  и число n. Алгоритм  возвращает пары элементов, которые в сумме
     * дают число n.
     */

    public int[][] sumOfTwo(int[] array, int n) {
        if(Utils.checkNullArrayInt(array) && Utils.checkEmptyArrayInt(array)) {
            // creating a new array equals to incoming array
            int[] temp = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }

            // searching for the length of array
            int length = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == n) {
                        length++;
            //            array[i] = Integer.MIN_VALUE;
                    }
                }
            }

            // creating a result array with the found length
            int result[][] = new int[length][2];
            int indexOfString = 0;
            for (int i = 0; i < temp.length; i++) {
                for (int j = i + 1; j < temp.length; j++) {
                    if (temp[i] + temp[j] == n) {
                        result[indexOfString][0] = temp[i];
                        result[indexOfString][1] = temp[j];
                        indexOfString++;
             //           array[i] = Integer.MIN_VALUE;
                    }
                }
            }
            return result;

        }
        return new int[0][0];
    }
}
