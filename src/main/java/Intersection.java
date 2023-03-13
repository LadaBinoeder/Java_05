import project_utils.Utils;

import java.util.Arrays;

public class Intersection {
    /* 9. Написать алгоритм Intersection, который принимает на вход 2 массива
     * целых чисел и возвращает массив общих элементов.
     */

    public int[] intersection(int[] arr1, int[] arr2){
        if(Utils.checkNullArrayInt(arr1) && Utils.checkEmptyArrayInt(arr1)
        && Utils.checkNullArrayInt(arr2) && Utils.checkEmptyArrayInt(arr2)) {
            int index = 0;
            int length = 0;

            // убираем повторяющиеся элементы в каждом массиве
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] == arr1[j]) {
                        arr1[j] = Integer.MIN_VALUE;
                    }
                }
            }

            for (int i = 0; i < arr2.length; i++) {
                for (int j = i + 1; j < arr2.length; j++) {
                    if (arr2[i] == arr2[j]) {
                        arr2[j] = Integer.MIN_VALUE;
                    }
                }
            }

            // ищем длину массива
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        length++;
                    }
                }
            }
            int[] arrResult = new int[length];

            // заполняем массив
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        arrResult[index] = arr1[i];
                        index++;
                    }
                }
            }
            return arrResult;

        }

        return new int[0];

    }
}
