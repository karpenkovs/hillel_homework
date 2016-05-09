package less13;

import java.util.Iterator;
import java.util.Random;

public class ArrayList implements List {

    private static final int INITIAL_CAPACITY = 10;

    private String[] array;

    private int size;

    ArrayList() {
        this(INITIAL_CAPACITY);

    }

    ArrayList(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }

    public boolean contains(String element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void add(String element) {
        resize();
        array[size] = element;
        size++;
    }

    private void resize() {
        if (size == array.length) {
            String[] arrayNew = new String[array.length * 2];
            for (int i = 0; i < size; i++) {
                arrayNew[i] = array[i];
            }
            array = arrayNew;
        }

        if (size < 0.25 * array.length) {
            String[] arrayNew = new String[array.length / 2];
            for (int i = 0; i < size; i++) {
                arrayNew[i] = array[i];
            }
            array = arrayNew;
        }
    }

    public String set(int index, String element) {
        String oldElement = array[index];
        array[index] = element;
        return oldElement;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        resize();
    }

    public void remove(String element) {
    }

    public void clear() {
    }

    public int indexOf(String element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public String get(int index) {
        return array[index];
    }

    public String toString() {
        String elements = "[ ";
        for (int i = 0; i < size; i++) {
            elements += array[i];
            if (i != size - 1) {
                elements += ", ";
            }
        }
        elements += " ]";
        return elements;
    }

    public Iterator listIterator() {
        return new ListIterator();
    }

    public Iterator backwardIterator() {
        return new BackwardListIterator(array, size);
    }

    public Iterator randomIterator() {
        return new RandomIterator();
        //return new RandomIterator(array);
    }

    private class ListIterator implements Iterator {

        private int current = 0;

        public boolean hasNext() {
            if (current < size) {
                return true;
            }

            return false;
        }

        public Object next() {
            String element = array[current];
            current++;
            return element;
        }
    }

    private class RandomIterator implements Iterator {

        private Random random = new Random();
        private String[] randomArray;
        int current;
        int index;
        String str;

        RandomIterator() {
            current = size;
            randomArray = new String[current];

            for (int i = 0; i < current; i++) {
                randomArray[i] = array[i];
            }

        }

       /* RandomIterator(String[] arr) {
            current = size;
            randomArray = arr;
        }*/

        @Override
        public boolean hasNext() {
            if (current > 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            index = random.nextInt(current);
            str = randomArray[index];
            overwriteRandomArray(index);
            current--;
            return str;
        }

        private void overwriteRandomArray(int index) {

            for (int i = index; i < current - 1; i++) {
                randomArray[i] = randomArray[i + 1];
            }


        }


    }

}
