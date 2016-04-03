package less04;

public class Task09 {
    public static void main(String[] args) {
        int num = 71;
        String numDouble = "";

        while (num != 0) {
            numDouble = numDouble + Integer.toString(num % 2);
            num = num / 2;
        }

        StringBuilder sBuilder = new StringBuilder(numDouble);
        System.out.println(sBuilder.reverse());
    }
}
