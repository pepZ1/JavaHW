package HWE1;

import java.util.Arrays;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. Вместо массива может прийти null (обработать)
 */
public class task3 {
    private static int[] difference(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            NullPointerException exception = new NullPointerException();
            exception.printStackTrace();
            System.out.println("NullPointerException: One or a little arrays equals null");
            return null;
        }
        if (array1.length != array2.length) {
            System.out.println("The lengths arrays not equals");
            return null;
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }
}