package less04;

public class Task08 {
    public static void main(String[] args) {

        int count = 0;

/*
        for (int i = 100000; i <= 999999; i++) {

            int sumFirst = 0;
            int sumLast = 0;
            String text = Integer.toString(i);

            for (int j = 0; j < (text.length()/2) ; j++) {
                sumFirst = sumFirst + (int)(text.charAt(j));
            }

            for (int k = (text.length()/2); k < text.length(); k++) {
                sumLast = sumLast + (int)(text.charAt(k));
            }

           if (sumFirst == sumLast){
               count++;
               System.out.println(count + " - " + i);
           }
        }
*/

        int sumFirst = 0;
        int sumLast = 0;

        for (int i = 100000; i <= 999999 ; i++) {

            sumLast = (i % 10) + ((i / 10) % 10) + ((i / 100) % 10);
            sumFirst = ((i / 1000) % 10) + ((i / 10000) % 10) + ((i / 100000) % 10);

            if(sumFirst == sumLast ){
                count++;
                System.out.println(count + " - " + i);
            }
        }

    }
}
