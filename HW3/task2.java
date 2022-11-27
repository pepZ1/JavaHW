package HW3;
/* Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее из этого списка. */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> Maxminave = new ArrayList<Integer>();
        Maxminave.addAll(Arrays.asList(2, 5, 5, 2, 31, 13, 37));
        System.out.println(Maxminave);

        double sum = 0;
        for (int i = 0; i < Maxminave.size(); i++) {
            sum += Maxminave.get(i);
        }

        System.out.println("Minimum value: " + Collections.min(Maxminave));
        System.out.println("Maximum value: " + Collections.max(Maxminave));
        System.out.printf("Average value: %.1f", sum / Maxminave.size());
    }
}