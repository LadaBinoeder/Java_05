public class SumArray {

    // 3. Написать алгоритм SumArray, который возвращает сумму всех чисел массива

    public int sumArray(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            count +=array[i];
        }
        return count;

    }
}
