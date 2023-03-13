import project_utils.Utils;

public class MinMaxAve {

    /* 8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]
     * и 2 значения индексов. Алгоритм возвращает массив, который содержит
     * минимальное значение, максимальное значение, и среднее среди всех
     * значений между 2-мя индексами.
     */

    public int[] minMaxAve(int[] array, int a, int b) {
        if(Utils.checkNullArrayInt(array) && Utils.checkEmptyArrayInt(array)
                && (a < array.length && b < array.length && a >= 0 && b >= 0)) {
            if(a > b) {
                int temp;
                temp = a;
                a = b;
                b = temp;
            }

            int sum = 0;
            int count = 0;
            int max = array[a];
            int min = array[a];

            for(int i = a; i <= b; i++) {
                count++;
                sum += array[i];

                if(array[i] < min) {
                    min = array[i];
                } else {
                    max = array[i];
                }
            }

            int average = Math.round(sum / count);
            return new int[] {min, max, average};

        }

        return new int[0];

    }
}
