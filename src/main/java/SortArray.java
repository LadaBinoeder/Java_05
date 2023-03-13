import project_utils.Utils;

public class SortArray {
    /* 12. Написать алгоритм SortArray, который принимает на вход массив целых
     * чисел, и сортирует элементы массива в порядке возрастания.
     */

    public int[] sortArray(int[] arr) {
        if (Utils.checkNullArrayInt(arr) && Utils.checkEmptyArrayInt(arr)) {
            for (int j = 0; ; ) {
                int temp;
                boolean sorted = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        sorted = false;
                    }
                }
                if (sorted == true) {
                    break;
                }
            }
            return arr;

        }

        return new int[0];
    }
}
