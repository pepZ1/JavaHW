package HW4;
// * 1 Пусть дан LinkedList с несколькими элементами.
//  Реализуйте метод, который вернет “перевернутый” список.
import java.util.Deque;
import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < 10; i++) deque.add(i);
        System.out.println(deque);
        System.out.println(turnList(deque));
    }

    private static Deque<Integer> turnList(Deque<Integer> deque) {
        Deque<Integer> result = new LinkedList<>();
        while (!deque.isEmpty()) result.add(deque.removeLast());
        return result;
    }
}