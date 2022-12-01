package HW4;
/**
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text~num
 * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 * Если ввод не содержит символа ~, то завершает программу с ошибкой.
 * Если введено -1, то выходим
 * <p>
     * string~3
 * java~5
 * print~0 => ""
 * print~3 => string
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (true) {
            System.out.print("Enter command: ");
            String string = scanner.nextLine();
            if (Objects.equals(string, "-1")) return;

            String[] array = string.split("~");
            if (array.length != 2) throw new IllegalArgumentException("Error");

            int index = Integer.parseInt(array[1]);
            if (Objects.equals(array[0], "print")) {
                if (list.size() > index) {
                    System.out.println(">> " + list.get(index));
                    list.add(index, "");
                } else {
                    System.out.println(">>");
                }

            } else {
                while (list.size() < index) list.add("");
                list.add(index, array[0]);
            }
        }
    }
}