package less02;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the first integer number: ");
        int num1 = sc.nextInt();

        System.out.print("Please, enter the second integer number: ");
        int num2 = sc.nextInt();

        int result1 = num1 - 10;
        int result2 = num2 - 10;

        if(Math.abs(result1) < Math.abs(result2)){
            System.out.println(num1 + " is closer to 10.");
        }else if(Math.abs(result1) > Math.abs(result2)){
            System.out.println(num2 + " is closer to 10.");
        }else{
            System.out.println(num1 + " and " + num2 + " is equidistant from 10.");
        }
    }
}
