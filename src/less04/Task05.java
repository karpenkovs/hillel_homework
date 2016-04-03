package less04;

public class Task05 {
    public static void main(String[] args) {

        int array [] = new int[100];

        /*for (int j = 0; j < array.length; j++) {
            array[j] = j;
        }*/

        int n = 10;
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            sum = sum + array[i];
        }
        /*System.out.println(sum);*/
    }
}
