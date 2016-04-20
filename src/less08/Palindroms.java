package less08;

import java.util.Scanner;

public class Palindroms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] arrayWords = text.split(",");

        arrayWords = trimArray(arrayWords);

        System.out.println("There are " + checkPalindroms(arrayWords) + " palindromes in the text");
    }

    public static String[] trimArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return array;
    }

    public static int checkPalindroms(String[] array) {

        int count = 0;
        int n;
        int len;

        for (int i = 0; i < array.length; i++) {

            n = array[i].length() - 1;
            len = array[i].length() / 2;

            for (int j = 0; j < len; j++) {
                if ((array[i].charAt(j)) == array[i].charAt(n)) {
                    n--;
                    if (j + 1 == len) count++;
                } else {
                    break;
                }

            }

        }
        return count;
    }
}
