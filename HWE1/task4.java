package HWE1;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */
public class task4 {
    public static void main(String[] args) {
        System.out.println(quotientOf(null, null));
    }
    private static int[] quotientOf(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            throw new RuntimeException("One or a little arrays equals null");
        }
        if (array1.length != array2.length) {
            throw new RuntimeException("The lengths arrays not equals");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array1[i] / array2[i];
        }
        return result;
    }
}