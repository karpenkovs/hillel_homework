package less05;

public class Sorting {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 2, 7};

        int[] sortedArray = selectionSort(array);


    }

    public static int[] sort(int[] array) {
        int operations = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                operations++;
            }
        }
        System.out.println("Sort operations: " + operations);
        return array;
    }

    public static int[] insertionSort(int[] array) {
        int operations = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] <= array[j])
                    break;

                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;

                operations++;
            }
        }
        System.out.println("Insertion sort: " + operations);
        return array;
    }

    public static int[] selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min])
                    min = j;
            }

                    int temp = numbers[min];
                    numbers[min] = numbers[i];
                    numbers[i] = temp;
        }
        return numbers;
    }
}
