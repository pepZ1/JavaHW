package HW4;
// * 0.1) Написать метод, который принимает массив элементов,
//  помещает их в стэк и выводит на консоль содержимое стэка.
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 3, 7 };

        stack(array);
    }

    static void stack(int[] arr) {
        LinkedList<Integer> newStack = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            newStack.add(arr[i]);
        }
        System.out.println(newStack);
    }
    
}