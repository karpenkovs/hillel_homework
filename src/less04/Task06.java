package less04;

public class Task06 {
    public static void main(String[] args) {
        int array[] = {99, 65, 12651, -99532, 1, 0, -36, 108, 638, -5502};
        int min = 2147483647;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        int max = -2147483648;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
    }
}
