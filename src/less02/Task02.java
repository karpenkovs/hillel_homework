package less02;

public class Task02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 100;
        int min,max;

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

        if (a >= b && a >= c){
            max = a;
            System.out.println(max);
        }else if ( b >= a && b >= c){
            max = b;
            System.out.println(max);
        }
        else {
            max = c;
            System.out.println(max);
        }
    }
}
