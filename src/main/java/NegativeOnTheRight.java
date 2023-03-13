import project_utils.Utils;

public class NegativeOnTheRight {
    /* 13. Написать алгоритм NegativeOnTheRight, который принимает на вход массив
     * целых чисел, и возвращает массив,  в котором все негативные числа
     * находятся во второй половине массива (массив не должен быть отсортирован)
     */

    public int[] negativeOnTheRight(int[] arr) {
        if (Utils.checkNullArrayInt(arr) && Utils.checkEmptyArrayInt(arr)) {
            //searching for an index og the first negative element
            int index = 0;
            int[] resultArray = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    resultArray[index] = arr[i];
                    index++;
                }
            }

            // puting negative elements after positive
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    resultArray[index] = arr[i];
                    index++;
                }
            }
            return resultArray;

        }
        return new int[0];

    }
}
