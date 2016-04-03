package less02;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the first integer number: ");
        int num1 = sc.nextInt();

        System.out.print("Please, enter the second integer number: ");
        int num2 = sc.nextInt();

        if ((num1 % num2) == 0) {
            System.out.println("The first number divided by the second without a trace.");
        } else {
            System.out.println("The first number divided by the second with the trace.");
        }
    }
}
