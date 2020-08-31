package best.com;

import javax.swing.text.DefaultEditorKit;
import java.util.Date;

public class MyArrayList<T> {

    private Object[] array, tempArray;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ARRAY = {};
    private int size;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            array = new Object[initialCapacity];
        } else {
            array = EMPTY_ARRAY;
        }
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void set(int index, T element) {
        array[index] = element;
        size++;
    }

    public boolean checkSize() {
        return size == array.length;
    }

    public void increaseSize() {
        tempArray = new Object[(array.length * 3) / 2 + 1];
        System.arraycopy(array, 0, tempArray, 0, size);
        array = new Object[(array.length * 3) / 2 + 1];
        System.arraycopy(tempArray, 0, array, 0, size);
    }

    public void shiftArray(int index) {
        tempArray = array;
        if (index == 0) {
            System.arraycopy(array, 0, tempArray, 1, size);
        } else if ((index > 0) && (index <= size)) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
    }

    public void add(T element) {
        if (checkSize()) {
            increaseSize();
        }
        array[size] = element;
        size++;

    }

    public void add(int index, T element) {
        if (checkSize()) {
            increaseSize();
        }
        shiftArray(index);
        array[index] = element;
        size++;
    }

    //Debug check

//    public

    public static void debugCheck(MyArrayList<Integer> array) {
        System.out.println("Initial size: " + array.getSize());
        for (int i = 0; i < array.array.length; i++) {
            array.set(i, i + 1);
            System.out.print(array.get(i) + " ");
        }
        System.out.println("\n" + "Size: " + array.getSize());
        System.out.println("Added number: 666");
        array.add(4, 777);
        System.out.println("New size: " + array.getSize());
        for (int i = 0; i < array.array.length; i++) {
            System.out.print(array.get(i) + " ");
        }
    }

    //Setters & Getters
    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }

    public static Object[] getEmptyArray() {
        return EMPTY_ARRAY;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
