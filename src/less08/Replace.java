package less08;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adress = sc.nextLine();

        adress = adress.replace("@", "[at]");
        adress = adress.replace(".", "[dot]");

        System.out.println(adress);
    }
}
