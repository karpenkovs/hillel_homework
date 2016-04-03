package less02;

public class Task03 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        int c = 10000;
        int min;

        if (a <= b && a <= c){
            min = a;
        }else if ( b <= a && b <= c){
            min = b;
        }
        else {
            min = c;
        }

        if( min == a){
            System.out.println(a);
        }

        if( min == b){
            System.out.println(b);
        }

        if( min == c){
            System.out.println(c);
        }

    }
}
