public class MinMaxAve {

    /* 8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]
     * и 2 значения индексов. Алгоритм возвращает массив, который содержит
     * минимальное значение, максимальное значение, и среднее среди всех
     * значений между 2-мя индексами.
     */

    public int[] minMaxAve(int[] array, int a, int b) {
        int max;
        int min;
        if(a < array.length && b < array.length && a >= 0 && b >= 0) {
            if (array[a] >= array[b]) {
                max = array[a];
                min = array[b];
            } else {
                max = array[b];
                min = array[a];
            }
            int average = (array[a] + array[b]) / 2;
            int[] resultArray = {min, max, average};
            return resultArray;

        }

        int[] resultArrayError = {-1};
        return resultArrayError;

    }
}
