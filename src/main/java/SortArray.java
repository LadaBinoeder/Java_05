public class SortArray {
    /* 12. Написать алгоритм SortArray, который принимает на вход массив целых
     * чисел, и сортирует элементы массива в порядке возрастания.
     */

    public int[] sortArray(int[] arr) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return arr;

    }
}
