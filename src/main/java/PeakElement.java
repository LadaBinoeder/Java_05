import project_utils.Utils;

public class PeakElement {

    /* 10. Написать алгоритм PeakElement,  который принимает на вход массив
     * целых чисел и возвращает значения пиковых элементов (элементы, которые
     * больше своих соседей).
     */

    public int[] peakElement(int[] arr) {

        if(arr.length == 1) {
            return arr;

        } else if(Utils.checkNullArrayInt(arr) && arr.length > 1) {
            // вычисляем длину массива
            int length = 0;
            if (arr[0] > arr[1]) {
                length++;
            }
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    length++;
                }
            }
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                length++;
            }
            int[] arrayResult = new int[length];

            // заполняем массив
            // выясняем, является ли первый элемент массива пиковым
            int count = 0;

            if (arr[0] > arr[1]) {
                arrayResult[count] = arr[0];
                count++;
            }
            // выясняем, являются ли элементы массива пиковым, кроме первого и последнего
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    arrayResult[count] = arr[i];
                    count++;
                }
            }
            // выясняем, является ли последний элемент массива пиковым
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                arrayResult[count] = arr[arr.length - 1];
            }
            return arrayResult;

        }

        return new int[0];

    }
}
