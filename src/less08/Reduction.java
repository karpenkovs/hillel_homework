package less08;

import java.util.Scanner;

public class Reduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] arrayWords = text.split(" ");

        arrayWords = cycleArray(arrayWords);

        printArray(arrayWords);

    }


    public static String reduction(String str) {

        int lengthStr = str.length();

        if (lengthStr >= 4) {

            char first = str.charAt(0);
            int num = lengthStr - 2;
            char last = str.charAt(lengthStr - 1);

            str = str.valueOf(first) + str.valueOf(num) + str.valueOf(last);
            return str;
        } else {
            return str;
        }
    }


    public static String[] cycleArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = reduction(array[i]);
        }
        return array;
    }


    public static void printArray(String array[]) {
        for (String i : array) {
            System.out.print(i + " ");
        }
    }
}
