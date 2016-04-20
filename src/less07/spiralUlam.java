package less07;

public class SpiralUlam {
    public static void main(String[] args) {

        int[][] spiral = new int[6][6];

        int i = 2;
        int j = 2;
        int num = 1;
        int n = 1;
        int count = 0;

        while (i >= 0 & i <= 5 & j >= 0 & j <= 5) {

            while (count < n & i >= 0 & i <= 5 & j >= 0 & j <= 5) {
                spiral[i][j] = num;
                i++;
                num++;
                count++;
            }
            count = 0;

            while (count < n & i >= 0 & i <= 5 & j >= 0 & j <= 5) {
                spiral[i][j] = num;
                j++;
                num++;
                count++;
            }
            count = 0;
            n++;

            while (count < n & i >= 0 & i <= 5 & j >= 0 & j <= 5) {
                spiral[i][j] = num;
                i--;
                num++;
                count++;
            }
            count = 0;

            while (count < n & i >= 0 & i <= 5 & j >= 0 & j <= 5) {
                spiral[i][j] = num;
                j--;
                num++;
                count++;
            }
            count = 0;
            n++;

        }

        for (int a = 0; a < spiral.length; a++) {
            for (int b = 0; b < spiral[a].length; b++) {

                if ((Integer.toString(spiral[a][b])).length() == 1) {
                    System.out.print(" " + spiral[a][b] + " ");
                } else {
                    System.out.print(spiral[a][b] + " ");
                }
            }
            System.out.println();
        }
    }
}
