package less05;

public class ArrayMerge {
    public static void main(String[] args) {

        int[] array1 = {1, 5, 6, 9, 9};
        int[] array2 = {5, 7, 10, 18, 22, 99, 100, 612};

        int[] newArray = mergeArray(array1, array2);

        printArray(newArray);
    }

    public static int[] mergeArray(int[] x, int[] y) {

        int[] newArray = new int[x.length + y.length];

        int i = 0;//counter of newArray
        int j = 0;//counter of x array
        int k = 0;//counter of y array
        while (j < x.length & k < y.length) {
            if (x[j] < y[k]) {
                newArray[i] = x[j];
                j++;
                i++;
            } else {
                newArray[i] = y[k];
                k++;
                i++;
            }
        }

        if (j < x.length) {
            while (i < newArray.length) {
                newArray[i] = x[j];
                j++;
                i++;
            }
        } else {
            while (i < newArray.length) {
                newArray[i] = y[k];
                k++;
                i++;
            }
        }

        return newArray;
    }


    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
