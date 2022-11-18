// Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите целое число: ");
        int number = Integer.parseInt(iScanner.nextLine());
        iScanner.close();
        positiveOrNegative(number);
    }

    static void positiveOrNegative(int n){
        if (n >= 0){
            System.out.println("Вы ввели положительное число."); 
        }
        else{
            System.out.println("Вы ввели отрицательное число.");
        }
    }
}