package best.com;

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
        size = array.length;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void set(int index, T element) {
        array[index] = element;
    }

    public void add(T element) {
        tempArray = new Object[size + 1];
        System.arraycopy(array, 0, tempArray, 0, size);
        size++;
        array = new Object[size];
        System.arraycopy(tempArray, 0, array, 0, size);
        array[size - 1] = element;
    }

    public void add(int index, T element) {
        //Under construction
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
