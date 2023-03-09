public class PeakElement {

    /* 10. Написать алгоритм PeakElement,  который принимает на вход массив
     * целых чисел и возвращает значения пиковых элементов (элементы, которые
     * больше своих соседей).
     */

    public int[] peakElement(int[] arr) {

        if(arr.length > 0) {
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
            int count = 0;
            // выясняем, является ли первый элемент массива пиковым
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
            // выясняем, является ли первый элемент массива пиковым
            if (arr[arr.length - 1] > arr[arr.length - 2]) {
                arrayResult[count] = arr[arr.length - 1];
            }
            return arrayResult;

        }

        int[] arrayResult = {-1};
        return arrayResult;

    }
}
