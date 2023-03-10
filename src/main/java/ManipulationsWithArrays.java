public class ManipulationsWithArrays {

    /* 5. Написать метод multipleArrayByNumber(), который принимает на вход
     * массив целых чисел и число int number. Метод возвращает массив тех же
     * чисел, умноженных на number
     */

    public int[] multipleArrayByNumber(int[] array, int number) {
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] * number;
        }

        return array;
    }

    /* 6. Написать метод toDoubleArray(), который принимает на вход массив целых
     * чисел, и возвращает массив типа double[] из тех же чисел
     */

    public double[] toDoubleArray(int[] array) {
        double[] resultArray = new double[array.length];
        for(int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];
        }
        return resultArray;

    }

    /* 7. Написать метод toIntArray(), который принимает на вход массив типа
     * double[],  и возвращает массив типа int[] из тех же чисел
     */

    public int[] toIntArray(double[] array) {
        int[] resultArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            resultArray[i] = (int) (array[i]);
        }
        return resultArray;

    }

    /* 8. Написать метод toStringArray(), который принимает на вход массив целых
     * чисел,  и возвращает массив типа String[] из тех же чисел (желательно не
     * использовать метод .toString(), нужно переводить вручную)
     */

    public String[] toStringArray(int[] array) {
      String[] resultArray = new String[array.length];
        for(int i = 0; i < array.length; i++) {
          resultArray[i] = array[i] + "";
        }
        return resultArray;

    }

    /* 9. Перегрузить метод toStringArray() параметром double[]. Этот метод
     * должен возвращать массив типа String[] (желательно не использовать метод
     * .toString(), нужно переводить вручную)
     */

    public String[] toStringArray(double[] array) {
        String[] resultArray = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            resultArray[i] = array[i] + "";
        }
        return resultArray;

    }

    /* 12. Написать метод areValuesGreaterThanNumber(), который принимает на
     * вход массив целых чисел и число number. Метод возвращает значение true,
     * если все элементы массива больше number, иначе возвращает false
     */

    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        int count = 0;
        if(array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= number) {
                    count++;
                }
            }
            if (count == 0) {
                return true;

            }
        }
        return false;

    }

}
