package less04;

public class Task07 {
    public static void main(String[] args) {
        int array [] = new int [50];

        int sumOdd = 0; 
        int sumEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 ==0){
                sumEven = sumEven + array[i];
            }
            else{
                sumOdd = sumOdd + array[i];
            }
        }
    }
}
