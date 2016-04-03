package less02;

public class Task01 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int c = 10;
        int min;

        if (a <= b && a <= c){
            min = a;
            System.out.println(min);
        }else if ( b <= a && b <= c){
            min = b;
            System.out.println(min);
        }
        else {
            min = c;
            System.out.println(min);
        }

    }
}
