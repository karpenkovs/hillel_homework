package less07;

public class TrianglePascal {

    public static void main(String[] args) {

        int[][] triangle = new int[7][15];
        triangle = initializationArray(triangle);
        printArray(triangle);
    }

    public static int[][] initializationArray(int array[][]) {

        int i = 0;
        int j = array[i].length / 2;
        int jStart = j;
        int n = 2;
        int count;

        array[i][j] = 1;
        i++;

        while (i < array.length) {

            count = 0;
            j = jStart = jStart - 1;

            while (count < n) {

                array[i][j] = array[i - 1][j - 1] + array[i - 1][j + 1];
                j = j + 2;
                count++;
            }

            i++;
            n++;

        }
        return array;
    }

    public static void printArray(int array[][]){

        for (int a = 0; a < array.length; a++) {

            for (int b = 0; b < array[a].length; b++) {

                if (checkLength(array[a][b]) == 2) {
                    System.out.print(" " + array[a][b]);
                }
                else if (checkZero(array[a][b])) {
                    System.out.print("   ");
                }
                else {
                    System.out.print(" " + array[a][b] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int checkLength(int num){
        return (Integer.toString(num)).length();
    }

    public static boolean checkZero(int num){
        return num == 0;
    }
}

