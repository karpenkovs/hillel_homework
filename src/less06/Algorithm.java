package less06;

public class Algorithm {
    public static void main(String[] args) {
        int k = 0;
        int n = 12;
        for (int i = 0; i < n; i++) {
            for (int j = i ; j < n; j++) {
                for (int z = j ; z < n; z++) {
                    k++;
                }
            }
        }
        System.out.println("The result is " + k);
    }
}

