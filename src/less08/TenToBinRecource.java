package less08;

import java.util.Scanner;

public class TenToBinRecource {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(tenToBin(num));
    }

    public static String tenToBin(int n) {
        String numBin;

        if (n < 0) {
            numBin = "1";
            n = Math.abs(n);
        } else {
            numBin = "";
        }


        if (n != 0) {
            numBin = numBin + tenToBin(n / 2) + Integer.toString(n % 2);
            return numBin;
        } else {
            return numBin;
        }
    }
}
