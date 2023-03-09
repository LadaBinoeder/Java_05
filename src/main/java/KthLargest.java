public class KthLargest {
    /* 13. Написать алгоритм KthLargest, который принимает на вход массив целых
     * чисел и число k, и возвращает k-тый максимальный элемент.
     */

    public int kthLargest(int[] arr, int k) {

        if(arr.length == 0) {
            return -1;

        }

        // sorting an array
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
        }

        // deleting duplicate elements
        int compare = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[compare] != arr[i]) {
                compare++;
                arr[compare] = arr[i];
            }
        }

        // creating an array without duplicates
        int[] resultArray = new int[compare + 1];
        for (int i = 0; i <= compare; i++) {
            resultArray[i] = arr[i];
        }


        if (k < resultArray.length) {
            return resultArray[k - 1];

        }
        return -1;

    }
}
