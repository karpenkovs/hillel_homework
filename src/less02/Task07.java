package less02;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The apartment price is 40$/day.\n" +
                "If you want rent the apartment more 4 days, you will have the discount which is the 20$\n" +
                "If you want rent the apartment more 7 days, you will have the discount which is the 50$\n" +
                "Please, enter how much days you want rent the apartment.");
        int days = sc.nextInt();

        int cost = days * 40;

        if(days > 7){
            cost = cost - 50;
        }else if(days > 4){
            cost = cost - 20;
        }

        System.out.println("Rental cost for " + days + " days is " + cost + "$.");
    }
}
