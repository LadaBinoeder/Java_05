public class OddEvenValuesInArray {

    /* 10. Написать метод countEvenValuesInArray(), который принимает на вход
     * массив целых чисел,  и возвращает количество четных чисел в этом массиве
     */

    public int countEvenValuesInArray(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /* 11. Написать метод countOddValuesInArray(), который принимает на вход
     * массив целых чисел,  и возвращает количество нечетных чисел в этом массиве
     */

    public int countOddValuesInArray(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /* 2. В классе OddEvenElementsInArray написать метод
     * countOddEvenValuesInArray(), который принимает на вход массив целых чисел
     * и возвращает массив int[2], который содержит количество четных и нечетных
     * элементов входящего массива
     */

    public int[] countOddEvenValuesInArray(int[] array) {
        int countOdd = 0;
        int countEven = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] resultArray = new int[]{countEven, countOdd};
        return resultArray;

    }
}
