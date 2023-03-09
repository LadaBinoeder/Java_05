import java.util.Arrays;

public class Intersection {
    /* 9. Написать алгоритм Intersection, который принимает на вход 2 массива
     * целых чисел и возвращает массив общих элементов.
     */

    public int[] intersection(int[] arr1, int[] arr2){
        int index = 0;
        int length = 0;
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
}
