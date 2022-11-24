package HW2;

import java.util.Scanner;

public class task{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите слово или предложение: ");
        String word = iScanner.nextLine();
        iScanner.close();
        boolean result = palindrome(word);
        System.out.println(result);
    }

    static boolean palindrome(String str) {
        String str1 = str.replaceAll("\\W", "");
        str1 = str1.toLowerCase(); 
        for (int i = 0; i < str1.length() / 2; i++) {
            if (str1.charAt(i) != str1.charAt(str1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}