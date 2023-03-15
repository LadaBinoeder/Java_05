import project_utils.Utils;

import java.util.Arrays;

public class CreateArray {

    /* 1. Написать метод createIntArray(), который принимает на вход 5 целых
     * чисел,  и возвращает массив из этих же чисел.
     */
    public int[] createIntArray(int a, int b, int c, int d, int e) {

        int[] array = new int[]{a, b, c, d, e};
        return array;

    }

    /* 2. Написать метод createDoubleArray(), который принимает на вход 5 чисел
     * типа double, и возвращает массив из этих же чисел
     */

    public double[] createDoubleArray(double a, double b, double c, double d, double e) {

        double[] array = new double[]{a, b, c, d, e};
        return array;

    }

    /* 3. Написать метод createStringArray(), который принимает на вход 5 слов,
     * и возвращает массив из этих слов
     */

    public String[] createStringArray(String a, String b, String c, String d, String e) {

        String[] array = new String[]{a, b, c, d, e};
        return array;

    }

    /* 4. Написать метод createArrayFromText(), который принимает на вход
     * предложение из нескольких слов и возвращает массив из этих слов.
     */

    public String[] createArrayFromText(String a) {

        String[] array = a.split(" ");
        return array;

    }

    /* 1. В классе CreateArray написать метод createIntArrayFromText(), который
     * принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”) и возвращает
     *  массив типа int[] из этих чисел. (можно использовать split() или
     * toCharArray())
     */
    public int[] createIntArrayFromText(String number) {
        if(number != null && number != "") {
            String[] str = number.split(" ");
            int[] array = new int[str.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Double.parseDouble(str[i]));
            }
            return array;

        }
        return new int[0];

    }

    /* 5. Написать метод multiplesOf(), который принимает на вход целое
     * положительное число number в пределах от 1 включительно до 10 включительно,
     * и возвращает таблицу умножения на это число в виде массива
     */

    public int[] multiplesOf(int number) {
        if (number > 0 && number < 11) {
            int[] array = new int[11];
            for (int i = 0; i < array.length; i++) {
                array[i] = number * i;
            }
            return array;

        }
        int[] array = new int[0];
        return array;

    }

    /* 1. написать метод getPhoneNumberAndCountry(), который принимает массив
     * из 11 целых положительных чисел от 0 до 9, и возвращает массив, который
     * содержит номер телефона, состоящий из этих чисел, и название страны,
     * которой номер принадлежит.
     */

    public String[] getPhoneNumberAndCountry(int[] phoneNumber) {
        if (phoneNumber.length == 11) {
            String[] resultArray = new String[2];
            resultArray[0] = Integer.toString(phoneNumber[0]);
            for (int i = 1; i < phoneNumber.length; i++) {
                resultArray[0] += Integer.toString(phoneNumber[i]);
            }
            if (phoneNumber[0] == 1 && phoneNumber[1] == 8 && phoneNumber[2] == 0
                    && phoneNumber[3] == 0) {
                resultArray[1] = "USA";
            } else if (phoneNumber[0] == 4 && phoneNumber[1] == 9) {
                resultArray[1] = "Deutschland";
            } else {
                resultArray[1] = "Unbekanntes Land";
            }

            return resultArray;
        }
        String[] resultArray = {"Das ist keine Telefonnummer. Bitte geben Sie "
                + "eine Telefonnummer bestehend aus 11 Ziffern ein"};
        return resultArray;

    }

    /* 2. Написать метод createUniqueArray(), который принимает массив целых
     * положительных чисел больше 0, и возвращает массив уникальных чисел.
     */

//    public int[] createUniqueArray(int[] array) {
//        int lengthUnique = array.length;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    lengthUnique--;
//                }
//            }
//        }
//        System.out.println(lengthUnique);
//    }

//        int result = 0;
//        int countUnique = 0;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            countUnique++;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[j] == array[i]) {
//                    count++;
//                }
//            }
//        }
//        return result = countUnique - count;

//        temp = array[0];
//        int index = 0;
//        int[] uniqueArray = new int[length];
//        for(int i = 0; i < uniqueArray.length; i++) {
//            if(array[i] != temp) {
//                uniqueArray[0] = array[i];
//                index++;
//            }
//        }


//        // test if all the elements are valid
//        for(int i = 0; i < array.length; i++) {
//            if(array[i] <= 0) {
//                return [-1];
//            }
        }


