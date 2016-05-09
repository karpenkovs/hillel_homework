package less13;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        List list = new ArrayList();
        String abc = "abcdefghij";
        for (int i = 0; i < abc.length(); i++) {

            list.add(new String(new char[]{abc.charAt(i)}));
        }

        System.out.println("Forward iterator: ");

        Iterator it = list.listIterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }

        System.out.println();
        System.out.println("Backward iterator: ");

        Iterator bit = list.backwardIterator();
        while (bit.hasNext()) {
            System.out.println("Element: " + bit.next());
        }

        System.out.println();
        System.out.println("Random iterator:");

        Iterator rit = list.randomIterator();
        while (rit.hasNext()){
            System.out.println("Element: " + rit.next());
        }

        System.out.println();
        System.out.println(list);
    }
}
