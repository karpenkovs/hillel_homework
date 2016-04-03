package less03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter one of operations(add, subtraction, multiply, divide): ");
            String operator = sc.nextLine();

            System.out.println("Enter the fist number: ");
            int a = sc.nextInt();

            System.out.println("Enter the second number: ");
            int b = sc.nextInt();

            switch (operator) {
                case "add":
                    System.out.println(Math.addExact(a, b));
                    break;
                case "subtraction":
                    System.out.println(Math.subtractExact(a, b));
                    break;
                case "multiply":
                    System.out.println(Math.multiplyExact(a, b));
                    break;
                case "divide":
                    double div = (double) a / b;
                    System.out.println(div);
                    break;
            }
        }
    }
}
