package HWE2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        String strEmpty = "";
        isNotEmpty(strEmpty);
    }
    public static void isNotEmpty(String string){
        if (string.isEmpty()){
            throw new RuntimeException("The String cannot be empty.");
        }
    }
}