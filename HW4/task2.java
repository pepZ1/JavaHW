package HW4;
// * 0.2) Написать метод, который принимает массив элементов,
//  помещает их в очередь и выводит на консоль содержимое очереди.
import java.util.ArrayDeque;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {

        int[] array = { 1, 3, 3, 7 };

        queue(array);
    }

    static void queue(int[] arr) {
        Queue<Integer> newQueue = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            newQueue.add(arr[i]);
        }
        System.out.println(newQueue);
    }
}