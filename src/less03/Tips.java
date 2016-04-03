package less03;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the level of service\n" +
                "(- terrible\n" + //0%
                " - poor\n" +  //5%
                " - good \n" + //10%
                " - great\n" +  //15%
                " - excellent)\n" +  //20%
                "and sum $ which you spent. In one string through 'space'. ");

        String userEnter = sc.nextLine();

        String [] arrayString = userEnter.split(" ");

        switch (arrayString[0]){
            case "terrible":
                System.out.println("You will must pay " + (arrayString[1]) + "$");
                break;

            case "poor":
                System.out.println("You will must pay " + (Integer.parseInt(arrayString[1]) * 1.05) + "$");
                break;

            case "good":
                System.out.println("You will must pay " + (Integer.parseInt(arrayString[1]) * 1.1) + "$");
                break;

            case "great":
                System.out.println("You will must pay " + (Integer.parseInt(arrayString[1]) * 1.15) + "$");
                break;

            case "excellent":
                System.out.println("You will must pay " + (Integer.parseInt(arrayString[1]) * 1.2) + "$");
                break;
        }

    }
}
