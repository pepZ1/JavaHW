// Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите 1-е целое число: ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Введите 2-е целое число: ");
        int b = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        boolean result = checkSum(a, b);
        System.out.println(result);
    }

    static boolean checkSum(int x, int y) {
        if (x + y >= 10 && x + y <= 20) {
            return true;
        } else {
            return false;
        }
    }
}