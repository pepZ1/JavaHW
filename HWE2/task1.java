package HWE2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.print("Enter float: ");
        System.out.println(inputFloat());


    }
    static float inputFloat() throws InputMismatchException{
        Scanner in = new Scanner(System.in);
        float a = 0.0F;
        while (true){
            try {
                a = in.nextFloat();
                break;
            }catch (InputMismatchException e) {
                System.err.println("Wrong");
                in.next();
            }
        }
        return a;
    }
}