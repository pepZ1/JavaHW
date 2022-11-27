package HW3;
/*1. Пусть дан произвольный список целых чисел, удалить из него четные числа*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {

    public static void main(String[] args) {

        List<Integer> Argoray = new ArrayList<Integer>();
        Argoray.addAll(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6));
        System.out.println(Argoray);

        for (int i = 0; i < Argoray.size(); i++) {

            if (Argoray.get(i) % 2 == 0) {
                Argoray.remove(i);
                i--;
            }
        }
        System.out.print(Argoray);
    }
}