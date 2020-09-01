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
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void set(int index, T element) {
        array[index] = element;
        size++;
    }

    private boolean checkSize() {
        return size == array.length;
    }

    private void increaseSize() {
        tempArray = new Object[(array.length * 3) / 2 + 1];
        System.arraycopy(array, 0, tempArray, 0, size);
        array = new Object[(array.length * 3) / 2 + 1];
        System.arraycopy(tempArray, 0, array, 0, size);
    }

    private void shiftingArray(int index) {
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
        shiftingArray(index);
        array[index] = element;
        size++;
    }

    public void remove(int index) {
        if (index != size) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
        }
        array[size - 1] = null;
        size--;
    }

    public boolean removeAll(MyArrayList<T> list) {
        for (int i = 0; i < getSize(); i++) {
            if (list.contains(array[i])) {
                remove(i);
            }
        }
        return true;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < getSize(); i++) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    //Debug check

    public static MyArrayList<Integer> testList(int initialCapacity) {
        MyArrayList<Integer> array = new MyArrayList<Integer>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            array.add(i);
        }
        return array;
    }

    public static void showList(MyArrayList<Integer> array) {
        for (int i = 0; i < array.getSize(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println("");
    }

    public static void showSize(String msg, MyArrayList<Integer> array) {
        System.out.println(msg + " " + array.getSize());
    }

    public static void debugCheck(MyArrayList<Integer> array) {
        System.out.println("\n" + "Size: " + array.getSize());
//        System.out.println("Added number: 666");
        array.remove(5);
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
