public class ReverseArray {
    /* 11.  Написать алгоритм ReverseArray, который принимает на вход массив
     * целых чисел, и возвращает “перевернутый” массив.
     */

    public int[] reverseArray(int[] arr) {
        int[] arrReverse = new int[arr.length];
        int j = arr.length - 1;
        for(int i = 0; i < arr.length; i++) {

            arrReverse[j] = arr[i];
            j--;
        }
        return arrReverse;

    }
}
