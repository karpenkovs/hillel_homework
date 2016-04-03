package less02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the integer number: ");
        int num = sc.nextInt();

        if ((num % 2) == 0) {
            System.out.println("This is even number.");
        } else {
            System.out.println("This is odd number.");
        }
    }
}
