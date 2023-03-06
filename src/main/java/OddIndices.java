import java.util.Arrays;

public class OddIndices {

    /* 2.  Написать алгоритм OddIndices, который принимает массив целых чисел,
     * и возвращает массив значений нечетных индексов
     */

    public static int[] oddIndices(int[] array) {
        int[] oddIndicesArray = new int[array.length / 2];
        for(int i = 1, j = 0; i < array.length; i +=2, j++) {
            oddIndicesArray[j] = array[i];
        }
        return oddIndicesArray;

    }
}
