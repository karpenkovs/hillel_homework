package less04;

public class Task10 {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - i;
        }

        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }*/

        array = sortBubble(array);
        printFirst5(array);
    }

     public static int[] sortBubble(int[] arr){

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void printFirst5 (int [] arr){
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}
